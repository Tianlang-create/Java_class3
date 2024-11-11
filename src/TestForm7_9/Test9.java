package TestForm7_9;

import javax.swing.*;
import java.awt.event.*;

class Test9 extends JFrame  implements KeyListener {
    public Test9(){
        this.addKeyListener(this);
        this.setSize(800,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void	keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            int X = this.getX();	int Y = this.getY();
            this.setLocation(X, Y+10);
        }
        else if (e.getKeyCode()==KeyEvent.VK_UP){
            int X = this.getX();	int Y = this.getY();
            this.setLocation(X, Y-10);
        }
        else if (e.getKeyCode()==KeyEvent.VK_RIGHT){
            int X = this.getX();	int Y = this.getY();
            this.setLocation(X+10, Y);
        }
        else if (e.getKeyCode()==KeyEvent.VK_LEFT){
            int X = this.getX();	int Y = this.getY();
            this.setLocation(X-10, Y);
        }
    }
    public void	keyReleased(KeyEvent e){}
    public void	keyTyped(KeyEvent e){}

    public static void main (String[] args)  {
        new Test9().setVisible(true);
    }

}