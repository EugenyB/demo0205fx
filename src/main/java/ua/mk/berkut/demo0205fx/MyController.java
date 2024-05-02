package ua.mk.berkut.demo0205fx;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import ua.mk.berkut.demo0205fx.model.Student;

import java.util.List;

public class MyController {

    @FXML private TableColumn<Student, Integer> idColumn;
    @FXML private TableColumn<Student, String> nameColumn;
    @FXML private TableColumn<Student, Integer> ageColumn;
    @FXML private TableColumn<Student, Double> ratingColumn;
    @FXML
    private TableView<Student> table;
    @FXML
    private Label label;
    @FXML
    private ListView<String> list;
    @FXML
    private TextArea area;
    @FXML
    private TextField edit;

    public void initialize() {
        list.setItems(FXCollections.observableList(List.of("One", "Two", "Three")));
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
        ratingColumn.setCellValueFactory(new PropertyValueFactory<>("rating"));

        table.setItems(FXCollections.observableList(List.of(
                new Student(1, "John", 20, 87.0),
                new Student(2, "Kate", 22, 74.0),
                new Student(3, "Mike", 19, 91.0)
        )));
    }

    public void hello() {
        String text = edit.getText();
        String s = area.getText() + text + "\n";
        edit.setText("");
        area.setText(s);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Hello");
        alert.setHeaderText(null);
        alert.setContentText(text);
        alert.show();
    }

    public void extractFromList() {
        String s = list.getSelectionModel().getSelectedItem();
        label.setText(s);
    }

    public void close() {
        Platform.exit();
    }

    public void about() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText(null);
        alert.setContentText("This is the about page");
        alert.show();
    }
}