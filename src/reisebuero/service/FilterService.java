package reisebuero.service;

import reisebuero.model.Travel;

import java.util.ArrayList;
import java.util.List;

// Filtert Reiseangebote
public class FilterService {

    // Filtert nach Start, Ziel und Maximalpreis
    public List<Travel> filterTravels(List<Travel> travels, String startFilter, String destinationFilter,
            Double maxPrice) {

        // Ergebnisliste
        List<Travel> result = new ArrayList<>();

        // Fehlerbehandlung falls keine Liste übergeben wurde
        if (travels == null) {
            return result;
        }

        // Filtertexte vereinheitlichen
        String start = (startFilter == null) ? "" : startFilter.trim().toLowerCase();
        String destination = (destinationFilter == null) ? "" : destinationFilter.trim().toLowerCase();

        // Jede Reise überprüfen
        for (Travel t : travels) {

            // Start prüfen wenn ein Kriterium angegeben wurde
            if (!start.isEmpty()) {
                if (t.start == null || !t.start.toLowerCase().contains(start)) {
                    continue;
                }
            }

            // Ziel prüfen wenn ein Kriterium angegeben wurde
            if (!destination.isEmpty()) {
                if (t.destination == null || !t.destination.toLowerCase().contains(destination)) {
                    continue;
                }
            }

            // Preis prüfen wenn ein Kriterium angegeben wurde
            if (maxPrice != null) {
                if (t.price > maxPrice) {
                    continue;
                }
            }

            // Ergebnis zur Liste hinzufügen
            result.add(t);
        }

        return result;
    }
}
