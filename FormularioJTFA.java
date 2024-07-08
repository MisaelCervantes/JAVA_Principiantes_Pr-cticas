import javax.swing.*;
import java.awt.event.*;

public class FormularioJTFA extends JFrame implements ActionListener{
  private JTextField textfield1;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  private JButton boton1;
 
  String texto = "";
  
  public FormularioJTFA(){
    setLayout(null);
    textfield1 = new JTextField();
    textfield1.setBounds(10,10,200,30);
    add(textfield1);

    boton1 = new JButton("Agregar");
    boton1.setBounds(250,10,100,30);
    add(boton1);
    boton1.addActionListener(this);

    textarea1 = new JTextArea();
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(10,50,400,300);
    add(scrollpane1);
  }//constructor


  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      texto += textfield1.getText()+"\n";
      textarea1.setText(texto);      
      textfield1.setText("");      

    }//if

  }//evento boton


  public static void main(String args[]){
    FormularioJTFA form1 = new FormularioJTFA();
    form1.setBounds(0,0,540,400);
    form1.setVisible(true);
    form1.setResizable(false);
    form1.setLocationRelativeTo(null);
    

  }//main

}//class
