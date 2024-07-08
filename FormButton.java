import javax.swing.*;
import java.awt.event.*;

public class FormButton extends JFrame implements ActionListener{
  JButton boton1;
  public FormButton(){
    setLayout(null);
    boton1 = new JButton("Close");
    boton1.setBounds(300,250,100,30);
    add(boton1);
    boton1.addActionListener(this);

  }//constructor

  public void actionPerformed(ActionEvent e){ //metodo getSource contiene el objeto donde se origino el evento de boton 1y lo recupera dentro del espacio en memoria "e"

    if(e.getSource() == boton1){
      System.exit(0);
    }//if
  }//capturar el evento
  

  public static void main(String args[]){
    FormButton formBt= new FormButton();    
    formBt.setBounds(0,0,450,350);
    formBt.setVisible(true);
    formBt.setResizable(false);
    formBt.setLocationRelativeTo(null);
 }//main
}//class