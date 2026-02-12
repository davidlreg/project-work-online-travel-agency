package reisebuero.ui;

import reisebuero.model.Travel;
import java.util.List;

public class TravelListView {

     // Zeigt alle Reisen in der Konsole an
    public void showTravels(List<Travel> travels) {

        System.out.println();
        System.out.println("Verfügbare Reisen:");
        System.out.println("-------------------");

        for (int i = 0; i < travels.size(); i++) {
            System.out.println((i + 1) + ". " + travels.get(i));
        }

        System.out.println();
    }

}
