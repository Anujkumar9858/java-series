import javax.swing.*;
class LoginS extends JFrame{
    LoginS(String s1){
        super(s1);
    }
    LoginS(){

    } 
    void setComponents(){
        JLabel l1 = new JLabel("hellow");
        setLayout(null);
        l1.setBounds(200,200,100,30); 
        add(l1);
    }
public static void main(String[] args){
    LoginS s1 = new LoginS("Welcome to my Profile");
    s1.setVisible(true);
    s1.setSize(700,700);
    s1.setComponents();
    s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }
}