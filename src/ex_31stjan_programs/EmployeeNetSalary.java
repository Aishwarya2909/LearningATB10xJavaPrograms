package ex_31stjan_programs;

import java.util.Scanner;

public class EmployeeNetSalary {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Basic Pay");
        int basic_pay =sc.nextInt();
        System.out.println("Enter the HRA Percentage");
        double hra_percentage = sc.nextDouble();
        System.out.println("Enter the DA Percentage");
        double da_percentage = sc.nextDouble();
        System.out.println("Enter the tax percentage");
        double tax_percentage=sc.nextDouble();
        int hra_amt,da_amt,tax_amt,gross_salary,net_salary;

        if(basic_pay>0)
        {
            System.out.println("Basic pay : " +basic_pay);
          hra_amt = (int) ((int)basic_pay*hra_percentage/100);
            System.out.println("HRA Amount : " +hra_amt);

            da_amt =(int) ((int)basic_pay*da_percentage/100);
            System.out.println("DA Amount : " +da_amt);

            gross_salary = basic_pay+hra_amt + da_amt;
            System.out.println("Gross Salary : " +gross_salary);

            tax_amt = (int)((int)gross_salary*tax_percentage/100);
            System.out.println("Tax Amount : " +tax_amt);

            net_salary = gross_salary - tax_amt;
            System.out.println("Net Salary : " +net_salary);
        }
        else
        {
            System.out.println("Employee salary failed to calculate");
        }

    }
}
