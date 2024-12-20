package ila.casino;

import com.sun.tools.javac.Main;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import javafx.application.Platform;

import javax.sound.sampled.*;

public class HelloApplication extends Application {

    private Text resultText;
    private Label balanceLabel;
    private Label balanceSlotLabel;
    private int balance = 100;
    private Button spinSlotButton;
    private TextArea betAmountSlotTextArea;
    private int betAmountSlot;
    private Label currentBetAmount;
    private ImageView[] reels = new ImageView[3];
    private Scene mainScene, slotScene, rouletteScene;
    private Button spinRouletteButton;
    private TextArea betAmountRouletteTextArea;
    private int betAmountRoulette;
    private ImageView rouletteWheel;
    private TextArea betRouletteTextArea;
    private String betRoulette;
    private Label currentBetAmountLabel;
    private Label currentBetLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Casino Spiele");

        VBox mainMenu = new VBox(20);
        mainMenu.setStyle("-fx-background-color: linear-gradient(to bottom, #0f0f0f, #ff0000); -fx-padding: 20px;");
        mainMenu.setAlignment(javafx.geometry.Pos.CENTER);

        Text welcomeText = new Text("Willkommen im Casino!");
        welcomeText.setFill(Color.WHITE);
        welcomeText.setFont(Font.font("Arial", 24));

        Button slotButton = new Button("Slot Spiel starten");
        slotButton.setStyle("-fx-background-color: #ffcc00; -fx-font-size: 16px; -fx-text-fill: #000;");
        slotButton.setOnAction(e -> primaryStage.setScene(slotScene));

        Button rouletteButton = new Button("Roulette Spiel starten");
        rouletteButton.setStyle("-fx-background-color: #ff0000; -fx-font-size: 16px; -fx-text-fill: #fff;");
        rouletteButton.setOnAction(e -> primaryStage.setScene(rouletteScene));

        mainMenu.getChildren().addAll(welcomeText, slotButton, rouletteButton);
        mainScene = new Scene(mainMenu, 600, 500);

        slotScene = createSlotScene(primaryStage);

        rouletteScene = createRouletteScene(primaryStage);

        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    private Scene createSlotScene(Stage primaryStage) {
        VBox layout = new VBox(10);
        layout.setStyle("-fx-background-color: linear-gradient(to bottom, #0f0f0f, #ff0000); -fx-padding: 20px;");
        layout.setAlignment(javafx.geometry.Pos.CENTER);

        resultText = new Text("Drücke 'Spin', um zu starten!");
        resultText.setFill(Color.WHITE);
        resultText.setFont(Font.font("Arial", 18));

        balanceSlotLabel = new Label("Kontostand: CHF " + balance);
        balanceSlotLabel.setTextFill(Color.WHITE);
        balanceSlotLabel.setFont(Font.font("Arial", 16));

        GridPane reelPane = new GridPane();
        reelPane.setHgap(20);
        reelPane.setAlignment(javafx.geometry.Pos.CENTER);
        for (int i = 0; i < 3; i++) {
            ImageView reel = new ImageView(new Image("file:resources/spin1.jpeg"));
            reel.setFitWidth(100);
            reel.setFitHeight(100);
            reels[i] = reel;
            reelPane.add(reel, i, 0);
        }

        betAmountSlotTextArea = new TextArea("5");
        betAmountSlotTextArea.setMaxWidth(100);
        betAmountSlotTextArea.setMaxHeight(30);
        betAmountSlot = Integer.parseInt(betAmountSlotTextArea.getText());

        Button betAmountConfirm = new Button("Einsatz bestätigen");
        betAmountConfirm.setOnAction(event -> confirmSlotBetAmount());
        betAmountConfirm.setStyle("-fx-background-color: #ffcc00; -fx-font-size: 14px; -fx-text-fill: #000;");

        currentBetAmount = new Label("Aktueller Einsatz: 5");
        currentBetAmount.setTextFill(Color.WHITE);
        currentBetAmount.setFont(Font.font("Arial", 16));

        spinSlotButton = new Button("Spin");
        spinSlotButton.setStyle("-fx-background-color: #ff0000; -fx-font-size: 16px; -fx-text-fill: #fff; -fx-padding: 10px 20px;");
        spinSlotButton.setOnAction(event -> spinSlot());

        Button backButton = new Button("Zurück zum Hauptmenü");
        backButton.setStyle("-fx-background-color: #009ffd; -fx-font-size: 14px; -fx-text-fill: #fff;");
        backButton.setOnAction(e -> primaryStage.setScene(mainScene));

        TitledPane instructionsPane = new TitledPane();
        instructionsPane.setText("?"); // Kleines Fragezeichen
        instructionsPane.setCollapsible(true);
        instructionsPane.setExpanded(true);

        Label instructionsText = new Label(
                "1. Wähle deinen Einsatz.\n" +
                        "2. Drücke 'Einsatz bestätigen', um den Einsatz zu setzen.\n" +
                        "3. Drücke 'Spin', um die Walzen zu drehen.\n" +
                        "4. Gewinne, wenn die Symbole übereinstimmen!"
        );
        instructionsText.setWrapText(true);
        instructionsText.setTextFill(Color.BLACK);
        instructionsPane.setContent(instructionsText);

        layout.getChildren().addAll(resultText, reelPane, balanceSlotLabel, betAmountSlotTextArea, betAmountConfirm, currentBetAmount, spinSlotButton, backButton, instructionsPane);
        return new Scene(new StackPane(layout), 600, 600);
    }

