package ex_5thfeb_task_programs;

import java.util.Scanner;

public class PrintEvenNumbers1to20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
       for(int i=1;i<=num;i++)
       {
           if(i%2==0)
           {
               System.out.println(i + " Even number");
           }
       }
    }
}
