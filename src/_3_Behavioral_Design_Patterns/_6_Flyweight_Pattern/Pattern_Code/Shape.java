package _3_Behavioral_Design_Patterns._6_Flyweight_Pattern.Pattern_Code;

import java.awt.*;

public interface Shape {

    public void draw(Graphics g, int x, int y, int width, int height,
                     Color color);
}
