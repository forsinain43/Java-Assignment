package com.example.gooey;
import java.util.regex.Pattern;

public class Validate {
    private String email;
    private String pass;

    final Pattern passLetters = Pattern.compile("[a-z A-Z]");
    final Pattern passDigits = Pattern.compile("[\\d]");
    final Pattern passSymbols = Pattern.compile("[*!?&@%]");
    final Pattern emailSyntax = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$");

    public Validate(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPass() {
        return this.pass;
    }

    public boolean validEmail() {
        return emailSyntax.matcher(this.email).find();
    }

    public boolean passLength() {
        return this.pass.length() >= 7;
    }

    public boolean passNumber() {
        return passDigits.matcher(this.pass).find();
    }

    public boolean passSymbol() {
        return passSymbols.matcher(this.pass).find();
    }

    public boolean passLetter() {
        return passLetters.matcher(this.pass).find();
    }
}
