Java JLabel Example
import javax.swing.*;
class LabelExample
{
public static void main(String args[])
 {
 JFrame f= new JFrame("Label Example");
 JLabel l1,l2;
 l1=new JLabel("First Label.");
 l1.setBounds(50,50, 100,30);
 l2=new JLabel("Second Label.");
 l2.setBounds(50,100, 100,30);
 f.add(l1);
f.add(l2);
 f.setSize(300,300);
 f.setLayout(null);
 f.setVisible(true);
 }
 }
Java JLabel Example with ActionListener
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LabelExample extends Frame implements ActionListener
{
 JTextField tf; JLabel l; JButton b;
 LabelExample()
{
 tf=new JTextField();
 tf.setBounds(50,50, 150,20);
 l=new JLabel();
 l.setBounds(50,100, 250,20);
 b=new JButton("Find IP");
 b.setBounds(50,150,95,30);
 b.addActionListener(this);
 add(b);
add(tf);
add(l);
 setSize(400,400);
 setLayout(null);
 setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
{
 try
{
 String host=tf.getText();
 String ip=java.net.InetAddress.getByName(host).getHostAddress();
 l.setText("IP of "+host+" is: "+ip);
 }
catch(Exception ex)
{
System.out.println(ex);
} }
 public static void main(String[] args)
{
 new LabelExample();
 } }
Example of displaying image on the button
import javax.swing.*;
public class ButtonExample
{
ButtonExample()
{
JFrame f=new JFrame("Button Example");
JButton b=new JButton(new ImageIcon("D:\\icon.png"));
b.setBounds(100,100,100, 40);
f.add(b);
f.setSize(300,400);
f.setLayout(null);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
public static void main(String[] args)
{
 new ButtonExample();
}
}
Java JTextField Example with ActionListener
import javax.swing.*;
import java.awt.event.*;
public class TextFieldExample implements ActionListener
{
 JTextField tf1,tf2,tf3;
 JButton b1,b2;
 TextFieldExample()
{
 JFrame f= new JFrame();
 tf1=new JTextField();
 tf1.setBounds(50,50,150,20);
 tf2=new JTextField();
 tf2.setBounds(50,100,150,20);
 tf3=new JTextField();
 tf3.setBounds(50,150,150,20);
 tf3.setEditable(false);
 b1=new JButton("+");
 b1.setBounds(50,200,50,50);
 b2=new JButton("-");
 b2.setBounds(120,200,50,50);
 b1.addActionListener(this);
 b2.addActionListener(this);
 f.add(tf1);
f.add(tf2);
f.add(tf3);
f.add(b1);
f.add(b2);
 f.setSize(300,300);
 f.setLayout(null);
 f.setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
{
 String s1=tf1.getText();
 String s2=tf2.getText();
 int a=Integer.parseInt(s1);
 int b=Integer.parseInt(s2);
 int c=0;
 if(e.getSource()==b1)
{
 c=a+b;
 }
else if(e.getSource()==b2)
{ c=a-b;
 }
 String result=String.valueOf(c);
 tf3.setText(result);
 }
public static void main(String[] args)
{
 new TextFieldExample();
} }
Java JTextArea Example with ActionListener
import javax.swing.*;
import java.awt.event.*;
public class TextAreaExample implements ActionListener
{
JLabel l1,l2;
JTextArea area;
JButton b;
TextAreaExample()
{
 JFrame f= new JFrame();
 l1=new JLabel();
 l1.setBounds(50,25,100,30);
 l2=new JLabel();
 l2.setBounds(160,25,100,30);
 area=new JTextArea();
 area.setBounds(20,75,250,200);
 b=new JButton("Count Words");
 b.setBounds(100,300,120,30);
 b.addActionListener(this);
 f.add(l1);
f.add(l2);
f.add(area);
f.add(b);
 f.setSize(450,450);
 f.setLayout(null);
 f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
 String text=area.getText();
 String words[]=text.split("\\s");
 l1.setText("Words: "+words.length);
 l2.setText("Characters: "+text.length());
}
public static void main(String[] args)
{
 new TextAreaExample();
}
}
Java JCheckBox Example: Food Order
import javax.swing.*;
import java.awt.event.*;
public class CheckBoxExample extends JFrame implements ActionListener
{
 JLabel l;
 JCheckBox cb1,cb2,cb3;
 JButton b;
 CheckBoxExample()
{
 l=new JLabel("Food Ordering System");
 l.setBounds(50,50,300,20);
 cb1=new JCheckBox("Pizza @ 100");
 cb1.setBounds(100,100,150,20);
 cb2=new JCheckBox("Burger @ 30");
 cb2.setBounds(100,150,150,20);
 cb3=new JCheckBox("Tea @ 10");
 cb3.setBounds(100,200,150,20);
 b=new JButton("Order");
 b.setBounds(100,250,80,30);
 b.addActionListener(this);
 add(l);add(cb1);add(cb2);add(cb3);add(b);
 setSize(400,400);
 setLayout(null);
 setVisible(true);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
 public void actionPerformed(ActionEvent e)
{
 float amount=0;
 String msg="";
 if(cb1.isSelected())
{
 amount+=100;
 msg="Pizza: 100\n";
 }
 if(cb2.isSelected())
{
 amount+=30;
 msg+="Burger: 30\n";
 }
 if(cb3.isSelected())
{
 amount+=10;
 msg+="Tea: 10\n";
 }
 msg+="-----------------\n";
 JOptionPane.showMessageDialog(this,msg+"Total: "+amount);
 }
 public static void main(String[] args)
{
 new CheckBoxExample();
 }
}
Java JRadioButton Example with ActionListener
import javax.swing.*;
import java.awt.event.*;
class RadioButtonExample extends JFrame implements ActionListener
{
JRadioButton rb1,rb2rb3,rb4;
JButton b;
RadioButtonExample()
{
rb1=new JRadioButton("Male");
rb1.setBounds(100,50,100,30);
rb2=new JRadioButton("Female");
rb2.setBounds(100,100,100,30);
ButtonGroup bg=new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
b=new JButton("click");
b.setBounds(100,150,80,30);
b.addActionListener(this);
add(rb1);
add(rb2);
add(b);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(rb1.isSelected())
{
JOptionPane.showMessageDialog(this,"You are Male.");
}
if(rb2.isSelected())
{
JOptionPane.showMessageDialog(this,"You are Female.");
}
}
public static void main(String args[])
{
new RadioButtonExample();
}}
Java JComboBox Example with ActionListener
import javax.swing.*;
import java.awt.event.*;
public class ComboBoxExample
{
JFrame f;
ComboBoxExample()
{
 f=new JFrame("ComboBox Example");
 final JLabel label = new JLabel();
 label.setHorizontalAlignment(JLabel.CENTER);
 label.setSize(400,100);
 JButton b=new JButton("Show");
 b.setBounds(200,100,75,20);
 String languages[]={"C","C++","C#","Java","PHP"};
 final JComboBox cb=new JComboBox(languages);
 cb.setBounds(50, 100,90,20);
 f.add(cb); f.add(label); f.add(b);
 f.setLayout(null);
 f.setSize(350,350);
 f.setVisible(true);
 b.addActionListener(new ActionListener()
{
 public void actionPerformed(ActionEvent e)
{
String data = "Programming language Selected: " + cb.getItemAt(cb.getSelectedIn
dex());
label.setText(data);
}
});
}
public static void main(String[] args)
{
 new ComboBoxExample();
}
}
Java JTable Example
import javax.swing.*;
public class TableExample
{
 JFrame f;
 TableExample()
{
 f=new JFrame();
 String data[][]={ {"101","Amit","670000"},
 {"102","Jai","780000"},
 {"101","Sachin","700000"}};
 String column[]={"ID","NAME","SALARY"};
 JTable jt=new JTable(data,column);
 jt.setBounds(30,40,200,300);
 JScrollPane sp=new JScrollPane(jt);
 f.add(sp);
 f.setSize(300,400);
 f.setVisible(true);
}
public static void main(String[] args)
{
 new TableExample();
}
}
Java JList Example with ActionListener
import javax.swing.*;
import java.awt.event.*;
public class ListExample
{
 ListExample()
{
 JFrame f= new JFrame();
 final JLabel label = new JLabel();
 label.setSize(500,100);
 JButton b=new JButton("Show");
 b.setBounds(200,150,80,30);
 final DefaultListModel<String> l1 = new DefaultListModel<>();
 l1.addElement("C");
 l1.addElement("C++");
 l1.addElement("Java");
 l1.addElement("PHP");
 final JList<String> list1 = new JList<>(l1);
 list1.setBounds(100,100, 75,75);
 DefaultListModel<String> l2 = new DefaultListModel<>();
 l2.addElement("Turbo C++");
 l2.addElement("Struts");
 l2.addElement("Spring");
 l2.addElement("YII");
 final JList<String> list2 = new JList<>(l2);
 list2.setBounds(100,200, 75,75);
 f.add(list1); f.add(list2); f.add(b); f.add(label);
 f.setSize(450,450);
 f.setLayout(null);
 f.setVisible(true);
 b.addActionListener(new ActionListener()
{
 public void actionPerformed(ActionEvent e)
{
 String data = "";
 if (list1.getSelectedIndex() != -1)
{
 data = "Programming language Selected: " + list1.getSelectedValue();
 label.setText(data);
 }
 if(list2.getSelectedIndex() != -1)
{
 data += ", FrameWork Selected: ";
 for(Object frame :list2.getSelectedValues())
{
 data += frame + " ";
 }
 }
 label.setText(data);
 }
 });
 }
public static void main(String args[])
 {
 new ListExample();
 }}
Java JScrollBar Example with AdjustmentListener
import javax.swing.*;
import java.awt.event.*;
class ScrollBarExample
{
ScrollBarExample()
{
 JFrame f= new JFrame("Scrollbar Example");
 final JLabel label = new JLabel();
 label.setHorizontalAlignment(JLabel.CENTER);
 label.setSize(400,100);
 final JScrollBar s=new JScrollBar();
 s.setBounds(100,100, 50,100);
 f.add(s); f.add(label);
 f.setSize(400,400);
 f.setLayout(null);
 f.setVisible(true);
 s.addAdjustmentListener(new AdjustmentListener()
{
 public void adjustmentValueChanged(AdjustmentEvent e)
{
 label.setText("Vertical Scrollbar value is:"+ s.getValue());
 }
});
}
public static void main(String args[])
{
 new ScrollBarExample();
}}
Java JMenuItem and JMenu Example
import javax.swing.*;
class MenuExample
{
 JMenu menu, submenu;
 JMenuItem i1, i2, i3, i4, i5;
 MenuExample()
{
 JFrame f= new JFrame("Menu and MenuItem Example");
 JMenuBar mb=new JMenuBar();
 menu=new JMenu("Menu");
 submenu=new JMenu("Sub Menu");
 i1=new JMenuItem("Item 1");
 i2=new JMenuItem("Item 2");
 i3=new JMenuItem("Item 3");
 i4=new JMenuItem("Item 4");
 i5=new JMenuItem("Item 5");
 menu.add(i1); menu.add(i2); menu.add(i3);
 submenu.add(i4); submenu.add(i5);
 menu.add(submenu);
 mb.add(menu);
 f.setJMenuBar(mb);
 f.setSize(400,400);
 f.setLayout(null);
 f.setVisible(true);
}
public static void main(String args[])
{
new MenuExample();
}}
Java JProgressBar Example
import javax.swing.*;
public class ProgressBarExample extends JFrame
{
JProgressBar jb;
int i=0,num=0;
ProgressBarExample()
{
jb=new JProgressBar(0,2000);
jb.setBounds(40,40,160,30);
jb.setValue(0);
jb.setStringPainted(true);
add(jb);
setSize(250,150);
setLayout(null);
}
public void iterate()
{
while(i<=2000)
{
 jb.setValue(i);
 i=i+20;
 try
{
Thread.sleep(150);
}
catch(Exception e)
{}
} }
public static void main(String[] args)
{
 ProgressBarExample m=new ProgressBarExample();
 m.setVisible(true);
 m.iterate();
}
}
JOptionPane
import javax.swing.*;
public class OptionPaneExample
{
JFrame f;
OptionPaneExample()
{
 f=new JFrame();
 JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.");
}
public static void main(String[] args)
{
 new OptionPaneExample();
}
}
JSplitPane and JScrollPane
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class SplitPaneDemo extends JFrame
{
JSplitPane sp;
JLabel lblimage;
JList lstplanet;
public SplitPaneDemo()
{
super("SplitPane Test");
sp=new JSplitPane();
String
planet[]={"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptun
e","Pluto"};
lblimage=new JLabel();
lstplanet=new JList(planet);
sp.add(lstplanet,JSplitPane.LEFT);
sp.add(lblimage,JSplitPane.RIGHT);
setLayout(new FlowLayout());
add(sp);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize();
lstplanet.addMouseListener(new MouseAdapter()
{
@Override
public void mouseClicked(MouseEvent e)
{
if(lstplanet.getSelectedValue().equals("Mercury"))
lblimage.setIcon(new ImageIcon("Mercury.jpg"));
if(lstplanet.getSelectedValue().equals("Venus"))
lblimage.setIcon(new ImageIcon("Venus.jpg"));
if(lstplanet.getSelectedValue().equals("Earth"))
lblimage.setIcon(new ImageIcon("Earth.jpg"));
if(lstplanet.getSelectedValue().equals("Mars"))
lblimage.setIcon(new ImageIcon("Mars.jpg"));
if(lstplanet.getSelectedValue().equals("Jupiter"))
lblimage.setIcon(new ImageIcon("Jupiter.jpg"));
if(lstplanet.getSelectedValue().equals("Saturn"))
lblimage.setIcon(new ImageIcon("Saturn.jpg"));
if(lstplanet.getSelectedValue().equals("Uranus"))
lblimage.setIcon(new ImageIcon("Uranus.jpg"));
if(lstplanet.getSelectedValue().equals("Neptune"))
lblimage.setIcon(new ImageIcon("Neptune.jpg"));
if(lstplanet.getSelectedValue().equals("Pluto"))
lblimage.setIcon(new ImageIcon("Pluto.jpg"));
}});
}
public static void main(String[] args)
{
new SplitPaneDemo();
}}
JTabbedPane
import javax.swing.*;
public class TabbedPaneExample
{
JFrame f;
TabbedPaneExample()
{
 f=new JFrame();
 JTextArea ta=new JTextArea(200,200);
 JPanel p1=new JPanel();
 p1.add(ta);
 JPanel p2=new JPanel();
 JPanel p3=new JPanel();
 JTabbedPane tp=new JTabbedPane();
 tp.setBounds(50,50,200,200);
 tp.add("main",p1);
 tp.add("visit",p2);
 tp.add("help",p3);
 f.add(tp);
 f.setSize(400,400);
 f.setLayout(null);
 f.setVisible(true);
}
public static void main(String[] args)
{
 new TabbedPaneExample();
}}
Java JSlider Example
import javax.swing.*;
public class SliderExample1 extends JFrame
{
public SliderExample1()
{
JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
JPanel panel=new JPanel();
panel.add(slider);
add(panel);
}
 public static void main(String s[])
{
SliderExample1 frame=new SliderExample1();
frame.pack();
frame.setVisible(true);
}
}
Java JSlider Example: painting ticks and JPanel
import javax.swing.*;
public class SliderExample extends JFrame
{
public SliderExample()
{
JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
slider.setMinorTickSpacing(2);
slider.setMajorTickSpacing(10);
slider.setPaintTicks(true);
slider.setPaintLabels(true);

JPanel panel=new JPanel();
panel.add(slider);
add(panel);
}
public static void main(String s[])
{
SliderExample frame=new SliderExample();
frame.pack();
frame.setVisible(true);
}
}
Java JColorChooser Example
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class ColorChooserExample extends JFrame implements ActionListener
{
JButton b;
Container c;
ColorChooserExample()
{
 c=getContentPane();
 c.setLayout(new FlowLayout());
 b=new JButton("color");
 b.addActionListener(this);
 c.add(b);
}
public void actionPerformed(ActionEvent e)
{
Color initialcolor=Color.RED;
Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);
c.setBackground(color);
}
public static void main(String[] args)
{
 ColorChooserExample ch=new ColorChooserExample();
 ch.setSize(400,400);
 ch.setVisible(true);
 ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}
Java JTree Example
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class TreeExample
{
JFrame f;
TreeExample()
{
 f=new JFrame();
 DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");
 DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");
 DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");
 style.add(color);
 style.add(font);
 DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");
 DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");
 DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");
 DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");
 color.add(red); color.add(blue); color.add(black); color.add(green);
 JTree jt=new JTree(style);
 f.add(jt);
 f.setSize(200,200);
 f.setVisible(true);
}
public static void main(String[] args)
{
 new TreeExample();
}}
Java JFileChooser Example
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class FileChooserExample extends JFrame implements ActionListener
{
JMenuBar mb;
JMenu file;
JMenuItem open;
JTextArea ta;
FileChooserExample()
{
open=new JMenuItem("Open File");
open.addActionListener(this);
file=new JMenu("File");
file.add(open);
mb=new JMenuBar();
mb.setBounds(0,0,800,20);
mb.add(file);
ta=new JTextArea(800,800);
ta.setBounds(0,20,800,800);
add(mb);
add(ta);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==open)
{
 JFileChooser fc=new JFileChooser();
 int i=fc.showOpenDialog(this);
 if(i==JFileChooser.APPROVE_OPTION) \\ OK Option
{
 File f=fc.getSelectedFile();
 String filepath=f.getPath();
 try
{
 BufferedReader br=new BufferedReader(new FileReader(filepath));
 String s1="",s2="";
 while((s1=br.readLine())!=null)
{
 s2+=s1+"\n";
 }
 ta.setText(s2);
 br.close();
 }catch (Exception ex)
{
ex.printStackTrace(); \\ exception stack trace to detect bugs
} } }}
public static void main(String[] args)
{
 FileChooserExample om=new FileChooserExample();
 om.setSize(500,500);
 om.setLayout(null);
 om.setVisible(true);
 om.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}
Java JSeparator
import javax.swing.*;
class SeparatorExample
{
 JMenu menu, submenu;
 JMenuItem i1, i2, i3, i4, i5;
 SeparatorExample()
{
 JFrame f= new JFrame("Separator Example");
 JMenuBar mb=new JMenuBar();
 menu=new JMenu("Menu");
 i1=new JMenuItem("Item 1");
 i2=new JMenuItem("Item 2");
 menu.add(i1);
 menu.addSeparator();
 menu.add(i2);
 mb.add(menu);
 f.setJMenuBar(mb);
 f.setSize(400,400);
 f.setLayout(null);
 f.setVisible(true);
}
public static void main(String args[])
{
new SeparatorExample();
}}
Java JPopupMenu Example
import javax.swing.*;
import java.awt.event.*;
class PopupMenuExample
{
 PopupMenuExample()
{
 final JFrame f= new JFrame("PopupMenu Example");
 final JPopupMenu popupmenu = new JPopupMenu("Edit");
 JMenuItem cut = new JMenuItem("Cut");
 JMenuItem copy = new JMenuItem("Copy");
 JMenuItem paste = new JMenuItem("Paste");
 popupmenu.add(cut);
popupmenu.add(copy);
popupmenu.add(paste);
 f.addMouseListener(new MouseAdapter()
{
 public void mouseClicked(MouseEvent e)
{
 popupmenu.show(f , e.getX(), e.getY());
 }
 });
 f.add(popupmenu);
 f.setSize(300,300);
 f.setLayout(null);
 f.setVisible(true);
 }
public static void main(String args[])
{
 new PopupMenuExample();
}}
Simple ToolTip Example
import javax.swing.*;
public class ToolTipExample
{
 public static void main(String[] args)
{
 JFrame f=new JFrame("Password Field Example");
 //Creating PasswordField and label
 JPasswordField value = new JPasswordField();
 value.setBounds(100,100,100,30);
 value.setToolTipText("Enter your Password");
 JLabel l1=new JLabel("Password:");
 l1.setBounds(20,100, 80,30);
 //Adding components to frame
 f.add(value); f.add(l1);
 f.setSize(300,300);
 f.setLayout(null);
 f.setVisible(true);
}
}
Java JPasswordField Example
import javax.swing.*;
public class PasswordFieldExample
{
 public static void main(String[] args)
{
 JFrame f=new JFrame("Password Field Example");
 JPasswordField value = new JPasswordField();
 JLabel l1=new JLabel("Password:");
 l1.setBounds(20,100, 80,30);
 value.setBounds(100,100,100,30);
 f.add(value);
f.add(l1);
 f.setSize(300,300);
 f.setLayout(null);
 f.setVisible(true);
}
}
JDesktopPane
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
class JInternalFrameTest extends JFrame
{
private JDesktopPane jd = new JDesktopPane();
JInternalFrameTest()
 {
setTitle("JInternalFrame");
setJInternalFrame(jd,"InternalFrame1",30,30);
setJInternalFrame(jd,"InternalFrame2",60,60);
setJDesktopPane();
setSize(700,400);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
void setJDesktopPane()
 {
add(jd);
 }
void setJInternalFrame(JDesktopPane jd,String name,int loc1,int loc2)
 {
JInternalFrame jn = new JInternalFrame(name, true, true, true, true); //title,
resizable, closable, maximizable, iconifiable
jn.setLayout(new FlowLayout());
jn.setSize(300, 300);
jn.add(new JButton("JButton"));
jn.setLocation(loc2, loc2);
jn.setVisible(true);
jd.add(jn);
 }
}
public class Javaapp
{
public static void main(String[] args)
{
JInternalFrameTestjn = new JInternalFrameTest();
 }
}
JInternalFrame
Import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
class JInternalFrameTest extends JFrame
{
JInternalFrameTest()
 {
setTitle("JInternalFrame");
setJInternalFrame();
setSize(700,300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
voidsetJInternalFrame()
 {
JInternalFrame jn = new JInternalFrame("InternalFrame",true,true,true);
jn.setLayout(new FlowLayout());
jn.add(new JButton("JButton"));
jn.setVisible(true);
add(jn);
 }
}
public class First
{
public static void main(String[] args)
{
JInternalFrameTest jn = new JInternalFrameTest();
 }
}
JLayeredPane
import javax.swing.*;
import java.awt.*;
public class LayeredPaneExample extends JFrame
{
 public LayeredPaneExample()
{
 super("LayeredPane Example");
 setSize(200, 200);
 JLayeredPane pane = getLayeredPane();
 //creating buttons
 JButton top = new JButton();
 top.setBackground(Color.white);
 top.setBounds(20, 20, 50, 50);
 JButton middle = new JButton();
 middle.setBackground(Color.red);
 middle.setBounds(40, 40, 50, 50);
 JButton bottom = new JButton();
 bottom.setBackground(Color.cyan);
 bottom.setBounds(60, 60, 50, 50);
 //adding buttons on pane
 pane.add(bottom, new Integer(1));
 pane.add(middle, new Integer(2));
 pane.add(top, new Integer(3));
 }
 public static void main(String[] args)
{
 LayeredPaneExample panel = new LayeredPaneExample();
 panel.setVisible(true);
 }}
JCheckboxMenuItem
import javax.swing.*;
import java.awt.*;
class JCheckBoxMenuItemExample extends JFrame
{
JMenuBar mb;
JMenu m;
JCheckBoxMenuItem m1,m2,m3,m4,m5,m6,m7;
 public JCheckBoxMenuItemExample()
 {
 createAndShowGUI();
 }
 private void createAndShowGUI()
 {
 setTitle("JCheckBoxMenuItem Example");
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setLayout(new FlowLayout());

 mb=new JMenuBar();
 m=new JMenu("Menu");
 m1=new JCheckBoxMenuItem("Item 1");
 m2=new JCheckBoxMenuItem("Item 2");
 m3=new JCheckBoxMenuItem("Item 3");
 m4=new JCheckBoxMenuItem("Item 4");
 m5=new JCheckBoxMenuItem("Item 5");
 m6=new JCheckBoxMenuItem("Item 5");
 m7=new JCheckBoxMenuItem("Item 6");
 // Set text
 m1.setText("Item 1");
 m1.setState(true);
 // m1.setSelected(true);
 // disable m4
 m4.setEnabled(false);
 m.add(m1);
 m.add(m2);
 m.add(m3);
 m.add(m4);
 m.add(m5);
 m.add(m6);
 m.add(m7);
 mb.add(m);
 setJMenuBar(mb);
 setSize(400,400);
 setVisible(true);
 }

 public static void main(String args[])
 {
 new JCheckBoxMenuItemExample();
 }
}
JTableHeader
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
public class Main
{
 public static void main(String[] argv) throws Exception
{
 int rows = 10;
 int cols = 5;
 JTable table = new JTable(rows, cols);
 JTableHeader header = table.getTableHeader();
 JPanel container = new JPanel(new BorderLayout());
 // Add header in NORTH slot
 container.add(header, BorderLayout.NORTH);
 // Add table itself to CENTER slot
 container.add(table, BorderLayout.CENTER);
 }
}
JToolBar
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
public class ToolBarSample
{
public static void main(final String args[])
{
 JFrame frame = new JFrame("JToolBar Example");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JToolBar toolbar = new JToolBar();
 toolbar.setRollover(true);
 JButton button = new JButton("button");
 toolbar.add(button);
 toolbar.addSeparator();
 toolbar.add(new JButton("button 2"));
 toolbar.add(new JComboBox(new String[]{"A","B","C"}));
 Container contentPane = frame.getContentPane();
 contentPane.add(toolbar, BorderLayout.NORTH);
 JTextArea textArea = new JTextArea();
 JScrollPane pane = new JScrollPane(textArea);
 contentPane.add(pane, BorderLayout.CENTER);
 frame.setSize(350, 150);
 frame.setVisible(true);
 }
}
JRadioButtonMenuItem
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
public class JavaRadioButtonMenuItem
{
public static void main(final String args[])
{
JFrame frame = new JFrame("MenuSample Example");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JMenuBar menuBar = new JMenuBar();
JMenu fileMenu = new JMenu("File");
menuBar.add(fileMenu);
JMenuItem newMenuItem = new JMenuItem("New");
fileMenu.add(newMenuItem);
JMenu findOptionsMenu = new JMenu("Options");
fileMenu.add(findOptionsMenu);
ButtonGroup directionGroup = new ButtonGroup();
JRadioButtonMenuItem forwardMenuItem = new
JRadioButtonMenuItem("Forward", true);
findOptionsMenu.add(forwardMenuItem);
directionGroup.add(forwardMenuItem);
JRadioButtonMenuItem backwardMenuItem = new
JRadioButtonMenuItem("Backward");
findOptionsMenu.add(backwardMenuItem);
directionGroup.add(backwardMenuItem);
frame.setJMenuBar(menuBar);
frame.setSize(350, 250);
frame.setVisible(true);
}
}
JRootPane
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRootPane;
public class SettingDefaultButtonJRootPane
{
 public static void main(String args[])
{
 JFrame frame = new JFrame("DefaultButton");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JButton button4 = new JButton("AAA");
 frame.add(button4,"Center");
 frame.add(new JButton("BBB"),"South");
 JRootPane rootPane = frame.getRootPane();
 rootPane.setDefaultButton(button4);
 frame.setSize(300, 200);
 frame.setVisible(true);
 }
}
JEditorPane
import java.net.URL;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
public class LoadingWebPageToJEditorPane
{
 public static void main(String[] a)throws Exception
{
 JFrame frame = new JFrame();
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JEditorPane editorPane = new JEditorPane();
 editorPane.setPage(new URL("http://www.java2s.com"));
 frame.add(new JScrollPane(editorPane));
 frame.setSize(300, 200);
 frame.setVisible(true);
 }
}
JViewPort
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JavaExampleScrollPictureInJApplet extends JApplet
{
 public JavaExampleScrollPictureInJApplet()
 {
 Container Cntnr = getContentPane();
 JViewport ViewPrt = new JViewport();
 JPanel Pnl = new JPanel();
 Pnl.add(new JLabel(new ImageIcon("Koala.jpg")));
 ViewPrt.setView(Pnl);
 Cntnr.add(ViewPrt,BorderLayout.CENTER);
 Cntnr.add(new ButtonPanel(ViewPrt),BorderLayout.SOUTH);
 }
}
 class ButtonPanel extends JPanel implements ActionListener
 {
 JViewport ViewPrt;
 JButton BtnLft = new JButton("Scroll Left");
 JButton BtnUp = new JButton("Scroll UP");
 JButton BtnDwn = new JButton("Scroll Down");
 JButton BtnRght = new JButton("Scroll Right");
 public ButtonPanel(JViewport VwPort)
 {
 ViewPrt = VwPort;
 add(BtnLft);
 add(BtnUp);
 add(BtnDwn);
 add(BtnRght);
 BtnLft.addActionListener(this);
 BtnUp.addActionListener(this);
 BtnDwn.addActionListener(this);
 BtnRght.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e1)
 {
 Point Pstn = ViewPrt.getViewPosition();
 if(e1.getSource() == BtnLft) Pstn.x += 10;
 else if(e1.getSource() == BtnUp) Pstn.y += 10;
 else if(e1.getSource() == BtnDwn) Pstn.y -= 10;
 else if(e1.getSource() == BtnRght) Pstn.x -= 10;
 ViewPrt.setViewPosition(Pstn);
 }
 }
/*<APPLET CODE=JavaExampleScrollPictureInJApplet.class
WIDTH=700 HEIGHT=200 ></APPLET>*/
JTextPane
import java.awt.*;
import javax.swing.*;
public class JavaExampleTextPaneInJApplet extends JApplet
{
 JTextPane TxtPn = new JTextPane();
 public void init()
 {
 Container Cntnr = getContentPane();
 TxtPn.setFont(new Font("Times-Roman", Font.BOLD, 18));
 TxtPn.setText("Welcome To Java");
 Cntnr.add(TxtPn);
 }
}
/*<APPLET CODE=JavaExampleTextPaneInJApplet.class WIDTH=360
HEIGHT=290> </APPLET>*/