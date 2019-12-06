/**
 * Ini adalah class Deposit
 * @author Dedi Gunawan
 * @since 6 Dec 2019
 */

package lat3ATM;


public class Deposit extends ATMMachine
{
    static double deposit;
    public void setDeposit(double d)
    {
        deposit = d;
    }
    public static double getDeposit()
    {
        return deposit;
    }
}
