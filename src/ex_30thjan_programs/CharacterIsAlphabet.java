package ex_30thjan_programs;

import java.util.Scanner;

public class CharacterIsAlphabet {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Character");
         char ch = sc.next().charAt(0);
         if((ch>='A' && ch <='Z') || (ch >= 'a' && ch <= 'z'))
         {
             System.out.println("It is an Alphabet");
         }
         else
         {
             System.out.println("it is not an Alphabet");
         }
    }
}
