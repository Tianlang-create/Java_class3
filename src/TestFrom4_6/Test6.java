package TestFrom4_6;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Test6 extends JFrame  implements ItemListener{
    private JComboBox jcb = new JComboBox();
    private JPanel jpl = new JPanel();
    public Test6(){
        jcb.addItemListener(this);
        this.add(jpl);
        jpl.add(jcb);		jcb.addItem("红"); jcb.addItem("绿"); jcb.addItem("蓝");
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent e){
        String str = (String)jcb.getSelectedItem();
        if(str.equals("红")) 			jpl.setBackground(Color.red);
        else if(str.equals("绿"))     jpl.setBackground(Color.green);
        else									jpl.setBackground(Color.blue);
    }
    public static void main (String[] args)  {
        new Test6().setVisible(true);
    }

}