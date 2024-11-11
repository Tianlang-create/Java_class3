//界面上有一个按钮，点击，屏幕上打印“Hello”
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Printer1 implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("Hello");
    }
}
class Test1_1 extends JFrame{
    private JButton jbt =new JButton("点我");
    private JPanel jpl = new JPanel();

    Test1_1() {
        jbt.addActionListener(new Printer1());
        this.add(jpl);
        jpl.add(jbt);
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Test1_1().setVisible(true);
    }
}