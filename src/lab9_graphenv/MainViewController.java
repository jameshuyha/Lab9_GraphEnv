package lab9_graphenv;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;

public class MainViewController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ToggleGroup tg = new ToggleGroup();
        smallItem.setToggleGroup(tg);
        mediumItem.setToggleGroup(tg);
        largeItem.setToggleGroup(tg);
        closeItem.setDisable(true); // disabled until a file is "opened"

        newItem.setAccelerator(KeyCombination.keyCombination("Ctrl+N"));
        
        ContextMenu popup = new ContextMenu();
        MenuItem help = new MenuItem("Help");
        MenuItem inspect = new MenuItem("Inspect");
        popup.getItems().addAll(help, inspect);
        mainPane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.SECONDARY) {
                popup.show(mainPane, e.getScreenX() - 50, e.getScreenY()
                        - 25);
            }
        });
    }

    @FXML
    private MenuItem closeItem;

    @FXML
    private MenuItem copyItem;

    @FXML
    private MenuItem findItem;

    @FXML
    private CheckMenuItem gridItem;

    @FXML
    private RadioMenuItem largeItem;

    @FXML
    private BorderPane mainPane;

    @FXML
    private RadioMenuItem mediumItem;

    @FXML
    private MenuItem newItem;

    @FXML
    private MenuItem openItem;

    @FXML
    private MenuItem replaceItem;

    @FXML
    private MenuItem saveItem;

    @FXML
    private Menu searchMenu;

    @FXML
    private RadioMenuItem smallItem;

    @FXML
    void handleClose(ActionEvent event) {

    }

    @FXML
    void handleCopy(ActionEvent event) {

    }

    @FXML
    void handleFind(ActionEvent event) {

    }

    @FXML
    void handleGrid(ActionEvent event) {
        if (gridItem.isSelected()) {
            System.out.println("USE GRIDLINES selected");
        } else {
            System.out.println("USE GRIDLINES unselected");
        }

    }

    @FXML
    void handleNew(ActionEvent event) {
        System.out.println("NEW has been pressed");
        newItem.setDisable(true);
        openItem.setDisable(true);
        closeItem.setDisable(false);
    }

    @FXML
    void handleOpen(ActionEvent event) {

    }

    @FXML
    void handleReplace(ActionEvent event) {

    }

    @FXML
    void handleSizeLarge(ActionEvent event) {

    }

    @FXML
    void handleSizeMedium(ActionEvent event) {

    }

    @FXML
    void handleSizeSmall(ActionEvent event) {

    }

}
