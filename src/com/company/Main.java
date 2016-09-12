package com.company;

import java.util.Random;

    public class Main {

    public static void main(String[] args) {

        //Tests the methods

        System.out.println(isEven(2334));
        System.out.println(sameWords("hi", "HI"));
        printLetters("General Assembly");
        randomNumber();
        System.out.println(addADay(30, 12, 2015));
        everyOtherLetter("Antartica");
        skip4(6);
        System.out.println(testingMath(6, 5));
        printCountry();
        consonantOrVowel();

    }
    // Function 1
    public static boolean isEven(double evenOrOdd){

        if (evenOrOdd == 0){
            return false;
        }
        else if (evenOrOdd % 2.0 == 0.0){
            return true;
        }
        else {
            return false;
        }
    }
    // Function 2
    public static boolean sameWords(String word1, String word2){

        if (word1.equalsIgnoreCase(word2)) {
            return true;
        }
        else {
            return false;
        }
    }
    // Function 3
    public static void printLetters(String breakMeUp){

        for (int i = 0; i < breakMeUp.length(); i++){
            if ((breakMeUp.charAt(i)) == 'w'){
                break;
            }
            System.out.println(breakMeUp.charAt(i));
        }
    }
    // Function 4
    public static int randomNumber(){

        int random = (int) (Math.random() * 100);
        System.out.println(random);

        if (random > 50){
            return random;
        }
        else {
            return -1;
        }
    }
    // Function 5 - assumes every month is 30 days
    public static String addADay(int day, int month, int year){

        if (day < 30){
            day++;
            return "day:" + day + " month:" + month + " year:" + year;
        }
        else if (month < 12){
            day = 1;
            month++;
            return "day:" + day + " month:" + month + " year:" + year;
        }
        else {
            day = 1;
            month = 1;
            year++;
            return "day:" + day + " month:" + month + " year:" + year;
        }
    }
    // Function 6
    public static void everyOtherLetter(String halfWord){

        for (int i = 0; i < halfWord.length(); i += 2) {
            System.out.print(halfWord.charAt(i));
        }
        System.out.println("");
    }
    // Function 7
    public static void skip4(int greaterThan5){

        if (greaterThan5 <= 5){
            System.out.println("Please enter a number greater than 5");
        }
        else {
            int i = 1;
            while (i <= greaterThan5){
                if (i == 4){
                    i++;
                }
                System.out.println(i);
                i++;
            }

        }
    }
    // Function 8
    public static int testingMath(int firstNum, int secondNum){

        if (firstNum == secondNum){
            return firstNum + secondNum + 4;
        }
        else {
            return firstNum + secondNum + 2;
        }
    }
    // Function 9
    public static void printCountry(){

        System.out.println("Please enter a country domain.");
        Scanner input = new Scanner(System.in);
        String countryDomain = input.nextLine();
        countryDomain = countryDomain.toLowerCase();

        switch (countryDomain) {
            case "us":
                System.out.println("United States");
                break;
            case "de":
                System.out.println("Germany");
                break;
            case "hu":
                System.out.println("Hungary");
                break;
            default:
                System.out.println("Unknown");
        }
    }
    // Function 10
    public static void consonantOrVowel(){

        System.out.println("Enter a single letter.");
        Scanner input = new Scanner(System.in);
        String letter = input.nextLine();
        letter = letter.toLowerCase();

        if (letter.length() > 1){
            System.out.println("That is not a single letter");
            consonantOrVowel();
        }
        else {
            switch (letter){
                case "a":
                    System.out.println("vowel!");
                    break;
                case "e":
                    System.out.println("vowel!");
                    break;
                case "i":
                    System.out.println("vowel!");
                    break;
                case "o":
                    System.out.println("vowel!");
                    break;
                case "u":
                    System.out.println("vowel!");
                    break;
                case "y":
                    System.out.println("vowel... sometimes");
                    break;
                default:
                    System.out.println("That's a consonant!");
            }
        }
    }


}


