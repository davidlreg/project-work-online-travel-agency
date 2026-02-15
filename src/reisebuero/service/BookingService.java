package reisebuero.service;

import reisebuero.model.Travel;

import java.util.ArrayList;
import java.util.List;

// Löst eine Buchung aus
public class BookingService {

    // "Bucht" die Reisen indem sie in eine neue Liste übernommen werden
    public List<Travel> bookTravels(List<Travel> cart) {

        // Ergebnisliste der gebuchten Reisen
        List<Travel> booked = new ArrayList<>();

        // Prüfen, ob überhaupt etwas im Warenkorb ist
        if (cart == null || cart.isEmpty()) {
            System.out.println("Keine Buchung möglich: Warenkorb ist leer.");
            return booked;
        }

        // Reisen aus dem Warenkorb übernehmen
        for (Travel t : cart) {
            booked.add(t);
        }

        System.out.println("Buchung erfolgreich durchgeführt.");
        return booked;
    }
}
