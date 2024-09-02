package _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern._1_Daily_Code_Buffer.uifactory;

import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern._1_Daily_Code_Buffer.Button;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern._1_Daily_Code_Buffer.CheckBox;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern._1_Daily_Code_Buffer.os.mac.MacButton;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern._1_Daily_Code_Buffer.os.mac.MacCheckBox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
