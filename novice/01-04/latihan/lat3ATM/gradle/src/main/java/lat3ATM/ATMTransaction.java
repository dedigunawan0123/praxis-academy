/**
 * Ini adalah class ATMTransaction
 * @author Dedi Gunawan
 * @since 6 Dec 2019
 */

package lat3ATM;

import lat3ATM.BalanceInquiry;
import lat3ATM.Withdraw;
import lat3ATM.Deposit;
import lat3ATM.ATMMachine;

import java.util.Scanner;
import java.io.*;

public class ATMTransaction{

    public void ATMOption(){
        Scanner read = new Scanner(System.in);
        int select = 0;
        int choice = 0;
       
        System.out.println("====================================================");
        System.out.println("\tWelcome to this simple ATM machine");
        System.out.println("====================================================");
        System.out.println();
       
        do
        {try
                {
            do {
               
                    System.out.println("\tPlease select ATM Transactions");
                    System.out.println("\tPress [1] Deposit");
                    System.out.println("\tPress [2] Withdraw");
                    System.out.println("\tPress [3] Balance Inquiry");
                    System.out.println("\tPress [4] Exit");
               
                    System.out.print("\n\tWhat would you like to do? ");
                    select = read.nextInt();
   
                        if(select>4)
                        {
                            System.out.println("\n\tPlease select correct transaction.");
                        }
                        else
                        {
                        switch (select)
                        {
                            case 1:
                                System.out.print("\n\tEnter the amount of money to deposit: ");
                                Deposit.deposit = read.nextDouble();
                                BalanceInquiry.balance = Deposit.deposit + BalanceInquiry.balance;
                                ATMMachine.depositMoney();
                                break;
                               
                            case 2:
                               
                                System.out.print("\n\tTo withdraw, make sure that you have sufficient balance in your account.");
                                System.out.println();
                                System.out.print("\tEnter amount of money to withdraw: ");
                                Withdraw.withdraw = read.nextDouble();
                                ATMMachine.withdrawMoney();
                                break;
                               
                            case 3:
                                ATMMachine.checkBalance();
                                break;
                           
                            default:
                                System.out.print("\n\tTransaction exited.");
                                break;
                               
                        }
                    }               
                          
            }while(select>4);
           
            do {
                try
                {
                    System.out.println("\n\tWould you like to try another transaction?");
                    System.out.println("\n\tPress [1] Yes \n\tPress [2] No");
                    System.out.print("\tEnter choice: ");
                    choice = read.nextInt();
               
                        if(choice>2)
                        {
                            System.out.print("\n\tPlease select correct choice.");
                        }
                    }
                   
                    catch(Exception e)
                    {
                        System.out.println("\tError Input! Please enter a number only.");
                        read = new Scanner(System.in);
                        System.out.println("\tEnter yout choice:");
                        choice = read.nextInt();
                    }
            } while(choice>2);
        }
        catch(Exception e)
                {
                    System.out.println("\tError Input! Please enter a number only.");
                    read = new Scanner(System.in);
                    System.out.println("\tEnter yout choice:");
                    select = read.nextInt();
                }
               
        }while(choice<=1);
       
        System.out.println("\n\tThank you for using this simple ATM Machine.");
        read.close();
    }
}


