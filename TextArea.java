import javax.swing.*;

public class TextArea extends JFrame{
  private JTextField textfield1;
  private JTextArea textarea1;
 
  public TextArea(){

    setLayout(null);
    textfield1 = new JTextField();
    textfield1.setBounds(10,10,200,30);
    add(textfield1);

    textarea1 = new JTextArea();
    textarea1.setBounds(10,50,400,300);
    add(textarea1);

  }//constructor


  public static void main(String args[]){
    TextArea textarea = new TextArea();
    textarea.setBounds(0,0,540,400);
    textarea.setVisible(true);
    textarea.setResizable(false);
    textarea.setLocationRelativeTo(null);
  }//main
}//class