package com.example.gooey;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class RegisterController {
    public TextField email = new TextField();
    public PasswordField pass = new PasswordField();
    public Button submit = new Button("Register");
    public Label response;

    public void register() {
        Validate user = new Validate(email.getText(),
                                     pass.getText());

        if (!user.validEmail()) { // check if email is valid
            response.setText("invalid email");
        } else if (!user.passLength()) { // pass too short
            response.setText("password length too short(min 7)");
        } else if (!user.passLetter()) { // no letter in pass
            response.setText("password must contain a letter");
        } else if (!user.passNumber()) { // no digit in pass
            response.setText("password must contain a number");
        } else if (!user.passSymbol()) { // no symbol in pass
            response.setText("password must contain a symbol (^&@!)");
        } else  { // valid email and pass
            response.setText("success");
        }
    }
}