package ex_30thjan_programs;

import java.util.Scanner;

public class LargestOfThreeNos {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of A");
       int a = sc.nextInt();
        System.out.println("Enter a Number of B");
       int b= sc.nextInt();
       System.out.println("Enter a Number of C");
       int c= sc.nextInt();
       if(a>b)
       {
           System.out.println("A is  the Largest "+a);
       }
       else if(b>c)
       {
           System.out.println("B is  the Largest "+b);
       }
       else
       {
           System.out.println("C is the largest " +c);
       }
    }
}
