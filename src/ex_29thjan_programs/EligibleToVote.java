package ex_29thjan_programs;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a age");
        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("Eligible to Vote");
        }
        else
        {
            System.out.println("Not Eligible to Vote");
        }
    }
//  output:   Enter a age
//40
//    Eligible to Vote

}
