package ex_01stfeb_task_programs;

import java.util.Scanner;

public class ConvertDaysintoMYD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days");
        int days = sc.nextInt();
        int years, months, remaining_days,days_left;
        if(days>0)
        {
            years =  days/365;
            remaining_days = days%365;
            months = remaining_days / 30;
            days_left = remaining_days % 30;
           // System.out.println(remaining_days);
            System.out.println(years +" years" +" "  +months +" months"+" "  + days_left +" days" );
        }
        else
        {
            System.out.println("No years and Months");
        }
    }
}
