package TestForm1_3;

import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

class Printer2 implements ActionListener{ //①实现ActionListener接口
    public void actionPerformed(ActionEvent e){ //②重写接口中的actionPerformed
        System.out.println("Hello");
    }
}
class Test1 extends JFrame{
    private JButton jbt = new JButton("打印");
    private JPanel jpl = new JPanel();
    public Test1(){
        jbt.addActionListener((ActionListener) new Printer2()); //③按钮addActionListener绑定对象
        this.add(jpl);
        jpl.add(jbt);
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main (String[] args)  {
        new Test1().setVisible(true);
    }
}