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
public class MyTriangle extends ConcreteShape{

    public MyTriangle() {
        position = new Point(0,0);
        color= Color.BLACK;
        fillColor = Color.WHITE;
        properties = new HashMap<>();
        properties.put("height", 50.0);
        properties.put("base", 50.0);
    }
    
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(color);
        canvas.drawPolygon(new int[]{position.x, position.x+(int)(properties.get("base").doubleValue()), position.x+(int)(properties.get("base").doubleValue())/2}, new int[]{position.y, position.y,position.y-(int)(properties.get("height").doubleValue())}, 3); 
        canvas.setColor(fillColor);
        canvas.fillPolygon(new int[]{position.x, position.x+(int)(properties.get("base").doubleValue()), position.x+(int)(properties.get("base").doubleValue())/2}, new int[]{position.y, position.y,position.y-(int)(properties.get("height").doubleValue())}, 3); 
        
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        MyTriangle triangle = new MyTriangle();
        triangle.setPosition(this.getPosition());
        triangle.setColor(this.getColor());
        triangle.setFillColor(this.getFillColor());
        triangle.setProperties(this.getProperties());
        return triangle;
    }


    
}
