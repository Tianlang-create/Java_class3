package TestForm1_3;//界面上有一个按钮，点击，屏幕上打印“Hello”
//第一步 ：事件处理对象必须能够“听得到”按钮点击的命令
//第二步：事件处理类中定义事件处理函数
//第三步：命令发出方(按钮)和事件处理对象绑定

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Printer1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("Visit Tianlang's github: https://github.com/Tianlang-create");
    }
}
class Test1_1 extends JFrame{
    private JButton jbt =new JButton("点我");
    private JPanel jpl = new JPanel();

    Test1_1() {
        jbt.addActionListener(new Printer1());
        this.add(jpl);
        jpl.add(jbt);
        jbt.setSize(100,100);
        jpl.setSize(500,500);
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Test1_1().setVisible(true);
    }
}