    private Scene createRouletteScene(Stage primaryStage) {
        VBox layout = new VBox(20);
        layout.setStyle("-fx-background-color: linear-gradient(to bottom, #0f0f0f, #ff0000); -fx-padding: 20px;");
        layout.setAlignment(javafx.geometry.Pos.CENTER);

        Text title = new Text("Roulette Spiel");
        title.setFill(Color.WHITE);
        title.setFont(Font.font("Arial", 24));

        Button backButton = new Button("Zurück zum Hauptmenü");
        backButton.setStyle("-fx-background-color: #009ffd; -fx-font-size: 14px; -fx-text-fill: #fff;");
        backButton.setOnAction(e -> primaryStage.setScene(mainScene));

        resultText = new Text("Drücke 'Spin', um zu starten!");
        resultText.setFill(Color.WHITE);
        resultText.setFont(Font.font("Arial", 18));

        balanceLabel = new Label("Kontostand: CHF " + balance);
        balanceLabel.setTextFill(Color.WHITE);
        balanceLabel.setFont(Font.font("Arial", 16));

        Label betAmountInfo = new Label("Einsatz: ");
        betAmountInfo.setStyle("-fx-font-size: 14px; -fx-text-fill: #fff;");

        betAmountRouletteTextArea = new TextArea("5");
        betAmountRouletteTextArea.setMaxWidth(100);
        betAmountRouletteTextArea.setMaxHeight(30);

        currentBetAmountLabel = new Label("Aktueller Einsatz: 5");
        currentBetAmountLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #fff;");

        HBox betAmountBox = new HBox(10, betAmountInfo, betAmountRouletteTextArea, currentBetAmountLabel);
        betAmountBox.setAlignment(javafx.geometry.Pos.CENTER);

        Label betInfo = new Label("Wette: ");
        betInfo.setStyle("-fx-font-size: 14px; -fx-text-fill: #fff;");

        betRouletteTextArea = new TextArea("5");
        betRouletteTextArea.setMaxWidth(100);
        betRouletteTextArea.setMaxHeight(30);

        currentBetLabel = new Label("Aktuelle Wette: 5");
        currentBetLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: #fff;");

        HBox betBox = new HBox(10, betInfo, betRouletteTextArea, currentBetLabel);
        betBox.setAlignment(javafx.geometry.Pos.CENTER);

        spinRouletteButton = new Button("Spin");
        spinRouletteButton.setStyle("-fx-background-color: #ff0000; -fx-font-size: 14px; -fx-text-fill: #fff;");
        spinRouletteButton.setOnAction(e -> spinRoulette());

        rouletteWheel = new ImageView(new Image("file:resources/roulette-wheel.jpg"));
        rouletteWheel.setFitWidth(200);
        rouletteWheel.setFitHeight(200);

        TitledPane instructionsPane = new TitledPane();
        instructionsPane.setText("?");
        Label instructionsText = new Label(
                "1. Wähle deinen Einsatz.\n" +
                        "2. Gib deine Wette ein (Zahlen von 0-36, schwarz, rot, grün).\n" +
                        "3. Drücke 'Spin', um das Roulette zu drehen.\n" +
                        "4. Gewinne basierend auf deiner Wette!"
        );
        instructionsText.setTextFill(Color.BLACK);
        instructionsPane.setContent(instructionsText);
        instructionsPane.setCollapsible(true);
        instructionsPane.setExpanded(true);

        HBox instructionsAndWheelBox = new HBox(20, instructionsPane, rouletteWheel);
        instructionsAndWheelBox.setAlignment(javafx.geometry.Pos.CENTER);

        layout.getChildren().addAll(
                title,
                resultText,
                balanceLabel,
                instructionsAndWheelBox,
                spinRouletteButton,
                betBox,
                betAmountBox,
                backButton
        );

        return new Scene(layout, 600, 650);
    }


