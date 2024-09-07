package _3_Behavioral_Design_Patterns._9_Template_Pattern.Pattern_Code;

/*
 *  References: https://refactoring.guru/design-patterns/template-method
 *              https://www.tutorialspoint.com/design_pattern/template_pattern.htm
 */
public class TemplateApplication {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
