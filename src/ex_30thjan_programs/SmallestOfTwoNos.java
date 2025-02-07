package ex_30thjan_programs;

import java.util.Scanner;

public class SmallestOfTwoNos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of a ");
        int a = s.nextInt();
        System.out.println("Enter the number of b ");
        int b = s.nextInt();
        if(a<b)
        {
            System.out.println("a is the smallest " +a);
        }
        else
        {
            System.out.println("b is the smallest " +b);
        }
        }
}
