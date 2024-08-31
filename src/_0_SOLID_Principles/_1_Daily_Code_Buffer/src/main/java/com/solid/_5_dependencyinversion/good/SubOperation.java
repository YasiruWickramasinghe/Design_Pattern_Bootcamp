package _0_SOLID_Principles._1_Daily_Code_Buffer.src.main.java.com.solid._5_dependencyinversion.good;

/**
 * One more sub module for substration
 */
public class SubOperation  implements CalculatorOperation{
    public int calculate(int a, int b){
        return a-b;
    }
}
