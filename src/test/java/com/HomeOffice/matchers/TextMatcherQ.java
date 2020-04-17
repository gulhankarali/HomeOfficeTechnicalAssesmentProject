package com.HomeOffice.matchers;

public class TextMatcherQ {
    private String text;

    public TextMatcherQ(String text) {
        this.text = text;
    }

    public static TextMatcherQ textOf(String text) {
        return new TextMatcherQ(text);
    }

    public boolean containsIgnoringCase(String expectedText) {
        return text.toLowerCase().contains(expectedText.toLowerCase());
    }
}
