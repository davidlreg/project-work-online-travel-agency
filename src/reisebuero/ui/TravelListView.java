package reisebuero.ui;

import reisebuero.model.Travel;
import java.util.List;
import java.util.Scanner;

public class TravelListView {

    private Scanner scanner = new Scanner(System.in);

    public void showTravels(List<Travel> travels) {

        System.out.println();
        System.out.println("Verfügbare Reisen:");
        System.out.println("-------------------");

        for (int i = 0; i < travels.size(); i++) {
            System.out.println((i + 1) + ". " + travels.get(i));
        }

        System.out.println("0 - Zurück");
        System.out.print("Nummer eingeben zum Hinzufügen: ");
    }

    // Gibt die ausgewählte Reise zurück
    public Travel chooseTravel(List<Travel> travels) {

        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);

            if (number > 0 && number <= travels.size()) {
                return travels.get(number - 1);
            }

        } catch (Exception e) {
            System.out.println("Ungültige Eingabe.");
        }

        return null;
    }
}
