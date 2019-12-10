/**
 * dg. Ini methode CalculatorState. Method ini tidak masuk syarat sebagai method no state, 
 * karena variable yang diproses ada yang merupakan variable yang bukan di dalam method tsb.
 */
package latNoState;

public class CalculatorState {
    private int initVal = 5;
    public int sum(int a) {
       return initVal + a;
    }
}
