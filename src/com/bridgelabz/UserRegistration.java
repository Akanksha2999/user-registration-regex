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
        System.out.println("");

        System.out.println("All valid email samples validation is as follows : ");
        boolean emailSample_1 = Pattern.matches("[a-z]+[@][a-z]+[.][a-z]{3,5}", "abc@yahoo.com");//true
        System.out.println("Email Id_1 : " + emailSample_1);
        boolean emailSample_2 = Pattern.matches("[a-z]+[-][0-9]+[@][a-z]+[.][a-z]{3,5}", "abc-100@yahoo.com");//true
        System.out.println("Email Id_2 : " + emailSample_2);
        boolean emailSample_3 = Pattern.matches("[a-z]+[.][0-9]+[@][a-z]+[.][a-z]{3,5}", "abc.100@yahoo.com");//true
        System.out.println("Email Id_3 : " + emailSample_3);
        boolean emailSample_4 = Pattern.matches("[a-z]+[0-9]+[@][a-z]+[.][a-z]{3,5}", "abc111@abc.com");//true
        System.out.println("Email Id_4 : " + emailSample_4);
        boolean emailSample_5 = Pattern.matches("[a-z]+[-][0-9]+[@][a-z]+[.][a-z]{3,5}", "abc-100@abc.net");//true
        System.out.println("Email Id_5 : " + emailSample_5);
        boolean emailSample_6 = Pattern.matches("[a-z]+[.][0-9]+[@][a-z]+[.][a-z]{3,5}[.][a-z]{2,5}", "abc.100@abc.com.au");//true
        System.out.println("Email Id_6 : " + emailSample_6);
        boolean emailSample_7 = Pattern.matches("[a-z]+[@][0-9][.][a-z]{3,5}", "abc@1.com");//true
        System.out.println("Email Id_7 : " + emailSample_7);
        boolean emailSample_8 = Pattern.matches("[a-z]+[@][a-z]{5,}[.][a-z]{3,}[.][a-z]{3,}", "abc@gmail.com.com");//true
        System.out.println("Email Id_8 : " + emailSample_8);
        boolean emailSample_9 = Pattern.matches("[a-z]+[-][.][+][:][0-9]+[@][0-9][a-z]{5,}[.][a-z]{3,}[.][a-z]{3,}[.][a-z]{2,}[.][a-z]{3,}", "abc-.+:100@1gmail.com.com.au.net");//true
        System.out.println("Email Id_9 : " + emailSample_9);

        System.out.println("");

        System.out.println("All the invalid email samples validation ia as follows : ");
        boolean invalidEmailSample_1 = Pattern.matches("[a-z]+[@][a-z]+[.][a-z]{2,5}", "abc");//false
        System.out.println("Email Id_1 : " + invalidEmailSample_1);
        boolean invalidEmailSample_2 = Pattern.matches("[a-z]+[@][a-z]+[.][a-z]{2,5}", "abc@.com.my");//false
        System.out.println("Email Id_2 : " + invalidEmailSample_2);
        boolean invalidEmailSample_3 = Pattern.matches("[a-z]+[0-9]+[@][a-z]+[.][a-z]{2,5}", "abc123@gmail.a");//false
        System.out.println("Email Id_3 : " + invalidEmailSample_3);
        boolean invalidEmailSample_4 = Pattern.matches("[a-z]+[0-9]+[@][a-z]+[.][a-z]{2,5}", "abc123@.com");//false
        System.out.println("Email Id_4 : " + invalidEmailSample_4);
        boolean invalidEmailSample_5 = Pattern.matches("[a-z]+[0-9]+[@][a-z]+[.][a-z]{2,5}", "abc123@.com.com");//false
        System.out.println("Email Id_5 : " + invalidEmailSample_5);
        boolean invalidEmailSample_6 = Pattern.matches("[a-z]+[0-9]+[@][a-z]+[.][a-z]{2,5}", ".abc@abc.com");//false
        System.out.println("Email Id_6 : " + invalidEmailSample_6);
        boolean invalidEmailSample_7 = Pattern.matches("[a-z]+[0-9]+[@][a-z]+[.][a-z]{2,5}", "abc()*@gmail.com");//false
        System.out.println("Email Id_7 : " + invalidEmailSample_7);
        boolean invalidEmailSample_8 = Pattern.matches("[a-z]+[0-9]+[@][a-z]+[.][a-z]{2,5}", "abc@%*.com");//false
        System.out.println("Email Id_8 : " + invalidEmailSample_8);
        boolean invalidEmailSample_9 = Pattern.matches("[a-z]+[0-9]+[@][a-z]+[.][a-z]{2,5}", "abc..2002@gmail.com");//false
        System.out.println("Email Id_9 : " + invalidEmailSample_9);
        boolean invalidEmailSample_10 = Pattern.matches("[a-z]+[0-9]+[@][a-z]+[.][a-z]{2,5}", "abc.@gmail.com");//false
        System.out.println("Email Id_10 : " + invalidEmailSample_10);
        boolean invalidEmailSample_11 = Pattern.matches("[a-z]+[0-9]+[@][a-z]+[.][a-z]{2,5}", "abc@abc@gmail.com");//false
        System.out.println("Email Id_11 : " + invalidEmailSample_11);
        boolean invalidEmailSample_12 = Pattern.matches("[a-z]+[0-9]+[@][a-z]+[.][a-z]{2,5}", "abc@gmail.com.1a");//false
        System.out.println("Email Id_12 : " + invalidEmailSample_12);
        boolean invalidEmailSample_13 = Pattern.matches("[a-z]+[0-9]+[@][a-z]+[.][a-z]{2,5}", "abc@gmail.com.aa.au");//false
        System.out.println("Email Id_13 : " + invalidEmailSample_13);


    }
}
