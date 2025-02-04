package ex_29thjan_programs;

import java.util.Scanner;

public class NoPositiveandNegative {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number");
        int a = s.nextInt();
        if(a>0)
        {
            System.out.println("Number is a positive");
        }
        else
        {
            System.out.println("Number is Negative");
        }
    }
// Enter the number
//85
//Number is a positive
}
