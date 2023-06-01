package chapter8_Data_Types.exercise;

/*
Validate the complexity of a proposed password by assuring it meets these rules:
at least 8 characters long
contains an uppercase letter
contains a special character
doesn't contain the username
not the same as old password

 */

import java.util.Scanner;

public class PasswordValidator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Username:");
        String userName = scanner.next();
        System.out.println("Old password:");
        String oldPassword = scanner.next();
        System.out.println("New Password:");
        String newPassword = scanner.next();

        scanner.close();

        validateLength(newPassword);
        validateUppercase(newPassword);
        validateSpecialChar(newPassword);
        validateNoUsername(userName, newPassword);
        validateOldPassword(oldPassword, newPassword);
    }

    /**
     * Validate the password length to be at least 8 characters long
     * @param text String to be validated
     */
    public static void validateLength(String text){
        int characterCount = text.length();

        if (characterCount < 8){
            System.out.println("Error: Your password needs to be at least 8 characters long.");
        }else {
            System.out.println("Password is valid.");
        }
    }

    /**
     * Validate the password contains an Uppercase letter
     * @param text String to validate
     */
    public static void validateUppercase(String text){
        boolean containsUpperCase = false;

        for (int i=0; i<text.length(); i++){
            char j = text.charAt(i);
            if (Character.isUpperCase(j)){
                containsUpperCase = true;
                break;
            }
        }if (containsUpperCase){
            System.out.println("Password is valid.");
        }else {
            System.out.println("Error: Your password must contain an Uppercase letter");
        }
    }

    public static void validateSpecialChar(String text){
        boolean containsSpecialCharacters = !text.matches("[a-zA-Z0-9]+");
        if (containsSpecialCharacters){
            System.out.println("Password is valid.");

        }else {
            System.out.println("Error: Password must contain a special character!");
        }
    }

    /**
     * Validate the password doesn't contain the username
     * @param text1 Username
     * @param text2 Password to validate
     */
    public static void validateNoUsername(String text1, String text2){
        boolean doesNotContain = !text2.contains(text1);

        if (doesNotContain){
            System.out.println("Password is valid.");
        }else {
            System.out.println("Error: Password can not contain Username");
        }

    }

    /**
     * Validate that the password is not the same as old password
     * @param text1 Old password
     * @param text2 New password
     */
    public static void validateOldPassword(String text1, String text2){
        boolean matchingOldPassword = !text1.equals(text2);

        if (matchingOldPassword){
            System.out.println("Password is valid.");
        }
        else{
            System.out.println("Error: New Password can't be the same as old password");
        }
    }
}
