import javax.swing.*;
public class Hello extends JFrame{
    Hello(String s1){
        super(s1);
    }
    Hello(){

    }
    void setComponents(){
        JLabel l1= new JLabel("It's my first java Webpage");
        setLayout(null);
        l1.setBounds(200,200,100,30);
        add(l1);
    }
    public static void main(String [] args){
        Hello h1 = new Hello("hello");
        h1.setVisible(true);
        h1.setSize(700,700);
        h1.setComponents();
        h1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
