package ex_5thfeb_task_programs;

import java.util.Scanner;

public class MultiplicationOf5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the multiply number");
        int num =sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(num*i);
        }
    }
}

