package ex_31stjan_programs;
import java.util.Scanner;
public class PersonIsEligibleForLoan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the Salary");
        double salary = sc.nextDouble();
        System.out.println("Enter the Credit Score");
        int credit_score = sc.nextInt();

            if(age>18&&age<80 && salary>15000&&salary<30000 && credit_score>650&&credit_score<750)
            {
                System.out.println("Eligible for loan");
            }
          else {
                System.out.println("Not Eligible for loan");
           }
    }
}   


