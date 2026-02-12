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

}
