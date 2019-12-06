/**
 * Ini adalah class BalanceInquiry
 * @author Dedi Gunawan
 * @since 6 Dec 2019
 */

package lat3ATM;


public class BalanceInquiry extends ATMMachine
{
    static double balance = 0;
    public void setBalance(double b)
    {
        balance = b;
    }
    public static double getBalance()
    {
        return balance;
    }   
}



