package reisebuero.data;

import reisebuero.model.Travel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

// Lädt Reisedaten aus einer CSV-Datei
public class CsvTravelLoader {

    // Gibt eine Liste aller eingelesenen Reisen zurück
    public List<Travel> loadTravels(String filePath) {

        // Liste zum Speichern der Reisen
        List<Travel> travelList = new ArrayList<>();

        try {
            // Datei öffnen
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;

            // Header überspringen
            reader.readLine();

            // Jede Zeile der Datei lesen
            while ((line = reader.readLine()) != null) {

                // Zeile am Semikolon trennen
                String[] parts = line.split(";");

                // Prüfen, ob alle 5 Werte vorhanden sind
                if (parts.length == 5) {

                    String date = parts[0];
                    String start = parts[1];
                    String destination = parts[2];
                    String route = parts[3];

                    // Preis von String in Zahl umwandeln
                    double price = Double.parseDouble(parts[4]);

                    // Travel-Objekt erstellen und zur Liste hinzufügen
                    Travel travel = new Travel(date, start, destination, route, price);
                    travelList.add(travel);
                }
            }

            // Datei schließen
            reader.close();

        } catch (Exception e) {
            System.out.println("Fehler beim Laden der Datei.");
        }

        // Liste zurückgeben
        return travelList;
    }
}
