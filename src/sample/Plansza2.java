package sample;

import javafx.event.ActionEvent;

/**
 * Created by pwilkin on 16-Nov-17.
 */
public class Plansza2 {

    private Plansze parentController;

    public void zmienPlansze(ActionEvent actionEvent) {
        parentController.plansza1(actionEvent);
    }

    public void setParentController(Plansze parentController) {
        this.parentController = parentController;
    }

    public Plansze getParentController() {
        return parentController;
    }
}
