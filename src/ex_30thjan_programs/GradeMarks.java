package ex_30thjan_programs;

import java.util.Scanner;

public class GradeMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks");
        int marks = sc.nextInt();
        //Marks Range Grade
        //
        //90 - 100   A+
        //
        //80 - 89     A
        //
        //70 - 79      B
        //
        //60 - 69     C
        //
        //50 - 59      D
        //
        //40 - 49      E
        //
        //Below 40   Fail
        if(marks<0||marks>100)
        {
            System.out.println("Enter the marks from 0 to 100");
        }
        else
        {
            String  grade;
            if(marks>=90)
            {
                grade = "A+";
            }
            else if(marks>=80)
            {
                grade = "A";
            }
            else if(marks>=70)
            {
                grade = "B";
            }
            else if(marks>=60)
            {
                grade = "C";
            }
            else if(marks>=50)
            {
                grade = "D";
            }
            else if(marks>=40)
            {
                grade = "E";
            }
            else
            {
                grade = "Fail";
            }
            System.out.println(grade+ " Grade ");
        }
    }
}
