package _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern._1_Daily_Code_Buffer.os.mac;

import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern._1_Daily_Code_Buffer.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Mac Checkbox");
    }
}
