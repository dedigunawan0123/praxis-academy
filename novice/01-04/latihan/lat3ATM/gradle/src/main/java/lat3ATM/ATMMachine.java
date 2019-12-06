/**
 * Ini adalah class ATMMachine
 * @author Dedi Gunawan
 * @since 6 Dec 2019
 */

package lat3ATM;


import java.util.Scanner;

import lat3ATM.BalanceInquiry;
import lat3ATM.Withdraw;
import lat3ATM.Deposit;

import java.io.*;
public class ATMMachine{   

    public static void checkBalance()
    {
        System.out.println("\tYour current balance is " + BalanceInquiry.getBalance());
    }
   
    public static void withdrawMoney()
    {
        if(BalanceInquiry.balance==0)
        {
            System.out.println("\tYour current balance is zero.");
            System.out.println("\tYou cannot withdraw!");
            System.out.println("\tYou need to deposit money first.");
        }
        else if(BalanceInquiry.balance<=500)
        {
            System.out.println("\tYou do not have sufficient money to withdraw");
            System.out.println("\tChecked your balance to see your money in the bank.");
        }
        else if(Withdraw.withdraw > BalanceInquiry.balance)
        {
            System.out.println("\tThe amount you withdraw is greater than to your balance");
            System.out.println("\tPlease check the amount you entered.");
        }
        else
        {
            BalanceInquiry.balance = BalanceInquiry.balance - Withdraw.withdraw;
            System.out.println("\n\tYou withdraw the amount of Php " + Withdraw.withdraw);
        }
    }
                   
    public static void depositMoney()
    {
        System.out.println("\tYou deposited the amount of " + Deposit.getDeposit());
    }
}
    