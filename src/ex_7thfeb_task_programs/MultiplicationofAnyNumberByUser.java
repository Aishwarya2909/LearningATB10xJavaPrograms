package ex_7thfeb_task_programs;
import java.util.Scanner;
public class MultiplicationofAnyNumberByUser {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Multiplication Number");//give any number
        int mul_num = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(mul_num*i);
        }
    }
}
