package ex_5thfeb_using_while_task_programs;

import java.util.Scanner;

public class SumOf10NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum=0;
        while(num>0)
        {
            for(int i =0;i<=num;i++)
            {
                sum = sum+i;
                System.out.println(sum);
            }
            break;
        }
    }
}
