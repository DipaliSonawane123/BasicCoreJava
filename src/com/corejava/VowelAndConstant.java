/* Java Program to Check Whether an Alphabet is Vowel or Consonant*/

package com.corejava;
import java.util.Scanner;
public class VowelAndConstant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char alphabet = scanner.next().charAt(0);
        switch (alphabet) {
            case 'a', 'A':
            case 'e', 'E':
            case 'i', 'I':
            case 'o', 'O':
            case 'u', 'U':
                System.out.println("it is vowel");
                break;
            default:
                if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z')) {
                    System.out.println("it is a consonant");
                } else {
                    System.out.println("please enter alphabet");
                }
        }
    }
}