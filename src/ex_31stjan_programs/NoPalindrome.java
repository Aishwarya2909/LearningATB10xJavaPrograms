package ex_31stjan_programs;

import java.util.Scanner;

public class NoPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Palindrome number");//1441 - user input
        int number = sc.nextInt();
        sc.close();
        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome");
        } else {
            System.out.println(number + " is not a Palindrome");
        }

    }

    public static boolean isPalindrome(int num) //num = user input
    {
        int original_num = num;
        int reverse_num = 0;
        while (num > 0) {
            int digit = num % 10;
            reverse_num = reverse_num * 10 + digit;
            num = num / 10;
        }
        return original_num == reverse_num;
    }
}
