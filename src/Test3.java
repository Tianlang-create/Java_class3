import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

class Test3 extends JFrame implements ActionListener{
    public void actionPerformed(ActionEvent e){
        System.out.println("Visit Tianlang's github: https://github.com/Tianlang-create");
    }
    private JButton jbt = new JButton("点我");
    private JPanel jpl = new JPanel();
    Test3(){
        jbt.addActionListener(this);
        jpl.add(jbt);
        this.add(jpl);
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Test3().setVisible(true);
    }
}
