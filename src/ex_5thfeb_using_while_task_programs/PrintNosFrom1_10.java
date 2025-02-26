package ex_5thfeb_using_while_task_programs;

import java.util.Scanner;

public class PrintNosFrom1_10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num =sc.nextInt();
        int i = 1;
        while(i<=num)
        {
            System.out.println(i);
            i++;
        }
    }
}
