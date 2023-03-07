package day11_string;

import java.util.Scanner;

public class DigitLetterSpecialChar {

    public static void main(String[] args) {
            while(true){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to check entryirst character");
        String entry = input.nextLine();

        if (entry.length()>0) {           //without writing of this line code gives error when empty string exists
            if (Character.isDigit(entry.charAt(0))) {             //if( entry >= '0' && entry <= '9'){
                System.out.println("first character is digit");
            } else if (Character.isLetter(entry.charAt(0))) {     //else if( entry >= 'A' && entry <= 'Z'){
                if (Character.isLowerCase(entry.charAt(0))) {      //else if( entry >= 'a' && entry <= 'z'){
                    System.out.println("first character is lowercase letter");
                } else {
                    System.out.println("first character is uppercase letter");
                }
            } else {// if (Character.isSpaceChar(entry.charAt(0))) {
                System.out.println("first character is special character");
            }
        }else{
            System.out.println("String is empty! ");
        }

        }
    }
}

/*
3. Create a class named DigitLetterSpecialChar and wirte a program that can ask the user to enter a word
        - if the word starts with digits, print "first character is digit"
                - if the word starts with uppercase letters, print "first character is lowercase letter"
                - if the word starts with lowercase letters, print "first character is uppercase letter"
                - if the word starts with special characters, print "first character is special character"


                HINT: You need to check the ascii table*/
