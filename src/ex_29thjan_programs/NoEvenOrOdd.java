package ex_29thjan_programs;

import java.util.Scanner;

public class NoEvenOrOdd {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number");
        int a = s.nextInt();
        if(a%2==0)
        {
            System.out.println("Number is a Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
    // output: Enter the number
    //50
    //Number is a Even
}
