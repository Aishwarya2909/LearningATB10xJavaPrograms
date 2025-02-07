package ex_30thjan_programs;
import java.util.Scanner;
public class ATM_WithDrawal_simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withdrawal_amount");
        int withdrawal_amt = sc.nextInt();
        int account_balance = 10000;
        int total_remaining_balance;
        if(withdrawal_amt<=0)
        {
            System.out.println("Error:Withdrawal amt should be greater than zero");
        }

        else if(withdrawal_amt%100!=0)
        {
            System.out.println("Error: withdrawal amount should be multiples of 100rupees");
        }
        else if(withdrawal_amt>account_balance)
        {
            System.out.println("Error : insufficient balance");
        }
        else
            {
                total_remaining_balance= account_balance -withdrawal_amt;
                System.out.println("With draw Amount: " +withdrawal_amt);
                System.out.println( "Total Balance: " +total_remaining_balance);
            }

        }

}
