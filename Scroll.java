import javax.swing.*;

public class Scroll extends JFrame{
  private JTextField TextField1;
  private JScrollPane ScrollPane1;
  private JTextArea TextArea1;


  public Scroll(){
    setLayout(null);
    TextField1 = new JTextField();
    TextField1.setBounds(10, 10, 200,30);
    add(TextField1);
    
    TextArea1 = new JTextArea();
    ScrollPane1 = new JScrollPane(TextArea1);
    ScrollPane1.setBounds(10, 50, 400, 300);    
    add(ScrollPane1);
    
  }//constructor


  public static void main (String args[]){
    Scroll scroll1 = new Scroll();
    scroll1.setBounds(0, 0, 540, 400);
    scroll1.setVisible(true);
    scroll1.setResizable(false);
    scroll1.setLocationRelativeTo(null);
    

  }//main


}//class