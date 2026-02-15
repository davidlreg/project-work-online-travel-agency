package reisebuero.service;

import reisebuero.model.Travel;
import java.util.ArrayList;
import java.util.List;

// Verwaltet den Warenkorb der Anwendung
public class CartService {

    // Liste der ausgewählten Reisen
    private List<Travel> cart = new ArrayList<>();

    // Fügt eine Reise zum Warenkorb hinzu
    public void addToCart(Travel travel) {
        cart.add(travel);
        System.out.println("Reise wurde zum Warenkorb hinzugefügt.");
    }

    // Gibt alle Reisen im Warenkorb zurück
    public List<Travel> getCart() {
        return cart;
    }

    // Berechnet den Gesamtpreis aller Reisen im Warenkorb
    public double getTotalPrice() {
        double sum = 0;

        // Preise aller Reisen addieren
        for (Travel t : cart) {
            sum += t.price;
        }

        return sum;
    }

    // Leert den Warenkorb
    public void clearCart() {
        cart.clear();
    }

}
