package ex_7thfeb_task_programs;
import java.util.Scanner;
public class SumOf100Numbers {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num =sc.nextInt();
        int sum =0;
        for(int i=1; i<=num;i++)
        {
          sum = sum+i;
            System.out.println(sum);
        }

    }
}
