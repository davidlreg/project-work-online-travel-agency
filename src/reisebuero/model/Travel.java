package reisebuero.model;

// Repräsentiert ein einzelnes Reiseangebot
public class Travel {

    // Eigenschaften der Reise
    public String date;
    public String start;
    public String destination;
    public String route;
    public double price;

    // Konstruktor zum Erstellen einer neuen Reise
    public Travel(String date, String start, String destination, String route, double price) {
        this.date = date;
        this.start = start;
        this.destination = destination;
        this.route = route;
        this.price = price;
    }

    // Legt fest, wie die Reise in der Konsole angezeigt wird
    @Override
    public String toString() {
        return date + " | " + start + " -> " + destination + " | Route: " + route + " | Preis: " + price + " EUR";
    }
}
