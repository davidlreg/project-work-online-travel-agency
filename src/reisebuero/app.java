package reisebuero;

import reisebuero.data.CsvTravelLoader;
import reisebuero.model.Travel;
import reisebuero.service.CartService;
import reisebuero.ui.MainView;
import reisebuero.ui.TravelListView;
import reisebuero.ui.CartView;

import java.util.List;

// Startklasse der Anwendung
public class App {

    public static void main(String[] args) {

        // Initialisierung der benötigten Klassen
        CsvTravelLoader loader = new CsvTravelLoader();
        MainView mainView = new MainView();
        TravelListView travelView = new TravelListView();
        CartService cartService = new CartService();
        CartView cartView = new CartView();

        // Steuert die Programmschleife
        boolean running = true;

        // Hauptmenü läuft solange, bis der Nutzer beendet
        while (running) {

            // Menü anzeigen und Auswahl einlesen
            String choice = mainView.showMenu();

            // Alle Reiseangebote anzeigen
            if (choice.equals("1")) {

                // Reisen aus der CSV-Datei laden
                List<Travel> travels = loader.loadTravels("resources/traveldata.csv");

                // Reisen anzeigen
                travelView.showTravels(travels);

                // Auswahl einer Reise ermöglichen
                Travel selected = travelView.chooseTravel(travels);

                // Gewählte Reise dem Warenkorb hinzufügen
                if (selected != null) {
                    cartService.addToCart(selected);
                }

                // Warenkorb anzeigen
            } else if (choice.equals("3")) {

                cartView.showCart(cartService.getCart(), cartService.getTotalPrice());

                // Programm beenden
            } else if (choice.equals("0")) {

                running = false;

                // Ungültige Eingabe behandeln
            } else {
                System.out.println("Ungültige Eingabe.");
            }
        }
    }
}
