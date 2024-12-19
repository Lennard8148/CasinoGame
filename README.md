# CasinoGame
# Projekt-Dokumentation

Lennard Bühler, Filip Kritzner, Raul Gilardoni

| Datum | Version | Zusammenfassung                                              |
| ----- | ------- | ------------------------------------------------------------ |
|       | 0.0.1   |                                                              |
|       | ...     |                                                              |
|       | ...     |                                                              |
|       | ...     |                                                              |
|       | ...     |                                                              |
|       | ...     |                                                              |
|       | 1.0.0   |                                                              |

## 1 Informieren

### 1.1 Ihr Projekt

✍️ Beschreiben Sie Ihr Projekt in einem griffigen Satz.

✍️ Erklären Sie genauer in 50 bis 100 Wörtern, was genau Sie in diesem Projekt erreichen möchten, und was Sie dabei zu lernen hoffen.

### 1.2 User Stories

| US-№ | Verbindlichkeit | Typ  | Beschreibung                       |
| ---- | --------------- | ---- | ---------------------------------- |
| 1    |   Muss              | Funtional     | Als User möchte ich, dass ich Einsätze auf bestimmte Zahlen oder Farben platzieren kann, um meine Gewinnchancen individuell zu gestalten. |
| 2  |   Muss              |  Funtional    |    Als User möchte ich, dass das Spiel minimale und maximale Einsatzgrenzen festlegt, damit ich meine Wetten sicher kontrollieren kann.                                |
| 3  |       Muss          | Funtional     |    Als User möchte ich, dass nach jedem Dreh der Gewinn oder Verlust angezeigt wird, um die Ergebnisse meiner Wetten direkt zu sehen.                                |
| 4  |     Kann            |   Qualität   |  Als User möchte ich, dass das Roulette-Rad eine realistische Animation hat, um ein authentisches Spielerlebnis zu geniessen.                                  |
| 5  |     Muss            |Funktional      |Als User möchte ich, dass das Roulette-Rad farbige und nummerierte Felder darstellt, um die Platzierung meiner Einsätze klar nachvollziehen zu können                                |
| 6  |   Muss              | Funktional     |  Als User möchte ich, dass alle Einsätze nach jeder Runde automatisch zurückgesetzt werden, um eine einfache Vorbereitung auf die nächste Runde zu haben.                                  |
| 7  |   Muss              |  Rand    |    Als User möchte ich, dass das Spiel eine zufällige Gewinnzahl generiert, um faire und unvorhersehbare Ergebnisse zu gewährleisten.                                |
| 8  |  Muss               |Funktional      |Als User möchte ich, dass meine Einsätze automatisch mit der Gewinnzahl abgeglichen werden, damit mein Gewinnbetrag korrekt berechnet wird.        |


### 1.3 Testfälle

| TC-№ | Ausgangslage | Eingabe | Erwartete Ausgabe |
| ---- | ------------ | ------- | ----------------- |
| 1.1  |     Spieler ist im Einsatzbildschirm.         | Spieler platziert 50 Chips auf die Zahl 17.        |   Der Einsatz wird akzeptiert und korrekt auf der Zahl 17 angezeigt.                |
| 2.1  |    Spieler versucht, einen Einsatz zu platzieren.          | Spieler gibt 1000 Chips ein (über dem Höchstbetrag).        |  Der Einsatz wird abgelehnt, und eine Fehlermeldung wird angezeigt.                 |
| 3.1  |  Spieler hat Einsätze platziert und das Rad wurde gedreht.            | Das Roulette-Rad stoppt auf der Gewinnzahl der Wette.        |  Der Gewinn wird korrekt berechnet und angezeigt.                 |
| 4.1  | Spieler startet den Dreh des Roulette-Rads.             |Spieler klickt auf "Drehen".         |   Die Animation des Rads startet und läuft flüssig.                |
| 5.1  |  Spieler sieht das Roulette-Rad.            |Spieler betrachtet die Darstellung.         |    Alle Felder des Rads sind korrekt nummeriert und gefärbt.               |
| 6.1  |  Eine Runde ist beendet.            |  Spieler wartet auf die nächste Runde.       | Alle Einsätze werden zurückgesetzt, und die nächste Runde beginnt.                  |
| 7.1  | Roulette-Rad wird gedreht             |    Spieler klickt auf "Drehen".     |   Eine zufällige Gewinnzahl zwischen 0 und 36 wird generiert.                |
| 8.1  | Spieler hat Einsätze auf Rot platziert.             | Das Roulette-Rad stoppt auf einer roten Zahl.        |   Der Einsatz wird als Gewinn erkannt, und der Betrag wird korrekt berechnet.                |



### 1.4 Diagramme

✍️Fügen Sie hier ein Use Case-Diagramm mit mindestens 3 Anwendungsfällen ein; und eine Skizze davon, wie Ihre Netzseite aussehen sollte.

## 2 Planen

