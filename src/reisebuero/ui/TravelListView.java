package reisebuero.ui;

import reisebuero.model.Travel;
import java.util.List;
import java.util.Scanner;

// Zuständig für die Anzeige der Reiseangebote
public class TravelListView {

    // Scanner zur Eingabe durch den Nutzer
    private Scanner scanner = new Scanner(System.in);

    // Zeigt alle verfügbaren Reisen an
    public void showTravels(List<Travel> travels) {

        System.out.println();
        System.out.println("Verfügbare Reisen:");
        System.out.println("-------------------");

        // Alle Reisen nummeriert ausgeben
        for (int i = 0; i < travels.size(); i++) {
            System.out.println((i + 1) + ". " + travels.get(i));
        }

        System.out.println("0 - Zurück");
        System.out.print("Nummer eingeben zum Hinzufügen: ");
    }

    // Liest die Auswahl ein und gibt die gewählte Reise zurück
    public Travel chooseTravel(List<Travel> travels) {

        String input = scanner.nextLine();

        try {
            // Eingabe in Zahl umwandeln
            int number = Integer.parseInt(input);

            // Prüfen, ob die Nummer gültig ist
            if (number > 0 && number <= travels.size()) {
                return travels.get(number - 1);
            }

            // Ungültige Eingabe behandeln
        } catch (Exception e) {
            System.out.println("Ungültige Eingabe.");
        }

        // Bei ungültiger Eingabe wird null zurückgegeben
        return null;
    }
}
