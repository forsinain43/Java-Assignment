package com.example.test;

import com.example.gooey.Validate;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class Test {
    @ParameterizedTest
    @ValueSource(strings = {"", "mikl", "@", "@gmail.com", "user.@example.com" +
                            ".user@example.com", "user@example,com"})
    public void invalidEmail(String emails) {
        Validate test = new Validate(emails, "beans123!");
        assertFalse(test.validEmail());
    }

    @ParameterizedTest
    @ValueSource(strings = {"user@example.com", "user.name@example.com"})
    public void validEmail(String emails) {
        Validate test = new Validate(emails, "beans123!");
        assertTrue(test.validEmail());
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "z", "zz", "zzz", "zzzz", "zzzzz", "zzzzzz"})
    public void invalidPassLength(String pass) {
        Validate test = new Validate("user@example.com", pass);
        assertFalse(test.passLength());
    }

    @ParameterizedTest
    @ValueSource(strings = {"zzzzzzz", "zzzzzzzz"})
    public void validPassLength(String pass) {
        Validate test = new Validate("user@example.com", pass);
        assertTrue(test.passLength());
    }

    @ParameterizedTest
    @ValueSource(strings = {"beansbeans"})
    public void invalidPassNums(String pass) {
        Validate test = new Validate("user@example.com", pass);
        assertFalse(test.passNumber());
    }

    @ParameterizedTest
    @ValueSource(strings = {"beansbeans1"})
    public void validPassNums(String pass) {
        Validate test = new Validate("user@example.com", pass);
        assertTrue(test.passNumber());
    }

    @ParameterizedTest
    @ValueSource(strings = {"1234567!"})
    public void invalidPassLetters(String pass) {
        Validate test = new Validate("user@example.com", pass);
        assertFalse(test.passLetter());
    }

    @ParameterizedTest
    @ValueSource(strings = {"BeansBeans!"})
    public void validPassLetters(String pass) {
        Validate test = new Validate("user@example.com", pass);
        assertTrue(test.passLetter());
    }

    @ParameterizedTest
    @ValueSource(strings = {"beans123"})
    public void invalidPassSymbols(String pass) {
        Validate test = new Validate("user@example.com", pass);
        assertFalse(test.passSymbol());
    }

    @ParameterizedTest
    @ValueSource(strings = {"beans123!"})
    public void validPassSymbols(String pass) {
        Validate test = new Validate("user@example.com", pass);
        assertTrue(test.passSymbol());
    }
}