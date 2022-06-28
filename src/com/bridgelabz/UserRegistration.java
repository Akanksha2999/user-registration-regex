package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {

        System.out.println("Welcome to user registration program");
        boolean firstName = Pattern.matches("[A-Z][a-z]{3,15}", "Akanksha");//true (A to Z comes one time and a to z comes atleast 3 times and maximum 15 times)

        System.out.println("First Name : " + firstName);

    }
}
