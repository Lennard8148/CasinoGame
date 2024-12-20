# CasinoGame
# Projekt-Dokumentation

Lennard Bühler, Filip Kritzner, Raul Gilardoni

| Datum | Version | Zusammenfassung                                              |
| ----- | ------- | ------------------------------------------------------------ |
|       | 0.0.1   |                                                              |
|       | 0.0.2   |                                                              |
|       | 0.0.3   |                                                              |
|       | 0.0.4  |                                                              |
|       | 0.0.5   |                                                              |
|       | 0.0.6   |                                                              |
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
| 5  |     Muss            |Funktional      |Als User möchte ich, dass ein Text meine Wette und Einsatz anzeigt, um die Platzierung meiner Einsätze klar nachvollziehen zu können                                |
| 6  |   Muss              | Funktional     |  Als User möchte ich, dass nach dem spielen ein Sound abgespielt wird, damit ich weiss, ob ich gewonnen oder verloren habe.                                  |
| 7  |   Muss              |  Rand    |    Als User möchte ich, dass das Spiel eine zufällige Gewinnzahl generiert, um faire und unvorhersehbare Ergebnisse zu gewährleisten.                                |
| 8  |  Muss               |Funktional      |Als User möchte ich, dass meine Einsätze automatisch mit der Gewinnzahl abgeglichen werden, damit mein Gewinnbetrag korrekt berechnet wird.        |


### 1.3 Testfälle

| TC-№ | Ausgangslage | Eingabe | Erwartete Ausgabe |
| ---- | ------------ | ------- | ----------------- |
| 1.1  |     Spieler ist im Einsatzbildschirm.         | Spieler platziert 50 Chips auf die Zahl 17.        |   Der Einsatz wird akzeptiert.               |
| 2.1  |    Spieler versucht, einen Einsatz zu platzieren.          | Spieler gibt 1000 Chips ein (über dem Höchstbetrag von 100).        |  Der Einsatz wird abgelehnt, und eine Fehlermeldung wird angezeigt.                 |
| 3.1  |  Spieler hat Einsätze platziert und das Rad wurde gedreht.            | Das Roulette-Rad stoppt auf der Gewinnzahl der Wette.        |  Der Gewinn wird korrekt berechnet und angezeigt.                 |
| 4.1  | Spieler startet den Dreh des Roulette-Rads.             |Spieler klickt auf "Spin".         |   Die Animation des Rads startet und läuft flüssig.                |
| 5.1  |  Spieler sieht das Roulette-Rad.            |Spieler betrachtet die Darstellung.         |    Alle Felder des Rads sind korrekt nummeriert und gefärbt.               |
| 6.1  |  Eine Runde wurde gestartet.          |  Spieler klickt auf "Spin".      | Ein Sound wird abgespielt, abhängig davon, ob der Spieler gewonnen oder verloren hat.                |
| 7.1  | Roulette-Rad wird gedreht             |    Spieler klickt auf "Spin".     |   Eine zufällige Gewinnzahl zwischen 0 und 36 wird generiert.                |
| 8.1  | Spieler hat Einsätze auf Rot platziert.             | Das Roulette-Rad stoppt auf einer roten Zahl.        |   Der Einsatz wird als Gewinn erkannt, und der Betrag wird korrekt berechnet.                |



### 1.4 Diagramme

✍️Fügen Sie hier ein Use Case-Diagramm mit mindestens 3 Anwendungsfällen ein; und eine Skizze davon, wie Ihre Netzseite aussehen sollte.

## 2 Planen

