package ex_31stjan_programs;

import java.util.Scanner;

public class PersonTravel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the passport valid or not valid");
        String passport = sc.next();
        {
            if (passport.equals("valid") && age>=18)
            {
                System.out.println("Person can Travel");
            }
            else {
                System.out.println("Person cannot travel");
            }
        }
    }
}
