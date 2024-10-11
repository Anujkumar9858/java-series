import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class WebPage extends JFrame{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3;

    WebPage(String w1){
        super(w1);
    }
    WebPage(){

    }
    void setComponents(){
        // Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
        // Cursor c2 = new Cursor(Cursor.CROSSHAIR_CURSOR);
        Cursor c3 = new Cursor(Cursor.WAIT_CURSOR);
        Font f1 = new Font("Roman",Font.BOLD,28);
        Font f2 = new Font("Roman",Font.BOLD,15);
        l1 = new JLabel("It's My First Webpage in Java");
        l4 = new JLabel();
        l5 = new JLabel();
        ImageIcon i1 = new ImageIcon("C:/Users/anujk/OneDrive/Desktop/java.jpg/WebPage.jpg");
        l5.setIcon(i1);
        l1.setFont(f1);
        l1.setForeground(Color.red);
        l2 = new JLabel("USERNAME");
        l3 = new JLabel("PASSWORD");
        // l3.setForeground(Color.blue);
        // l3.setFont(f2);
        
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setCursor(c3);
        b2 = new JButton("Clear");
        b2.setCursor(c3);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b3 = new JButton("Add");
        b3.setCursor(c3);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        
        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        l5.setBounds(200,10,150,150);
        l1.setBounds(100,50,400,40);
        l2.setBounds(100,200,100,30);
        l3.setBounds(100,350,100,30);
        l4.setBounds(100,550,200,30);
        t1.setBounds(350,200,100,30);
        t2.setBounds(350,350,100,30);
        b1.setBounds(200,450,100,30);
        b2.setBounds(400,450,100,30);
        b3.setBounds(300,500,100,30);

        b1.addActionListener(new Login());
        b2.addActionListener(new Clear());
        b3.addActionListener(new Add());
        b1.addActionListener(null);
        l2.addMouseListener(new MouseL());
        b1.addMouseListener(new MouseL());
        // b2.addMouseListener(new MouseL());
        // b3.addMouseListener(new MouseL());
    
       
    }
    class MouseL implements MouseListener{
        public void mousePressed(MouseEvent e1){
            
        }
        public void mouseClicked(MouseEvent e1){
            b1.setBackground(Color.blue);
            b2.setBackground(Color.blue);
            b3.setBackground(Color.blue);
        }
        public void mouseReleased(MouseEvent e1){
            b1.setBackground(Color.BLACK);
            b2.setBackground(Color.BLACK);
            b3.setBackground(Color.BLACK);

        }
        public void mouseEntered(MouseEvent e1){
            l2.setForeground(Color.orange);
            b1.setBackground(Color.BLUE);
            
            b2.setBackground(Color.BLUE);
           
            b3.setBackground(Color.BLUE);
        }
        public void mouseExited(MouseEvent e1){
            b1.setBackground(Color.BLACK);
            b2.setBackground(Color.BLACK);
            b3.setBackground(Color.BLACK);
          

        }
    }

    public static void main(String[] args){
        WebPage w1 = new WebPage("Java webpage");
        w1.setVisible(true);
        w1.setComponents();
        w1.setBounds(700,700,600,600);
        w1.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    
    class Login implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            String w1 = t1.getText();
            String w2 = new String(t2.getPassword());
            if(w1.equals("Anuj") && w2.equals("1234")){
                JOptionPane.showMessageDialog(null,"Login Successful");
                l4.setText("Login Successful");
            }
            else{
                l4.setText("Login UnSuccessful");
            }
        }
    
    }
    

    class Clear implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            JOptionPane.showMessageDialog(null,"Clear Successful");
           t1.setText("");
           t2.setText("");

        }
    }
 
 class Add implements ActionListener{
    public void actionPerformed(ActionEvent e1){
        try{

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a+b;
        l4.setText("Addition is:"+c);
        }
        catch(Exception e2){
            l4.setText("Please Enter a Number");
        }
       }
     }
}

