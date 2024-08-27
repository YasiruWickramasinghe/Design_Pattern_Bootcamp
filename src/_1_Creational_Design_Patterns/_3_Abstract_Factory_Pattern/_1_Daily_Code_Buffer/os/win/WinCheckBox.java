package _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern._1_Daily_Code_Buffer.os.win;

import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern._1_Daily_Code_Buffer.CheckBox;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Win Checkbox");
    }
}