| AP-№ | Frist | Zuständig | Beschreibung | geplante Zeit |
| ---- | ----- | --------- | ------------ | ------------- |
| 1.A  |       |           |  Implementieren der Funktion, um Einsätze auf Zahlen zu platzieren.            |               |
| 2.A  |       |           |  Implementieren der Funktion, um Einsätze auf Farben (Rot, Schwarz, Grün) zu platzieren.
            |               |
| 3.A  |       |           | Testen und Debuggen der Einsatzplatzierungslogik.             |               |
| 4.A  |       |           | Hinzufügen der Logik für minimale Einsatzgrenzen.             |               |
| 5.A  |       |           | Hinzufügen der Logik für maximale Einsatzgrenzen.             |               |
|6.A  |       |           |  Testen und Validieren der Einsatzgrenzen.            |               |
| 7.A  |       |           |  Implementieren der Berechnung des Gewinns bei einer erfolgreichen Wette.            |               |
| 8.A  |       |           | Implementieren der Anzeige von Gewinn oder Verlust nach jedem Dreh.
             |               |
| 9.A  |       |           | Testen und Debuggen der Gewinnanzeigefunktion.             |               |
| 10.A  |       |           |  Erstellen der Animation für das Drehen des Roulette-Rads.            |               |
| 11.A  |       |           |  Integrieren der Animation in den Dreh-Workflow.            |               |
| 12.A  |       |           | Sicherstellen, dass die Animation flüssig und fehlerfrei läuft.             |               |
| 13.A  |       |           | Gestalten des Roulette-Rads mit nummerierten und farbigen Feldern.             |               |
| 14.A  |       |           | Implementieren der Benutzeroberfläche für die Einsatzplatzierung.             |               |
| 15.A  |       |           | Testen der grafischen Darstellung auf verschiedenen Bildschirmgrößen.
             |               |
| 16.A  |       |           |  Implementieren der Logik zum Zurücksetzen aller Einsätze nach einer Runde.            |               |
| 17.A  |       |           | Testen der Reset-Funktion nach mehreren Runden.             |               |
| 18.A  |       |           |  Erstellen einer Funktion, die eine zufällige Gewinnzahl generiert.            |               |
| 19.A  |       |           |  Validieren der Zufallszahlen, um Fairness sicherzustellen.            |               |
| 20.A  |       |           | Entwickeln der Logik, um Einsätze mit der Gewinnzahl abzugleichen.             |               |
| 21.A  |       |           |  Testen der Abgleichlogik für verschiedene Einsatzarten.            |               |
| 22.A  |       |           |  Hinzufügen von Soundeffekten für Dreh und Gewinnanzeige.
            |               |
| 23.A  |       |           |Integrieren von visuellen Effekten bei einem Gewinn (z. B. blinkende Zahlen).              |               |
| 24.A  |       |           | Testen der Benutzeroberfläche auf intuitive Bedienbarkeit.             |               |
| 25.A  |       |           | Implementieren von Fehlermeldungen bei ungültigen Einsätzen.             |               |
| 26.A  |       |           |  Testen der Fehlerbehandlungslogik bei außergewöhnlichen Eingaben.            |               |
| 27.A  |       |           | Optimieren der Ladezeit und der Animationen für bessere Performance.             |               |
| 28.A  |       |           | Testen des Spiels auf verschiedenen Geräten und Browsern.             |               |
| 29.A  |       |           | Erstellen einer Benutzeranleitung für die Verwendung des Spiels.             |               |


Total: 



✍️ Ein Arbeitspaket sollte etwa 45' für eine Person in Anspruch nehmen. Die totale Anzahl Arbeitspakete sollte etwa Folgendem entsprechen: `Anzahl R-Sitzungen` ╳ `Anzahl Gruppenmitglieder` ╳ `4`. Wenn Sie also zu dritt an einem Projekt arbeiten, für welches zwei R-Sitzungen geplant sind, sollten Sie auf `2` ╳ `3` ╳`4` = `24` Arbeitspakete kommen. Sollten Sie merken, dass Sie hier nicht genügend Arbeitspakte haben, denken Sie sich weitere "Kann"-User Stories für Kapitel 1.2 aus.

## 3 Entscheiden

✍️ Dokumentieren Sie hier Ihre Entscheidungen und Annahmen, die Sie im Bezug auf Ihre User Stories und die Implementierung getroffen haben.

## 4 Realisieren

| AP-№ | Datum | Zuständig | geplante Zeit | tatsächliche Zeit |
| ---- | ----- | --------- | ------------- | ----------------- |
| 1.A  |       |           |               |                   |
| ...  |       |           |               |                   |

✍️ Tragen Sie jedes Mal, wenn Sie ein Arbeitspaket abschließen, hier ein, wie lang Sie effektiv dafür hatten.

## 5 Kontrollieren

| TC-№ | Datum | Resultat | Tester |
| ---- | ----- | -------- | ------ |
| 1.1  |       |          |        |
| ...  |       |          |        |

✍️ Vergessen Sie nicht, ein Fazit hinzuzufügen, welches das Test-Ergebnis einordnet.

## 6 Auswerten

✍️ Fügen Sie hier eine Verknüpfung zu Ihrem Lern-Bericht ein.
