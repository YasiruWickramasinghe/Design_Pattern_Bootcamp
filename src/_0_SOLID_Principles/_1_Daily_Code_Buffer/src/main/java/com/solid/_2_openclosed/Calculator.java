package _0_SOLID_Principles._1_Daily_Code_Buffer.src.main.java.com.solid._2_openclosed;

// No modifications in our calculator functionality
// We can keep adding extension by create new operations
public class Calculator {
    public int calculateNumber(int number1 , int number2 , Operation operation){
        return  operation.perform(number1 , number2);
    }
}
