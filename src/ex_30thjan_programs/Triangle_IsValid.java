package ex_30thjan_programs;

import java.util.Scanner;

public class Triangle_IsValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Side A value");
        int slide_A = sc.nextInt();
        System.out.println("Enter the Side B value");
        int slide_B = sc.nextInt();
        System.out.println("Enter the Side C value");
        int slide_C = sc.nextInt();
        if(slide_A + slide_B >slide_C && slide_B+slide_C > slide_A && slide_C+slide_A>slide_B)
        {
            System.out.println("It is a Valid Triangle");
        }
        else {
            System.out.println("It is a Invalid Triangle");
        }
       }
}
