/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint11;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Aliaa Abbas
 */
public class MyCanvas extends JPanel implements DrawingEngine{
    ArrayList<Shape> shapes;
    ArrayList<Shape> undoneShapes;
    ArrayList<Shape> deletedShapes;

    public MyCanvas( ) {
        this.shapes = new ArrayList<>();
        this.undoneShapes = new ArrayList<>();
        this.deletedShapes = new ArrayList<>();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for (Shape shape : shapes) {
             shape.draw(g);
        }
        this.repaint();
    }

    @Override
    public void addShape(Shape shape) {
        shapes.add(shape);
        this.repaint();
    }

    @Override
    public void removeShape(Shape shape) {
        deletedShapes.add(shapes.remove(shapes.indexOf(shape)));
        this.repaint();
    }

    @Override
    public Shape[] getShapes() {
        return shapes.toArray(new Shape[shapes.size()]);
    }

    @Override
    public void refresh(Graphics canvas) {
         for (Shape shape : shapes) {
             shape.draw(canvas);
        }
         this.repaint();
    }

    @Override
    public List<Class<? extends Shape>> getSupportedShapes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void installPluginShape(Class<? extends Shape> shapeClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undo() {
        undoneShapes.add(shapes.remove(shapes.size()-1));
        this.repaint();
    }

    @Override
    public void redo() {
        shapes.add(undoneShapes.remove(undoneShapes.size()-1));
        this.repaint();
    }
}
