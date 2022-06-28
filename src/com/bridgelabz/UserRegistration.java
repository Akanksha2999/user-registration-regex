package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {

        System.out.println("Welcome to user registration program");
        boolean firstName = Pattern.matches("[A-Z][a-z]{3,15}", "Akanksha");//true (A to Z comes one time and a to z comes atleast 3 times and maximum 15 times)
        System.out.println("First Name : " + firstName);

        boolean lastName = Pattern.matches("[A-Z][a-z]{3,10}", "Jadhav");//true (A to Z comes one time and a to z comes atleast 3 times and maximum 10 times)
        System.out.println("Last Name : " + lastName);

        boolean emailId = Pattern.matches("[a-z][a-z A-Z 0-9]+[@][a-z]+[.][a-z]{2,5}", "akankshajadhav2999@gmail.com");//true (a to z one time then a to z or A to Z or O to 9 multiple times then special character "@" then a to z multiple times then special character "." and lastly a to z minimum 2 times and maximum 5 times)
        System.out.println("Email Id : " + emailId);

        boolean mobileNumber = Pattern.matches("[+]91 [6789][0-9]{9}", "+91 8828166460");//true (a to z one time then a to z or A to Z or O to 9 multiple times then special character "@" then a to z multiple times then special character "." and lastly a to z minimum 2 times and maximum 5 times)
        System.out.println("Mobile Number : " + mobileNumber);

        boolean password_1 = Pattern.matches("[a-z A-Z]{8,}", "akankshaJadhav ");//true (a to z one time then a to z or A to Z or O to 9 multiple times then special character "@" then a to z multiple times then special character "." and lastly a to z minimum 2 times and maximum 5 times)
        System.out.println("Password Number 1 : " + password_1);

        boolean password_2 = Pattern.matches("(?=.*[A-Z])[a-z A-Z]{8,}", "AkankshaJadhav ");//true (Atleast 1 uppercase in password)
        System.out.println("Password Number 2 : " + password_2);

        boolean password_3 = Pattern.matches("(?=.*[A-Z])(?=.*\\d)[a-z A-Z 0-9]{8,}", "AkankshaJadhav99 ");//true (Atleast 1 numeric number in password)
        System.out.println("Password Number 3 : " + password_3);

        boolean password_4 = Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.-^*()%!])[a-z A-Z 0-9 $&+,:;=?@#|'<>.-^*()%!]{8,}", "AkankshaJadhav@99 ");//true (Atleast 1 special character in password)
        System.out.println("Password Number 4 : " + password_4);
    }
}
