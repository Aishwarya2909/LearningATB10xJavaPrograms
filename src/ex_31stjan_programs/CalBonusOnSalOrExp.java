package ex_31stjan_programs;

import java.util.Scanner;

public class CalBonusOnSalOrExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary");
        int salary = sc.nextInt();
        System.out.println("Enter the years of Experience");
        float exp = sc.nextFloat();
        int total_Salary = 0 ;
        if(exp<=3) {
            total_Salary = (int) (salary*5/100)+salary;
            System.out.println("Before Bonus : " +salary);
            System.out.println("Salary After Bonus : " + total_Salary);
        }
        else if (exp<=6) {
            total_Salary = (int) (salary*10/100) + salary;
            System.out.println("Before Bonus : " +salary);
            System.out.println("Salary After Bonus : " + total_Salary);
        }
        else if (exp>6) {
            total_Salary = (int) (salary*15/100) + salary;
            System.out.println("Before Bonus : " +salary);
            System.out.println("Salary After Bonus : " + total_Salary);
        }
        else
        {
            System.out.println("No Bonus or No Increment");
        }
    }
}
