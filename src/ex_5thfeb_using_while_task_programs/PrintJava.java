package ex_5thfeb_using_while_task_programs;

import java.util.Scanner;

public class PrintJava {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Java How Many Times");
        int num = sc.nextInt();
        while(num>0)
        {
            for(int i =1;i<=num;i++) {
                System.out.println("Java");
            }
            break;
        }
    }
}
