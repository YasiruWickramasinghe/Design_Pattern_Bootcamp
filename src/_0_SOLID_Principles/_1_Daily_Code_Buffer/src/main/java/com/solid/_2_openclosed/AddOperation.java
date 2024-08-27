package _0_SOLID_Principles._1_Daily_Code_Buffer.src.main.java.com.solid._2_openclosed;

public class AddOperation implements Operation{
    @Override
    public int perform(int number1, int number2) {
        return number1 + number2;
    }
}
