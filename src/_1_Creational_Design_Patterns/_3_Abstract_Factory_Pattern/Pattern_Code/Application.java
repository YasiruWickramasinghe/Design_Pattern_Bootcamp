package _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern._1_Daily_Code_Buffer;

import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern._1_Daily_Code_Buffer.uifactory.*;

public class Application {
    private Button button;
    private CheckBox checkbox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
