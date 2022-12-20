package uk.ac.rhul.cs2800.javafxtest;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;


/**
 * The properties of the GUI is handled in this class.
 * 
 * @author ahmet
 *
 */
public class MyView implements ViewInterface {

  @FXML
  private AnchorPane anchorpane;

  @FXML
  private ListView<?> arrlist;

  @FXML
  private Text arrivaltitle;

  @FXML
  private Text corptitle;

  @FXML
  private ListView<?> deplist;

  @FXML
  private Text departuretitle;

  @FXML
  private Text flighttitle;

  @FXML
  private Line line1;

  @FXML
  private Line line2;

  @FXML
  private Line line3;

  @FXML
  private Line line4;

  @FXML
  private MenuBar menubar;

  @FXML
  private Text title;

  @FXML
  private ListView<?> trainlist;

  @FXML
  private VBox vbox;

  @FXML
  private Text version;

}
