package TestForm7_9;

import javax.swing.*;
import java.awt.event.*;

class Test7 extends JFrame  implements MouseListener {
    private Icon icon = new ImageIcon("img.png");
    private JLabel jlb = new JLabel(icon);
    public Test7(){
        jlb.addMouseListener(this);
        this.setLayout(null);
        this.add(jlb);
        jlb.setSize(icon.getIconWidth(),icon.getIconHeight());
        jlb.setLocation(100,200);
        this.setSize(800,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void	mouseClicked(MouseEvent e){}
    public void	mouseEntered(MouseEvent e){
        int X = (int)(Math.random()*this.getWidth()*0.6);
        int Y = (int)(Math.random()*this.getHeight()*0.6);
        jlb.setLocation(X,Y);
    }
    public void	mouseExited(MouseEvent e){
        System.out.println("MouseExited");
    }
    public void	mousePressed(MouseEvent e){}
    public void	mouseReleased(MouseEvent e){}


    public static void main (String[] args)  {
        new Test7().setVisible(true);
    }

}