package _3_Behavioral_Design_Patterns._8_State_Pattern.Pattern_Code;

/*
    References: https://www.tutorialspoint.com/design_pattern/state_pattern.htm
                https://refactoring.guru/design-patterns/state
 */


public class StateApplication {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }

}
