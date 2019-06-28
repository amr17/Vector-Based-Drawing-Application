/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint11;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;

/**
 *
 * @author Aliaa Abbas
 */
public class MyLine extends ConcreteShape{

    public MyLine() {
        position = new Point(0,0);
        color= Color.BLACK;
        properties = new HashMap<>();
        properties.put("length", 50.0);
    }
    
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(color);
        canvas.drawLine(position.x, position.y, position.x+(int)(properties.get("length").doubleValue()), position.y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
