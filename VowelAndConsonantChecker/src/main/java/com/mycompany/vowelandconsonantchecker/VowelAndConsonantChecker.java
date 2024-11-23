/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelandconsonantchecker;

import java.util.Scanner;

/**
 *
 * @author Mikayla
 */
public class VowelAndConsonantChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Vowel and Consonant Checker\n");
        while(true){
            System.out.print("Please enter a letter:");
            String input = scanner.next().toLowerCase();
            
            if(input.equals("0")){
                System.out.println("Thank you for playing. Goodbye");
                break;
            }
            if(input.length() == 1 && Character.isLetter(input.charAt(0))){
                char letter = input.charAt(0);
                if(isVowel(letter)){
                    System.out.println(letter + " is a vowel");
                }else{
                    System.out.println(letter + " is a consonant");
                }
            }else{
                System.out.println("Invalid input. Please enter a single letter.");
            }
        }
        scanner.close();
    }
    public static boolean isVowel(char letter){
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }
}
