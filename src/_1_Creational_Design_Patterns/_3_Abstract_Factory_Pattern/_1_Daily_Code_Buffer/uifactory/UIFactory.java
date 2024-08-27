package _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern._1_Daily_Code_Buffer.uifactory;

import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern._1_Daily_Code_Buffer.Button;
import _1_Creational_Design_Patterns._3_Abstract_Factory_Pattern._1_Daily_Code_Buffer.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
