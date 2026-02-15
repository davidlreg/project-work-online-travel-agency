package reisebuero;

import reisebuero.data.CsvTravelLoader;
import reisebuero.model.Travel;
import reisebuero.service.BookingService;
import reisebuero.service.CartService;
import reisebuero.service.FilterService;
import reisebuero.ui.CartView;
import reisebuero.ui.InvoiceView;
import reisebuero.ui.MainView;
import reisebuero.ui.TravelListView;

import java.util.List;

// Startklasse
public class App {

    public static void main(String[] args) {

        // Initialisierung der Klassen
        CsvTravelLoader loader = new CsvTravelLoader();
        MainView mainView = new MainView();
        TravelListView travelView = new TravelListView();
        CartService cartService = new CartService();
        CartView cartView = new CartView();
        FilterService filterService = new FilterService();
        BookingService bookingService = new BookingService();
        InvoiceView invoiceView = new InvoiceView();

        // Überwacht ob das Programm aktiv ist oder nicht
        boolean running = true;

        // Hauptmenü läuft solange bis der Nutzer beendet
        while (running) {

            // Menü anzeigen und Auswahl einlesen
            String choice = mainView.showMenu();

            // Alle Reiseangebote anzeigen
            if (choice.equals("1")) {

                // Reisen laden
                List<Travel> travels = loader.loadTravels("resources/traveldata.csv");

                // Reisen anzeigen
                travelView.showTravels(travels);

                // Auswahl ermöglichen
                Travel selected = travelView.chooseTravel(travels);

                // Reise dem Warenkorb hinzufügen
                if (selected != null) {
                    cartService.addToCart(selected);
                }

                // Reisen filtern
            } else if (choice.equals("2")) {

                // Reisen laden
                List<Travel> travels = loader.loadTravels("resources/traveldata.csv");

                // Filterwerte abfragen
                String start = mainView.askText("Start angeben (z.B. BER oder Berlin, leer = egal): ");
                String destination = mainView.askText("Ziel angeben (z.B. BCN oder Barcelona, leer = egal): ");
                String maxPriceInput = mainView.askText("Max Preis in EUR angeben (z.B. 300, leer = egal): ");

                // Max-Preis verarbeiten
                Double maxPrice = null;
                if (!maxPriceInput.trim().isEmpty()) {
                    try {
                        maxPrice = Double.parseDouble(maxPriceInput.replace(",", "."));
                    } catch (Exception e) {
                        System.out.println("Max Preis ungültig. Filter wird ohne Preis angewendet.");
                    }
                }

                // Filtern
                List<Travel> filtered = filterService.filterTravels(travels, start, destination, maxPrice);

                // Ergebnis anzeigen
                if (filtered.isEmpty()) {
                    System.out.println("Keine Reisen passen zu deinen Filtern.");
                } else {
                    travelView.showTravels(filtered);
                    Travel selected = travelView.chooseTravel(filtered);

                    // Gewählte Reise dem Warenkorb hinzufügen
                    if (selected != null) {
                        cartService.addToCart(selected);
                    }
                }

                // Warenkorb anzeigen
            } else if (choice.equals("3")) {

                cartView.showCart(cartService.getCart(), cartService.getTotalPrice());

                // Buchung abschließen
            } else if (choice.equals("4")) {

                // Gesamtpreis vor dem Leeren merken
                double total = cartService.getTotalPrice();

                // Buchung durchführen
                List<Travel> booked = bookingService.bookTravels(cartService.getCart());

                // Rechnung ausgeben, wenn wirklich gebucht wurde
                if (!booked.isEmpty()) {
                    invoiceView.showInvoice(booked, total);

                    // Warenkorb leeren
                    cartService.clearCart();
                }

                // Hilfe anzeigen
            } else if (choice.equals("5")) {

                mainView.showHelp();

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
