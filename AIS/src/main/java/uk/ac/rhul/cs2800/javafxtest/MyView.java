package uk.ac.rhul.cs2800.javafxtest;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class MyView {

    @FXML
    private AnchorPane anchor_pane;

    @FXML
    private ListView<?> arr_list;

    @FXML
    private Text arrival_title;

    @FXML
    private Text corp_title;

    @FXML
    private ListView<?> dep_list;

    @FXML
    private Text departure_title;

    @FXML
    private Text flight_title;

    @FXML
    private Line line1;

    @FXML
    private Line line2;

    @FXML
    private Line line3;

    @FXML
    private Line line4;

    @FXML
    private MenuBar menu_bar;

    @FXML
    private Text title;

    @FXML
    private ListView<?> train_list;

    @FXML
    private VBox vbox;

    @FXML
    private Text version;

}
