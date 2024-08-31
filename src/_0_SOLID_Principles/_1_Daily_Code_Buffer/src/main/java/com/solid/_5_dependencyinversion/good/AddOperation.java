package _0_SOLID_Principles._1_Daily_Code_Buffer.src.main.java.com.solid._5_dependencyinversion.good;

/**
 * So we will have this class but it will be taken care
 * via interface implementation.
 *
 */
public class AddOperation implements CalculatorOperation {
    public int calculate(int a, int b){
        return a+b;
    }
}
