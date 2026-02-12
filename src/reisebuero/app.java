package reisebuero;

import reisebuero.data.CsvTravelLoader;
import reisebuero.model.Travel;
import reisebuero.ui.MainView;
import reisebuero.ui.TravelListView;

import java.util.List;

public class App {

    public static void main(String[] args) {

        CsvTravelLoader loader = new CsvTravelLoader();
        MainView mainView = new MainView();
        TravelListView travelView = new TravelListView();

        boolean running = true;

        while (running) {

            String choice = mainView.showMenu();

            if (choice.equals("1")) {

                List<Travel> travels = loader.loadTravels("resources/traveldata.csv");

                travelView.showTravels(travels);

            } else if (choice.equals("0")) {

                running = false;

            } else {

                System.out.println("Ungültige Eingabe.");
            }
        }
    }
}
