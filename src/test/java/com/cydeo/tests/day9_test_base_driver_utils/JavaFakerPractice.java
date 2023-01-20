package com.cydeo.tests.day9_test_base_driver_utils;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

import java.util.Locale;

public class JavaFakerPractice {

    @Test
    public void test1() {

        //Creating Faker object to reach methods
        Faker faker = new Faker(new Locale("fr"));

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.numerify(\"###-###-##-##\") = " + faker.numerify("532-###-##-##"));

        //letterify() method will return random letter wher we pass "?"
        System.out.println("faker.letterify(\"?????\") = " + faker.letterify("?????-??-x"));

        //bothify()
        System.out.println("faker.bothify(\"##??##-##???###\") = " + faker.bothify("##??##-##???###"));

        //creditCard()
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("-"," "));

        //chuckNorris
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());


    }


}
