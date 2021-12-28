package ru.geekbrains.hw4;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Controller {
    @FXML
    public TextField textField;
    @FXML
    public TextArea mainTextArea;
    public MenuItem close;
    public Button btn23;
    private ActionEvent actionEvent;

    public void btnOneClickAction(ActionEvent actionEvent) {
        System.out.println(1);
    }

    public void clickBtnSendText(ActionEvent actionEvent) {
        mainTextArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();
    }

    public void clickClose(ActionEvent actionEvent) {
        Platform.runLater(() -> {
            Stage stage = (Stage) btn23.getScene().getWindow();
            stage.close();
        });
    }
}