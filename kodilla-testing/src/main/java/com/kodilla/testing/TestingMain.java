package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("First unit test: ");


        Calculator calculator = new Calculator("Sony Calculator", 5, 10);

        String result2 = calculator.getDeviceName();

        if (result2.equals("Sony Calculator")) {
            System.out.println("test2 OK");
        } else {
            System.out.println("Error2");
        }

        Integer adding = calculator.add();

        if (adding.equals(int a +int b)) {
            System.out.println("test adding OK");
        }else {
            System.out.println("Error adding");
        }

        Integer subtracting = calculator.subtract();

        if (subtracting.equals(int a - int b)) {
            System.out.println("test subtracting OK");
        }else {
            System.out.println("Error subtracting");
        }
    }
}



