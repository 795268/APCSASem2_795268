
/**
 * Write a description of class MySwingApplication here.
 *
Elena campell
 * @lab 131
 */
import javax.swing.*;
public class MySwingApplication implements Runnable
{
    JFrame jFrame; 
    public void run(){
        JFrame jFrame = new JFrame("Window"); 
        jFrame.setSize(500,679);
        CanvasComponent canvasComponent = new CanvasComponent(40, 2);
        jFrame.add(canvasComponent); 
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public void main(){
        MySwingApplication mySwingApplication = new MySwingApplication(); 
        javax.swing.SwingUtilities.invokeLater(mySwingApplication); 

    }

}
