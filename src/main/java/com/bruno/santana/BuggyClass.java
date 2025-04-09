package com.bruno.santana;

public class BuggyClass {

    public void process(String text) {
        if (text != null && text.length() > 5) {
            System.out.println(text.toLowerCase());
        } else {
            String lower = text.toLowerCase(); //Potential NullPointerException
            System.out.println(lower);
        }
    }

}
