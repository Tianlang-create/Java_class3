package TestForm7_9;

import javax.swing.*;
import java.awt.event.*;

class Test8 extends JFrame   implements MouseMotionListener {
    public Test8(){
        this.addMouseMotionListener(this);
        this.setSize(800,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void	mouseDragged(MouseEvent e){}
    public	void mouseMoved(MouseEvent e){
        int X = e.getX();	int Y = e.getY();
        this.setTitle(X + "," + Y);
        System.out.println(X + "," + Y);
    }
    public static void main (String[] args)  {
        new Test8().setVisible(true);
    }

}