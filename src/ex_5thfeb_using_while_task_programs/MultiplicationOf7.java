package ex_5thfeb_using_while_task_programs;

import java.util.Scanner;

public class MultiplicationOf7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the multiply number");
        int num = sc.nextInt();

        while(num>0){

            for (int i = 1; i <= 10; i++) {
                System.out.println(num * i);
            }
            break;
        }
    }
}
