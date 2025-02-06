package ex_30thjan_programs;

import java.util.Scanner;

public class NoIsPrime {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = s.nextInt();
        if(num<2)
        {
            System.out.println("It is not a Prime number");
        }
        else {
            boolean isPrime = true;
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0)
                {
                    isPrime= false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(num + " is a Prime Number");
            }
            else {
                System.out.println( num + " is not a Prime Number");
            }

        }
    }
}