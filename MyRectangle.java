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
public class MyRectangle extends ConcreteShape{

    public MyRectangle() {
        position = new Point(0,0);
        color= Color.BLACK;
        fillColor = Color.BLACK;
        properties = new HashMap<>();
        properties.put("length", 50.0);
        properties.put("width", 50.0);
    }
    
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(color);
        canvas.drawRect(position.x, position.y, (int)(properties.get("length").doubleValue()), (int)(properties.get("width").doubleValue()));
        canvas.setColor(fillColor);
        canvas.fillRect(position.x, position.y, (int)(properties.get("length").doubleValue()), (int)(properties.get("width").doubleValue()));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
