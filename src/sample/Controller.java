package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextArea textArea;

    @FXML
    private TextField textField;

    public void btnSendClick() {

        String text = textArea.getText() + textField.getText() + "\n";
        textField.setText("");
        textField.requestFocus();
        textArea.setText(text);
        textArea.setScrollTop(Double.MAX_VALUE);
    }
}