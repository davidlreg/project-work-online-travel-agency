package reisebuero.ui;

import reisebuero.model.Travel;
import java.util.List;

// Zuständig für die Anzeige des Warenkorbs in der Konsole
public class CartView {

    // Gibt alle Reisen im Warenkorb und den Gesamtpreis aus
    public void showCart(List<Travel> cart, double totalPrice) {

        System.out.println();
        System.out.println("===== Warenkorb =====");

        // Prüfen, ob der Warenkorb leer ist
        if (cart.isEmpty()) {
            System.out.println("Der Warenkorb ist leer.");
            return;
        }

        // Alle Reisen im Warenkorb anzeigen
        for (int i = 0; i < cart.size(); i++) {
            System.out.println((i + 1) + ". " + cart.get(i));
        }

        // Gesamtpreis ausgeben
        System.out.println("----------------------");
        System.out.println("Gesamtpreis: " + totalPrice + " EUR");
        System.out.println();
    }
}
