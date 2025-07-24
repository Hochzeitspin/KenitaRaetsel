import java.security.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;


public class Readme {
    public static void main(String[] args) throws NoSuchAlgorithmException  {
        // Für Anita und Kevin
        String Vorwort = "Oh je! Bei dem ganzen Stress wegen der Hochzeitsvorbereitung ist leider ein kleines Missgeschick passiert. \n" +
        "Der PIN für die Geldgeschenktruhe ist spurlos verschwunden. Aber keine Panik!\n" +
        "Gut, dass er auch Anhand von vier Rätseln herausgefunden werden kann.\n" +
        "Aber dazu bräuchte es natürlich jemanden, der gerne rätselt und sich mit Java-Programmierung auskennt.\n" +
        "Wer könnte das wohl sein? Wenn ihr die Herausforderung annehmt, schaut euch doch mal diesen Code genauer an.\n" +
        "Bevor ihr mit dem Rätseln loslegt, findet ihr ein kleines Gedicht.\n" +
        "Für die Lösung mancher Rätsel ist es wichtig, bei anderen nicht -lest es euch einfach mal durch.\n" +
        "Danach findet ihr die Rätsel 1 bis 4. Um zu prüfen, ob eure Antwort jeweils richtig ist, drückt Run.\n" +
        "Wenn ihr mal nicht weiterwisst und Tipps braucht, findet ihr diese jeweils ganz am ENDE des jeweiligen Rätsels.\n" +
        "Wir wünschen euch viel Spaß und Erfolg!\n" +
        "Viele Grüße von Anitas Junggesellen";


        String Gedicht =
        "❤Bei der Bayrischen Versorgungskammer hats angefangen,\n" +
        "beim Coden wurden eure Herzen gefangen.\n" +
        "❤Ein Wortgefecht bringt euch nah zusammen in dieser Zeit,\n" +
        "ab da gabs nur Unzertrennlichkeit.\n" +
        "❤Kenita ward euer Pärchenname, so wunderbar,\n" +
        "verschmolzen zu einem Traumpaar.\n" +
        "\n" +
        "❤Unser Fitness Couple, das Abenteuer liebt,\n" +
        "beim Wandern, und Billard stets vergnügt.\n" +
        "❤Zocken, Krimidinner, Pen&Paper und Brettspiel,\n" +
        "ihr zwei erobert die Welt mit eurem wundervollen Stil.\n" +
        "\n" +
        "❤Ein Team durch Lachen, Magie und Kraft, \n" +
        "kein Wunder das eure DSA-Gruppe alles schafft.\n" +
        "❤Fiana, die Bogenschützin, so gewandt,\n" +
        "wirft Knochen und prophezeit dann mit Verstand.\n" +
        "❤Elkwin der Magier heilt mit Bedacht,\n" +
        "vorsichtig wirkt er seine Macht,\n" +
        "besonders auf die Sauberkeit gibt er immer acht.\n" +
        "❤Nehmt von den beiden einiges mit,\n" +
        "eins steht fest, sie sind auf jeden Fall der Hit.\n" +
        "\n" +
        "❤Romantik blüht, die Reise geht weiter,\n" +
        "durch fließende Ströme und Vulkane, stets heiter.\n" +
        "❤Unterm Wasserfall ein Bild so rein,\n" +
        "wie Movie-Stars posiert ihr so fein,\n" +
        "The Final Decision - der Film, muss das wohl sein.\n" +
        "\n" +
        "❤In Indonesien, am Strand einer Gili,\n" +
        "fiel Kevin auf die Knie, so ganz galant, wie nie.\n" +
        "❤Ein Ring, ein Ja, ein Moment so klar,\n" +
        "die Liebe besiegelt, für immerdar.\n" +
        "\n" +
        "❤Drum lasst uns anstoßen, auf Kenita, das Paar,\n" +
        "für immer verbunden, im Glück das ist ja klar.";


        // Rätsel1: -START- #################################################################################################
        String raetselText1 =
        "Was ist der Anfang der Ewigkeit, das Ende der Stunde, \n" +
        "der Anfang allen Endes und das Ende aller Tage.\n" +
        "Es ist im Meer und in der See, aber nicht im Land.\n" +
        "Es ist in der Liebe, aber nie in Hass.\n" +
        "Die Lösung kommt auch im Gedicht vor, aber Achtung Fangfrage:)";

        // Tragt hier bitte eure Antwort von Rätsel1 ein und startet das Program
        String AntwortRätsel1 = "E";



                // Überprüfung eurer Antwort Rätsel1 (also nicht interessant für euch, für Tipps weiter runter scrollen)
                // ASCII-Berechnungen der Lösungsteile (Verschlüsselung)
                char LoesungRaetsel1Teil1 = (char) (207 / 3);
                char LoesungRaetsel1Teil2 = (char) (65 + 36);

                int Rätsel1;

                if (AntwortRätsel1.equals(String.valueOf(LoesungRaetsel1Teil1)) ||
                AntwortRätsel1.equals(String.valueOf(LoesungRaetsel1Teil2))) {
                Rätsel1 = countCharacter(Gedicht,LoesungRaetsel1Teil1) + countCharacter(Gedicht,LoesungRaetsel1Teil2) - 158;
                } else {
                Rätsel1 = countCharacter(Gedicht, 'm') + countCharacter(Gedicht, 'M') - 158;
                }

                String hexZahl1 = "6CB8";
                String hexZahl2 = "4";
                String hexZahl3 = "1B2C";

                // Hexadezimalzahlen in Dezimalzahlen umwandeln Rätsel1
                int dezimalZahl1 = Integer.parseInt(hexZahl1, 16);
                int dezimalZahl2 = Integer.parseInt(hexZahl2, 16);
                int dezimalZahl3 = Integer.parseInt(hexZahl3, 16);

                // Endberechnung durchführen Rätsel1
                int LösungRätsel1 = (dezimalZahl1 / dezimalZahl2) - dezimalZahl3;

                // Vergleich Lösung Antwort Rätsel1
                if (LösungRätsel1 == Rätsel1) {
                System.out.println("Rätsel 1: Richtig! Pin1: " + Rätsel1);
                } else {
                System.out.println("Rätsel 1: noch nicht gelöst.");
                }

                // Tipps für Rätsel1
                // Tipp 1: Das Rätsel funktioniert nicht mehr, wenn man es auf Englisch übersetzt
                // Tipp 2: Es ist in Erde und Wasser aber nicht in Sand
                // Tipp 3: Es kommt sogar öfter im Gedicht vor
                // Tipp 4: Oben gibt es eine if Bedingung mit count Character
                // Lösung: Macht outprint LoesungRaetsel1Teil1 oder LoesungRaetsel1Teil2

        //Rästel 1: -ENDE- #################################################################################################





        // Rätsel2: -START- ################################################################################################
        String raetselText2 =
        "Für euer nächstes Abenteuer - die Ehe - wünschen wir euch von Herzen viele unvergessliche Momente,\n" +
        "außerdem weiterhin viel Leichtigkeit, Geborgenheit, Verständnis, Respekt, liebevolle Herzen füreinander,\n" +
        "Vertrauen,viel gemeinsames Lachen und Freude.\n" +
        "Mögen eure Herzen immer Trost und Geborgenheit in den Armen des anderen finden,\n" +
        "und eure Träume gemeinsam in Erfüllung gehen.\n" +
        "Auf dass eure Ehe immer eure Herzen wärmt - wie eine sanfte Flamme: stetig, hell, voller Leidenschaft und Herzensglück\n" +
        "Genießt heute euren ganz besonderen Tag und alles was danach kommen mag,\n" +
        "lasst euch dabei einfach von euren Herzen führen.\n" +
        "Eure Herzen sind also dabei sehr wichtig - passt gegenseitig also gut auf sie auf.\n" +
        "\n" +
        "\n" +
        "In der Liebe ist es wie in einem GEDICHT: Manches erschließt sich nur, wenn man dem Herzen den Vortritt lässt.\n" +
        "Vielleicht solltet ihr wirklich vor jedem neuen Satz auf euer Herz hören.\n" +
        "Versucht dabei keine Lücken an eure Herzen kommen zu lassen.\n" +
        "Wie gut, dass ihr die Herzen ❤ am richtigen Fleck habt,\n" +
        "dann steht die Liebe für euch automatisch an der richtigen Stelle." +
        "Hier gibt es kein Antwortfeld, aber irgendwo muss etwas verändert oder ergänzt werden... nur wo und was? ❤";


                // Überprüfung eurer Antwort Rätsel2 (also nicht interessant für euch, für Tipps weiter runter scrollen)
                // Binärzahlen als Strings Rätsel2
                String binaerZahl4 = "11000";
                String binaerZahl5 = "1010101";
                String binaerZahl6 = "11111111000";

                // Binärzahlen in Dezimalzahlen umwandeln Rätsel2
                long dezimalZahl4 = Long.parseLong(binaerZahl4, 2);
                long dezimalZahl5 = Long.parseLong(binaerZahl5, 2);
                long dezimalZahl6 = Long.parseLong(binaerZahl6, 2);

                // Berechnung durchführen Rätsel2
                long LösungRätsel2 = (dezimalZahl4 * dezimalZahl5) - dezimalZahl6;

                // Stelle suchen
                String Stelle = "Liebe";
                int Rätsel2 = Gedicht.indexOf(Stelle) - 1186;

                // Überprüfung der Lösung Rätsel2
                if (LösungRätsel2 == Rätsel2) {
                System.out.println("Rätsel 2: Richtig! Pin2: "+ LösungRätsel2);
                } else {
                System.out.println("Rätsel 2: noch nicht gelöst.");
                }



                // Tipps für Rätsel2
                // Tipp 1: Oben steht ein String Stelle = "Liebe", wo wird das Wort gesucht?
                // Tipp 2: Muss man dort vielleicht etwas hinzufügen ❤ (als Emoji)
                // Tipp 3: Vielleicht mehrere (insgesamt 14), an bestimmten Positionen im (String) Gedicht
                // Lösung: Macht ein ❤ an jedem Satzanfang im Gedicht und drück auf Run

        //Rästel 2: -ENDE- #################################################################################################





        // Rätsel3: -START- ###############################################################################################
        // Um Rätsel3 lösen zu können gebt bitte bei "String html File" "öffnen" ein und startet,
        // dann sollte sich ein html-File für euch öffnen :)
        String htmlFile = "öffnen";

        // hier kommt Rätsel3, könnt ihr die Lösung im html-File entdecken, wie oft kommt sie vor?
        String raetselText3 =
        "Es geht von Mund zu Mund,\n" +
        "doch ist es kein Gerücht.\n" +
        "Getan wird's jede Stund,\n" +
        "wenn auch von jedem nicht.\n" +
        "Es kostet nichts, doch kostet man's.\n" +
        "Es ist ein Nichts, doch möcht' man's ganz.\n" +
        "Es bleibt im Kopf, wenn's echt gemeint –\n" +
        "ein Augenblick, der Zeit und Raum vereint.\n" +
        "Ein Hauch, ein Funke, voller Kraft,\n" +
        "der Herzen wärmt und Sehnsucht schafft.\n" +
        "Es ist ein Dieb der Herzen stiehlt,\n" +
        "dabei aber keine Taschen leert,\n" +
        "nur Sehnsucht tief im Innern nährt.";

        // Tragt hier ein wie oft ihr die Lösung im html File entdeckt
        int Rätsel3 = 2;


                // Überprüfung eurer Antwort Rätsel3 (also nicht interessant für euch, für Tipps weiter runter scrollen)
                int[] zahl1ASCII = {57, 55, 52};  // 974
                int[] zahl2ASCII = {53, 52};      // 54
                int[] zahl3ASCII = {52, 54, 48};  // 460

                // ASCII-Codes in Zahlen umwandeln Rätsel3
                int zahl1 = asciiZuZahl(zahl1ASCII);
                int zahl2 = asciiZuZahl(zahl2ASCII);
                int zahl3 = asciiZuZahl(zahl3ASCII);

                // Berechnung durchführen Rätsel3
                double LösungRätsel3 = (double) (zahl1 - zahl2) / zahl3;

                // Überprüfung der Lösung Rätsel3
                if (LösungRätsel3 == Rätsel3) {
                System.out.println("Rätsel 3: Richtig! Pin3: " + Rätsel3);
                } else {
                System.out.println("Rätsel 3: noch nicht gelöst.");
                }

                // Öffnen der html Seite


                if ("öffnen".equals(htmlFile)) {
                try {
                File file = null;

                // 1. Versuche relativ zur JAR- oder .class-Datei
                File baseDir = new File(Readme.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile();
                File candidate = new File(baseDir, "WebsiteRätsel3/index9.html");

                if (candidate.exists()) {
                    file = candidate;
                } else {
                    // 2. Fallback: relativ zum Arbeitsverzeichnis
                    candidate = new File(System.getProperty("user.dir"), "WebsiteRätsel3/index9.html");
                    if (candidate.exists()) {
                        file = candidate;
                    }
                }

                if (file != null && file.exists()) {
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                        Desktop.getDesktop().browse(file.toURI());
                    } else {
                        openFileWithDefaultProgram(file.getAbsolutePath());
                    }
                } else {
                    System.out.println("Die Datei wurde nicht gefunden: WebsiteRätsel3/index9.html");
                }

                } catch (URISyntaxException | IOException e) {
                e.printStackTrace();
                }
                }


                // Tipps für Rätsel3
                // Tipp 1: Man kann es nicht essen
                // Tipp 2: Ihr müsst bei der html Seite nicht den Code öffnen
                // Tipp 3: Es ist das was ihr immer macht
                // Tipp 4: Um die korrekte Anzahl zu sehen macht outprint LoesungRaetsel3

        //Rästel 3: -ENDE- #################################################################################################





        // Rätsel4: -START- ################################################################################################
        String raetselText4 = "Jetzt müsst ihr programmieren!\n " +
        "Bitte lasst euch die Wörter im Gedicht anzeigen, die an den folgenden drei Positionen stehen - es sind drei Zahlen. \n" +
        "Programmier-Instruktion: Entfernt alle Sonderzeichen und holt euch die drei Wörter an den Positionen 107, 114 und 55.\n" +
        "Wenn ihr das geschafft habt, subtrahiert bitte von der ersten Zahl die beiden anderen.\n" +
        "Das ergibt die Antwort, die ihr bei AntwortRätsel4 eintragen könnt";


        // Tragt hier bitte eure Antwort von Rätsel4 ein
        int AntwortRätsel4 = 5                                                                                                                                                                                                                                                                              ;

        // Sonderzeichen entfernen, Umlaute etc. behalten
        String cleanedGedicht = Gedicht.replaceAll("[^\\p{L}\\p{Nd}\\s]", "");

        // In Wörter aufteilen
        String[] words = cleanedGedicht.split("\\s+");

        // Gewünschte Positionen
        int[] positions = {107, 114, 55};

        System.out.println("Die gewünschten Wörter sind:");
        for (int pos : positions) {
            if (pos <= words.length) {
                System.out.println(pos + ": " + words[pos - 1]);  // -1 wegen Indexbeginn bei 0
            } else {
                System.out.println("Position " + pos + " ist außerhalb des Gedichts.");
            }
        }


                // Überprüfung eurer Antwort Rätsel4 (also nicht interessant für euch, für Tipps weiter runter scrollen)
                // HashWert der Lösung
                String LösungRätsel4 = "ef2d127de37b942baad06145e54b0c619a1f22327b2ebbcfbec78f5564afe39d";

                //Berechne den Hash-Wert des Ergebnisses
                String calculatedHash = hash(String.valueOf(AntwortRätsel4));

                // Hash des Ergebnisses berechnen und mit dem gespeicherten Hash vergleichen
                if (calculatedHash.equals(LösungRätsel4)) {
                System.out.println("Rätsel 4: Richtig! Pin4:" + AntwortRätsel4);
                } else {
                System.out.println("Rätsel 4: noch nicht gelöst.");
                }

                // Tipps für Rätsel4
                // Tipp 1: Wirklich nur die Wörter, keine Sonderzeichen oder Emojis
                // Tipp 2: Bei meiner Lösung: Indizes beginnen bei 1
                // Lösung: Macht outprint LoesungRaetsel4

        //Rästel 4: -ENDE- #################################################################################################





                // Anzeigen des Vorworts bzw. Glückwunsch
                String Glueckwunsch = "Juhu! Ihr habt es geschafft – alle vier Rätsel gelöst und jede Herausforderung dabei gemeistert!\n" +
                "Was für ein starkes Team ihr seid – klug, kreativ und perfekt aufeinander eingespielt!\n" +
                "Mit Scharfsinn und Teamgeist habt ihr den verlorenen PIN wiedergefunden.\n" +
                "Ihr könnt richtig stolz auf euch sein – das war keine leichte Aufgabe, aber gemeinsam seid ihr einfach unschlagbar!\n" +
                "Los geht’s - probiert den PIN schnell aus und holt euch euer Geld.\n" +
                "Wir gratulieren euch von Herzen zur Hochzeit und wünschen euch für euren gemeinsamen Lebensweg\n" +
                "so viel Freude, Vertrauen und Zusammenhalt, wie ihr ihn heute beim Rätseln bewiesen habt.\n" +
                "Lasst euch feiern, genießt diesen besonderen Tag – und denkt immer daran:\n" +
                "Wenn ihr zusammenarbeitet, ist für euch nichts unmöglich! ❤";

                // Richtigkeitsüberprüfung der Rätsel
                boolean raetsel1Richtig = (LösungRätsel1 == Rätsel1);
                boolean raetsel2Richtig = (LösungRätsel2 == Rätsel2);
                boolean raetsel3Richtig = (LösungRätsel3 == Rätsel3);
                boolean raetsel4Richtig = calculatedHash.equals(LösungRätsel4);


                if (raetsel1Richtig && raetsel2Richtig && raetsel3Richtig && raetsel4Richtig) {
                System.out.println(Glueckwunsch);
                } else {
                System.out.println(Vorwort);
                }
                }


