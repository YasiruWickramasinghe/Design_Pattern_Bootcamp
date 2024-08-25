package _0_SOLID_Principles._1_Daily_Code_Buffer_Series.src.main.java.com.solid._2_openclosed;

// This is good we keep adding new operation implementation
// and our calculator get extensions without modifying it main task
// that is performing calculation
public interface Operation {
    public int perform(int number1 , int number2);
}