| AP-№ | Frist | Zuständig | Beschreibung | geplante Zeit |
| ---- | ----- | --------- | ------------ | ------------- |
| 1.A  |  20.12.2024     |   Filip        |  Implementieren der Funktion, um Einsätze auf Zahlen zu platzieren.            |   100 min            |
| 2.A  | 20.12.2024       |  Filip         |  Implementieren der Funktion, um Einsätze auf Farben (Rot, Schwarz, Grün) zu platzieren.          |   100 min            |
| 3.A  | 20.12.2024       |  Filip         | Testen und Debuggen der Einsatzplatzierungslogik.             |    90 min           |
| 4.A  | 20.12.2024       |  Filip         | Hinzufügen der Logik für minimale Einsatzgrenzen.             |  80 min             |
| 5.A  | 20.12.2024       | Filip          | Hinzufügen der Logik für maximale Einsatzgrenzen.             |  80 min             |
|6.A  |  20.12.2024      |  Filip         |  Testen und Validieren der Einsatzgrenzen.            |  80 min             |
| 7.A  | 20.12.2024       | Filip          |  Implementieren der Berechnung des Gewinns bei einer erfolgreichen Wette.            | 90 min              |
| 8.A  | 20.12.2024       |  Filip         | Implementieren der Anzeige von Gewinn oder Verlust nach jedem Dreh.          |     100 min          |
| 9.A  | 20.12.2024       |  Filip         | Testen und Debuggen der Gewinnanzeigefunktion.             |  100 min             |
| 10.A  | 20.12.2024       |  Raul         |  Erstellen der Animation für das Drehen des Roulette-Rads.       |  100 min             |
| 11.A  | 20.12.2024       |    Raul       |  Integrieren der Animation in den Dreh-Workflow.            |     120 min          |
| 12.A  | 20.12.2024       |   Raul        | Sicherstellen, dass die Animation flüssig und fehlerfrei läuft.             |  120 min             |
| 13.A  | 20.12.2024       |   Raul        | Gestalten des Roulette-Rads mit nummerierten und farbigen Feldern.             | 120 min              |
| 14.A  |20.12.2024        |   Raul        | Implementieren der Benutzeroberfläche für die Einsatzplatzierung.             |     100 min          |
| 15.A  | 20.12.2024       |   Raul        | Testen der grafischen Darstellung auf verschiedenen Bildschirmgrößen.           |  100 min             |
| 16.A  | 20.12.2024       |   Raul        |  Implementieren der Logik zum Zurücksetzen aller Einsätze nach einer Runde.            | 120 min              |
| 17.A  | 20.12.2024       | Raul          | Testen der Reset-Funktion nach mehreren Runden.             |   120 min            |
| 18.A  | 20.12.2024       |  Filip         |  Erstellen einer Funktion, die eine zufällige Gewinnzahl generiert.            | 140 min              |
| 19.A  | 20.12.2024       |  Filip         |  Validieren der Zufallszahlen, um Fairness sicherzustellen.            |   80 min            |
| 20.A  |20.12.2024        |  Filip         | Entwickeln der Logik, um Einsätze mit der Gewinnzahl abzugleichen.             |  150 min             |
| 21.A  | 20.12.2024       |  Filip         |  Testen der Abgleichlogik für verschiedene Einsatzarten.            |  120 min             |
| 22.A  | 20.12.2024       |  Filip u. Lennard         |  Hinzufügen von Soundeffekten für Dreh und Gewinnanzeige.         |      150 min         |
| 23.A  |20.12.2024        | Lennard          |Integrieren von visuellen Effekten bei einem Gewinn (z. B. blinkende Zahlen).              |   90 min            |
| 24.A  | 20.12.2024       | Lennard          | Testen der Benutzeroberfläche auf intuitive Bedienbarkeit.             |  130 min             |
| 25.A  | 20.12.2024       | Lennard          | Implementieren von Fehlermeldungen bei ungültigen Einsätzen.             |    160 min           |
| 26.A  |20.12.2024        | Lennard         |  Testen der Fehlerbehandlungslogik bei außergewöhnlichen Eingaben.            |   120 min            |
| 27.A  |20.12.2024        | Lennard          | Optimieren der Ladezeit und der Animationen für bessere Performance.             | 120 min              |
| 28.A  | 20.12.2024       | Lennard          | Testen des Spiels auf verschiedenen Geräten und Browsern.             |    120 min           |
| 29.A  |20.12.2024        | Lennard          | Erstellen einer Benutzeranleitung für die Verwendung des Spiels.       |   120 min            |
| 30.A  |20.12.2024        | Lennard          | Erstellen der Dokumentation       |      200 min         |


## 3 Entscheiden

