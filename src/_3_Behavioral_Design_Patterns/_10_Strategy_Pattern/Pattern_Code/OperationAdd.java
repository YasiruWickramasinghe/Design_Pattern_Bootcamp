package _3_Behavioral_Design_Patterns._10_Strategy_Pattern.Pattern_Code;

public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
