
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
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public void main(){
    }

}
