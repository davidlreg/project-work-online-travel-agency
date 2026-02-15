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

        // Sicherheit: falls keine Liste übergeben wurde
        if (travels == null) {
            return result;
        }

        // Filtertexte vereinheitlichen (klein + ohne Leerzeichen vorne/hinten)
        String start = (startFilter == null) ? "" : startFilter.trim().toLowerCase();
        String destination = (destinationFilter == null) ? "" : destinationFilter.trim().toLowerCase();

        // Jede Reise prüfen
        for (Travel t : travels) {

            // Start prüfen
            if (!start.isEmpty()) {
                if (t.start == null || !t.start.toLowerCase().contains(start)) {
                    continue;
                }
            }

            // Ziel prüfen
            if (!destination.isEmpty()) {
                if (t.destination == null || !t.destination.toLowerCase().contains(destination)) {
                    continue;
                }
            }

            // Preis prüfen
            if (maxPrice != null) {
                if (t.price > maxPrice) {
                    continue;
                }
            }

            // Wenn alles passt: zur Ergebnisliste hinzufügen
            result.add(t);
        }

        return result;
    }
}
