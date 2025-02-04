package ex_29thjan_programs;

import java.util.Scanner;

public class CharVowelOrConstant {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch = sc.next().charAt(0);
//        char vowels[] = {'a', 'e', 'i', 'o', 'u'};
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                System.out.println("It is a Vowel");
            }
            else
            {
                System.out.println("It is a Consonant");

            }
        }
        // output: Enter the Character
    //z
    //It is a Consonant
    }
