package sample;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

/**
 * Created by pwilkin on 16-Nov-17.
 */
public class Plansze {
    public Pane plansza;

    public void plansza1(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("plansza1.fxml"));
        try {
            Parent pane = loader.load();
            Plansza1 cntr = loader.getController();
            cntr.setParentController(this);
            plansza.getChildren().clear();
            plansza.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void plansza2(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("plansza2.fxml"));
        try {
            Parent pane = loader.load();
            Plansza2 cntr = loader.getController();
            cntr.setParentController(this);
            plansza.getChildren().clear();
            plansza.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
