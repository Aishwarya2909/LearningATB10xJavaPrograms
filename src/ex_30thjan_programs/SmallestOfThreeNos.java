package ex_30thjan_programs;

import java.util.Scanner;

public class SmallestOfThreeNos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of a ");
        int a =s.nextInt();
        System.out.println("Enter the number of b ");
        int b =s.nextInt();
        System.out.println("Enter the number of c ");
        int c =s.nextInt();
        if(a<b)
        {
            System.out.println("A is the smallest number " +a);
        }
        else if(b<c)
        {
                System.out.println("B is the smallest number " +b);
        }
        else
        {
                System.out.println("C is the smallest number " +c);
        }
     }
}
