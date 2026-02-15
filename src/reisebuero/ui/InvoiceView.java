package reisebuero.ui;

import reisebuero.model.Travel;

import java.time.LocalDate;
import java.util.List;

// Zuständig für die Ausgabe einer Rechnung in der Konsole
public class InvoiceView {

    // Gibt eine Rechnung für gebuchte Reisen aus
    public void showInvoice(List<Travel> bookedTravels, double totalPrice) {

        System.out.println();
        System.out.println("===== RECHNUNG =====");

        // Falls keine Reisen gebucht wurden
        if (bookedTravels == null || bookedTravels.isEmpty()) {
            System.out.println("Es liegen keine gebuchten Reisen vor.");
            System.out.println();
            return;
        }

        // Rechnungsdatum ausgeben
        System.out.println("Rechnungsdatum: " + LocalDate.now());
        System.out.println("--------------------");

        // Gebuchte Reisen ausgeben
        for (int i = 0; i < bookedTravels.size(); i++) {
            System.out.println((i + 1) + ". " + bookedTravels.get(i));
        }

        // Gesamtpreis ausgeben
        System.out.println("--------------------");
        System.out.println("Gesamtpreis: " + totalPrice + " EUR");
        System.out.println("====================");
        System.out.println();
    }
}
