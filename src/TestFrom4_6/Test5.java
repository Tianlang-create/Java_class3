package TestFrom4_6;

import javax.swing.*;
import java.awt.event.*;

class Test5 extends JFrame implements ActionListener{ //①实现接口
    static int result=0;
    private JTextField jtf = new JTextField(20);
    private JPanel jpl = new JPanel();
    private JButton jbt = new JButton("计算");
    private JTextField jtf2 = new JTextField(20);
    public Test5(){
        jbt.addActionListener(this); //③发出方和处理方绑定
        this.add(jpl);
        jpl.add(jtf);
        jpl.add(jbt);
        jpl.add(jtf2);
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {//②编写事件处理函数
        String str = jtf.getText();
        int i = Integer.parseInt(str);
        result = i*i;
        jtf2.setText(String.valueOf(result));
        System.out.println(i*i);
    }
    public static void main (String[] args)  {
        new Test5().setVisible(true);
    }

}