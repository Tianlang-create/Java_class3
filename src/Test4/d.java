package Test4;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class FrameTest extends JFrame implements ActionListener{ //①实现接口
    private JButton jbt1 = new JButton("变红");
    private JButton jbt2 = new JButton("变蓝");
    private JButton jbt3 = new JButton("退出");
    private JPanel jpl = new JPanel();
    public FrameTest(){
        jbt1.addActionListener(this); //③发出方和处理方绑定
        jbt2.addActionListener(this);
        jbt3.addActionListener(this);
        this.add(jpl);
        jpl.add(jbt1);	jpl.add(jbt2);	jpl.add(jbt3);
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {//②编写事件处理函数
        if(e.getSource()==jbt1)  			jpl.setBackground(Color.red);
        else if(e.getSource()==jbt2)	  jpl.setBackground(Color.blue);
        else  System.exit(0);
    }
    public static void main (String[] args)  {
        new FrameTest().setVisible(true);
    }

}