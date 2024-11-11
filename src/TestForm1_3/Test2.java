package TestForm1_3;

class Printer implements ActionListener {
    public void actionPerformed(){
        System.out.println("Hello");
    }
}

interface ActionListener{
    public void actionPerformed();
}
class Button{
    ActionListener actionListener;
    public void addActionListener(ActionListener actionListener) { this.actionListener = actionListener; }
    public void click(){
        actionListener.actionPerformed();
    }
}
class FrameTest  {
    Button b = new Button();
    FrameTest(){
        b.addActionListener(new Printer());
    }
    public void clickButton(){
        b.click();
    }
    public static void main (String[] args)  {
        FrameTest ft = new FrameTest();
        ft.clickButton();
    }
}