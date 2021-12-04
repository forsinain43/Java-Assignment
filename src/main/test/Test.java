package com.example.gooey;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class Test {
    @ParameterizedTest
    @ValueSource(strings = {""});
    public void invalidEmail(string emails) {
        Validate test = new Validate(emails, "Beansbeans123!");
        assertFalse(test.validEmail());
    }
}