    private void spinSlot() {
        if (balance <= 0) {
            resultText.setText("Kein Geld mehr übrig!");
            return;
        } else if (balance - betAmountSlot < 0) {
            setCurrentSlotBetAmount(balance);
        }

        spinSlotButton.setDisable(true);

        playSound("resources/spin_sound.wav"); // Quelle vom Sound: Pixabay

        for (int i = 0; i < 3; i++) {
            reels[i].setImage(new Image("file:resources/spin_blurry.jpeg"));
        }

        Timeline timeline = new Timeline();

        for (int i = 0; i < 3; i++) {
            int finalI = i;
            KeyFrame keyFrame = new KeyFrame(Duration.millis(1000 * (i + 1)), e -> spinReelSlot(finalI));
            timeline.getKeyFrames().add(keyFrame);
        }

        KeyFrame endFrame = new KeyFrame(Duration.millis(3100), e -> showResultSlot());
        timeline.getKeyFrames().add(endFrame);

        timeline.setCycleCount(1);
        timeline.play();
    }

    private void spinReelSlot(int reelIndex) {
        Random random = new Random();
        String imagePath = "file:resources/spin" + (random.nextInt(3) + 1) + ".jpeg";
        Platform.runLater(() -> {
            reels[reelIndex].setImage(new Image(imagePath));
        });
    }

    private void showResultSlot() {
        String reel1 = reels[0].getImage().getUrl();
        String reel2 = reels[1].getImage().getUrl();
        String reel3 = reels[2].getImage().getUrl();

        if (reel1.equals(reel2) && reel2.equals(reel3)) {
            resultText.setText("Du hast gewonnen! Einsatz: " + betAmountSlot);
            playSound("resources/win_sound.mp3"); // Quelle vom Sound: Pixabay
            balance += betAmountSlot * 3;
        } else {
            resultText.setText("Never give up! Einsatz: " + betAmountSlot);
            playSound("resources/lose_sound.mp3"); // Quelle vom Sound: Pixabay
            balance -= betAmountSlot;
        }

        balanceSlotLabel.setText("Kontostand: CHF " + balance);
        balanceLabel.setText("Kontostand: CHF " + balance);
        spinSlotButton.setDisable(false);
    }

    private void spinRoulette() {
        if (balance <= 0) {
            resultText.setText("Kein Geld mehr übrig!");
            return;
        } else if (balance - betAmountRoulette < 0) {
            setCurrentRouletteBetAmount(balance);
        }

        spinRouletteButton.setDisable(true);
        betAmountRouletteTextArea.setEditable(false);
        betRouletteTextArea.setEditable(false);

        confirmRouletteBetAmount();
        confirmRouletteBet();

        Timeline timeline = new Timeline();

        KeyFrame keyFrame = new KeyFrame(Duration.millis(50), e -> setRouletteImage(new Image("file:resources/roulette-wheel-blurry.jpg")));
        timeline.getKeyFrames().add(keyFrame);

        KeyFrame endFrame = new KeyFrame(Duration.millis(1000), e -> showResultRoulette());
        timeline.getKeyFrames().add(endFrame);

        timeline.setCycleCount(1);
        timeline.play();
    }

