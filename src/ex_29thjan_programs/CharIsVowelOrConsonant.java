package ex_29thjan_programs;

import java.util.Scanner;

public class CharIsVowelOrConsonant {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch  = s.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("It is Vowel");
        }
        else {
            System.out.println("It is a Consonant");
        }
    }
}
