
/**
 * Write a description of class CanvasComponent here.
 *
 *Elena Campell
 *activity 2
 */
import java.awt.*; 
import javax.swing.*;
public class CanvasComponent extends JComponent
{
    CanvasComponent rect = new CanvasComponent(0, 0); 
    int height; 
    int width; 
    int x; 
    int y; 
    public CanvasComponent(int width, int height){
        rect.setSize(width, height); 
        height = 40;
        width = 30;
        x =40;
        y= 20; 
        
    }
    
    protected void paintComponent(Graphics g){
        g.setColor(Color.red); 
        g.fillRect(40,30,60,70); 
    }
    
}
