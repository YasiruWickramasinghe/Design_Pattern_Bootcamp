package _0_SOLID_Principles._1_Daily_Code_Buffer_Series.src.main.java.com.solid.openclosed;

public class AddOperation implements Operation{
    @Override
    public int perform(int number1, int number2) {
        return number1 + number2;
    }
}
