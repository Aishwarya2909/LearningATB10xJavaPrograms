package ex_31stjan_programs;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units ");
        double units = sc.nextDouble();
        double bill;
        if(units>0 && units<=100)
        {
            bill = units * 0.50;
            System.out.println(bill + " Electricitybill");
        } else if (units>100 && units<=200) {
            bill = (100*0.50)+((units-100) *0.75);
            System.out.println(bill + " Electricitybill");
        }
        else if(units>200 && units<=300)
        {
            bill =((100*0.50)+(100*0.75)+(units-200)*1.20);
            System.out.println(bill + " Electricitybill");
        }
        else if (units>300) {
            bill =((100*0.50)+(100*0.75)+(100*1.20)+(units-300)* 1.50);
            System.out.println(bill + " Electricitybill");
        }
        else {
            System.out.println("ElectricityBill failed");
        }
    }
}
