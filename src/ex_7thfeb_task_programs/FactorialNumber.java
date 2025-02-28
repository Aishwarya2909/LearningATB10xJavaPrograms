package ex_7thfeb_task_programs;
import java.util.Scanner;
public class FactorialNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Factorial Number");
        int fact_num = sc.nextInt();
        int fact=1;
        for(int i=1;i<=fact_num;i++)
        {
           fact = fact*i;

        }
        System.out.println("factorial of " +fact_num + " is :" +fact);


    }
}
