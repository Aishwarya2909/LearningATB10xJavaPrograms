package ex_31stjan_programs;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Amstrong number");
     int num = sc.nextInt();
     if(isAmstrongNumber(num))
     {
         System.out.println(num + " is a Amstrong Number");
     }
     else
        {
            System.out.println(num + " is not a Amstrong Number");
        }
    }
    public static boolean isAmstrongNumber(int num)
    {
        int original = num;
        int sum =0;
        int digits = String.valueOf(num).length();// count number of digits

            while(num>0)
            {
                int digit = num % 10;
                sum = (int) (sum + Math.pow(digit, digits));
                num = num/10;
            }
        return sum == original;
    }
}