✍️ Dokumentieren Sie hier Ihre Entscheidungen und Annahmen, die Sie im Bezug auf Ihre User Stories und die Implementierung getroffen haben.

## 4 Realisieren

| AP-№ | Datum | Zuständig | geplante Zeit | tatsächliche Zeit |
| ---- | ----- | --------- | ------------- | ----------------- |
| 1.A  | 22.11      |  Filip         |  100 min             |    120 min               |
| 2.A  |   22.11     |  Filip         |  100 min             |   110 min                |
| 3.A  |   22.11     |  Filip         |    90 min           |     100 min              |
| 4.A  |   22.11     |  Filip         |  80 min             |   80 min                |
| 5.A  |   29.11     |  Filip         | 80 min              |   90 min                |
| 6.A  |   29.11     |  Filip         |  80 min             |    90 min               |
| 7.A  |  29.11      |  Filip         |  90 min             |   80 min                |
| 8.A  |   29.11     |  Filip         |   100 min            |   110 min                |
| 9.A  |  29.11     |  Filip         |  100 min             |    90 min               |
| 10.A  | 29.11       | Raul            |  100 min             |   90 min                |
| 11.A  |   22.11      |  Raul            | 120 min              | 120 min                  |
| 12.A  |   22.11      |  Raul            |  120 min                | 120 min                  |
| 13.A  |   22.11      | Raul             |  120 min                |   120 min                |
| 14.A  |   22.11      | Raul             |  100 min             |   120 min                |
| 15.A  |  29.11       | Raul             |  100 min             |    110 min               |
| 16.A  | 06.12        | Raul             |   120 min            |      110 min             |
| 17.A  |   03.12     | Raul             |   120 min            |     120 min              |
| 18.A  |   13.12     | Filip           | 140 min              |      150 in             |
| 19.A  |   06.12    |  Filip          |   80 min            |    120 min               |
| 20.A  |   06.12     |  Filip          |   150 min            | 150 min                  |
| 21.A  |    13.12   | Filip           |  120 min             |  120 min                 |
| 22.A  |    22.11    |  Filip u. Lennard        |  150 min             |    150 min               |
| 23.A  |    22.11    |  Lennard         |  90 min             |   100 min                |
| 24.A  |    29.11       |    Lennard       |  130 min             |   100 min                |
| 25.A  |   29.11        |  Lennard         |  160 min             |    180 min               |
| 26.A  |    29.11       |  Lennard         |  120 min             |  120 min                 |
| 27.A  |    22.11    |  Lennard         |   120 min            |   130 min                |
| 28.A  |   03.12    |  Lennard         |  120 min             |  110 min                 |
| 29.A  |  10.12      |  Lennard         |   120 min            |   140 min                |
| 30.A  |     20.12  | Lennard          |  200 min             |    210 min               |





## 5 Kontrollieren

| TC-№ | Datum | Resultat | Tester |
| ---- | ----- | -------- | ------ |
| 1.1  |  13.12.2024     |Funktioniert|  Filip und Lennard       |
| 2.1  |13.12.2024        |Funktioniert|  Filip und Lennard        |
| 3.1  |13.12.2024        |Funktioniert|  Filip und Lennard        |
| 4.1  |13.12.2024       |Funktioniert| Filip und Lennard         |
| 5.1  | 13.12.2024       |Funktioniert| Filip und Lennard         |
| 6.1  | 13.12.2024       |Funktioniert| Filip und Lennard         |
| 7.1  | 13.12.2024       |Funktioniert| Filip und Lennard         |
| 8.1  | 13.12.2024       |Funktioniert| Filip und Lennard         |


## Fazit
Das Projekt war ein voller Erfolg, trotz einiger Herausforderungen, die wir erfolgreich gemeistert haben. Die Zusammenarbeit im Team machte das Programmieren zu einer spannenden und unterhaltsamen Erfahrung. Besonders erfreulich war, dass beim Testen alles reibungslos funktionierte und unsere Erwartungen erfüllt wurden. Insgesamt sind wir stolz auf das Ergebnis und blicken zufrieden auf eine lehrreiche und motivierende Entwicklungsphase zurück.