    // Hilfsmethode zur Umwandlung von ASCII-Codes in eine Zahl
    private static int asciiZuZahl(int[] asciiCodes) {
        int zahl = 0;
        for (int asciiCode : asciiCodes) {
            zahl = zahl * 10 + (asciiCode - 48); // 48 ist der ASCII-Code für '0'
        }
        return zahl;
    }

    // Hilfsmethode zum Zählen eines bestimmten Zeichens in einem String
    public static int countCharacter(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count; // Hier fehlte der Rückgabewert
    }

    // Hash-Funktion
    public static String hash(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(input.getBytes());

        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    // Hilfsmethode Alternative Methode zum Öffnen der Datei im Standardbrowser
    public static void openFileWithDefaultProgram(String filePath) {
        String os = System.getProperty("os.name").toLowerCase();
        try {
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "start", "\"\"", "\"" + filePath + "\"").start();
            } else if (os.contains("mac")) {
                new ProcessBuilder("open", filePath).start();
            } else if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {
                new ProcessBuilder("xdg-open", filePath).start();
            } else {
                System.out.println("Nicht unterstütztes Betriebssystem");
            }
        } catch (IOException e) {
            System.out.println("Automatisches Öffnen fehlgeschlagen. Datei manuell öffnen:");
            System.out.println(filePath);
            e.printStackTrace();
        }
    }


}