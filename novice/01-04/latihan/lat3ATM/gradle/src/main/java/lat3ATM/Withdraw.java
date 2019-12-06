/**
 * Ini adalah class Withdraw
 * @author Dedi Gunawan
 * @since 6 Dec 2019
 */

package lat3ATM;


public class Withdraw extends ATMMachine
{
    static double withdraw = 0;   
    public void setWithdraw(double w)
    {
        withdraw = w;
    }
    public static double getWithdraw()
    {
        return withdraw;
    }
}