    private void setRouletteImage(Image image){
        rouletteWheel.setImage(image);
    }

    private void showResultRoulette(){
        spinRouletteButton.setDisable(false);
        betAmountRouletteTextArea.setEditable(true);
        betRouletteTextArea.setEditable(true);

        Random random = new Random();
        int randomNumber = random.nextInt(36);

        balance -= betAmountRoulette;

        if (Objects.equals(betRoulette, Integer.toString(randomNumber))){
            resultText.setText("Du hast gewonnen! Einsatz: " + betAmountRoulette + ", Ball landet auf: " + randomNumber);
            balance += betAmountRoulette * 36;
            playSound("resources/win_sound.mp3");
        } else if (Objects.equals(betRoulette, "grün") && randomNumber == 0) {
            resultText.setText("Du hast gewonnen! Einsatz: " + betAmountRoulette + ", Ball landet auf: " + randomNumber);
            balance += betAmountRoulette * 36;
            playSound("resources/win_sound.mp3");
        } else if (Objects.equals(betRoulette, "schwarz") &&  randomNumber % 2 == 0 && randomNumber != 0) {
            resultText.setText("Du hast gewonnen! Einsatz: " + betAmountRoulette + ", Ball landet auf: " + randomNumber);
            balance += betAmountRoulette * 2;
            playSound("resources/win_sound.mp3");
        } else if (Objects.equals(betRoulette, "rot") && randomNumber % 2 == 1) {
            resultText.setText("Du hast gewonnen! Einsatz: " + betAmountRoulette + ", Ball landet auf: " + randomNumber);
            balance += betAmountRoulette * 2;
            playSound("resources/win_sound.mp3");
        }
        else {
            resultText.setText("Never give up! Einsatz: " + betAmountRoulette + ", Ball landet auf: " + randomNumber);
            playSound("resources/lose_sound.mp3");
        }

        balanceLabel.setText("Kontostand: CHF " + balance);
        balanceSlotLabel.setText("Kontostand: CHF " + balance);
        setRouletteImage(new Image("file:resources/roulette-wheel.jpg"));
    }

    private void confirmSlotBetAmount() {
        if (betAmountSlotTextArea.getText().matches("[0-9]+")) {
            setCurrentSlotBetAmount(Integer.parseInt(betAmountSlotTextArea.getText()));
        }
    }

    private void setCurrentSlotBetAmount(int amount) {
        if (amount > 100){
            amount = 100;
        }
        else if (amount <= 0){
            amount = 1;
        }
        betAmountSlot = amount;
        currentBetAmount.setText("Aktueller Einsatz: " + betAmountSlot);
    }

    private void confirmRouletteBetAmount() {
        if (betAmountRouletteTextArea.getText().matches("[0-9]+")){
            setCurrentRouletteBetAmount(Integer.parseInt(betAmountRouletteTextArea.getText()));
        }
    }

    private void setCurrentRouletteBetAmount(int amount) {
        if (amount > 100){
            amount = 100;
        }
        else if (amount <= 0){
            amount = 1;
        }
        betAmountRoulette = amount;
        currentBetAmountLabel.setText("Aktueller Einsatz: " + betAmountRoulette);
    }

    private void confirmRouletteBet(){
        setCurrentRouletteBet(betRouletteTextArea.getText());
    }

    private void setCurrentRouletteBet(String bet) {
        if (bet.matches("(\\d+|schwarz|rot|grün)")) {
            betRoulette = bet;
            currentBetLabel.setText("Aktuelle Wette: " + bet);
        }
    }

    private void playSound(String soundFile) {
        Media sound = new Media(new File(soundFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
}
