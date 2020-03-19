package ba.unsa.etf.rs.tutorijal2;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label labela;

    public void promijenitekst(ActionEvent actionEvent) {
        labela.setText("Hello world!");
    }
}
