package com.bruno.santana;

public class AnotherBuggyClass {

    public void calculate() {
        int result = 10 + 5;
        int unusedVariable = 20;

        System.out.println("Calculation done.");
    }

}
