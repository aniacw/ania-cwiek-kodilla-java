package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(7.8, 4.7);
        } catch (Exception e){
            System.out.println("Error");
        }finally {
            System.out.println("End");
        }
    }
}
