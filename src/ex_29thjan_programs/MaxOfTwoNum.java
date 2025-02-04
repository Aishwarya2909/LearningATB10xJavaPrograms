package ex_29thjan_programs;

import java.util.Scanner;

public class MaxOfTwoNum {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number of a ");
        int a = s.nextInt();
        System.out.println("Enter the number of b ");
        int b =s.nextInt();
        if(a>b)
        {
            System.out.println("Print the Maximum value :" +a);
        }
        else
        {
            System.out.println("Print the Maximum value:" +b);
        }
    }
    // output;Enter the number of a
    //2100
    //Enter the number of b
    //3500
    //Print the Maximum value:3500
}
