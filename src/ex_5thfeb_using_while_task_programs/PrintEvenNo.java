package ex_5thfeb_using_while_task_programs;

import java.util.Scanner;

public class PrintEvenNo {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        while(num>0)
        {
            for (int i =1;i<=num;i++)
            {
                if(i%2==0)
                {
                    System.out.println(i + " is an Even Number");
                }
            }

            break;
        }
    }
}
