package ex_01stfeb_task_programs;
import java.util.Scanner;
public class PersonIsSeniorCitizen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        int child_age, adult_age, senior_age;
        if(age<=12)
        {
            System.out.println(age +" This is a Children's age");
        } else if (age<=19) {
            System.out.println(age + " This is a Teenager age");
        }
        else if (age<=64) {
            System.out.println(age + " This is an Adult age");
        }
        else {
            System.out.println(age + " This is a Senior Age");
        }
    }
}
