package reisebuero.ui;

import java.util.Scanner;

public class MainView {

    private Scanner scanner = new Scanner(System.in);

    // Zeigt das Hauptmenü und gibt die Eingabe zurück
    public String showMenu() {

        System.out.println("Menü:");
        System.out.println("1 - Alle Reiseangebote anzeigen");
        System.out.println("2 - Reiseangebote filtern");
        System.out.println("3 - Warenkorb anzeigen");
        System.out.println("4 - Buchung abschließen");
        System.out.println("5 - Hilfe");
        System.out.println("0 - Programm beenden");
        System.out.print("Bitte wählen: ");

        return scanner.nextLine();
    }

    // Fragt einen Text ab und gibt ihn zurück
    public String askText(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    // Zeigt eine kurze Hilfe an
    public void showHelp() {
        System.out.println();
        System.out.println("===== HILFE =====");
        System.out.println("1: Zeigt alle Reisen an. Du kannst eine Nummer wählen, um sie in den Warenkorb zu legen.");
        System.out.println("2: Filtert Reisen (Start/Ziel/Max-Preis). Leere Eingabe bedeutet: kein Filter.");
        System.out.println("3: Zeigt deinen Warenkorb und den Gesamtpreis.");
        System.out.println("4: Bucht alle Reisen im Warenkorb und gibt eine Rechnung aus.");
        System.out.println("0: Beendet das Programm.");
        System.out.println("=================");
        System.out.println();
    }

}
