package _0_SOLID_Principles._1_Daily_Code_Buffer.src.main.java.com.solid._5_dependencyinversion.good;

/**
 * This is low level modules interface so anything
 * to invoke in lowlevel modules needs to go via this interface
 * by this we will achieve both loossely couple between high level and low level moduler
 * and abstration as well.
 */
public interface CalculatorOperation {
    public int calculate(int a,int b);
}
