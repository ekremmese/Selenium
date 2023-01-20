package com.cydeo.tests.day9_test_base_driver_utils;

public class Singleton {

    //#1- Create private constructor
    private Singleton() {
    }

    //#2- create private static String
    //prevent access and provide a getter method
    private static String word;

    //This utility method will return the "word" in the wat we want to return
    public static String getWord() {
        if (word == null) {
            System.out.println("First time call. Word object is null. " + " Assigning value to it now!");
            word = "Something";
        } else {
            System.out.println("Word already has value");
        }
        return word;
    }


}
