package ex_30thjan_programs;

import java.util.Scanner;

public class YearIsLeapOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println("It is a leap Year " +year);
        }
        else {
            System.out.println("It is not a leap year");
        }
    }
}
