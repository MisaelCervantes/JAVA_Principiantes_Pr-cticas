import javax.swing.*;
import java.awt.event.*;

public class Botones extends JFrame implements ActionListener{
  private JButton boton1 , boton2, boton3, boton4;
  private JLabel label1;

  public Botones(){
    setLayout(null);
    boton1 = new JButton("1");
    boton1.setBounds(10,100,90,30);
    add(boton1);
    boton1.addActionListener(this);

    boton2 = new JButton("2");
    boton2.setBounds(110,100,90,30);
    add(boton2);
    boton2.addActionListener(this);

    boton3 = new JButton("3");
    boton3.setBounds(210,100,90,30);
    add(boton3);
    boton3.addActionListener(this);

    boton4 = new JButton("close");
    boton4.setBounds(310,100,90,30);
    add(boton4);
    boton4.addActionListener(this);

    label1 = new JLabel("En espera.....");
    label1.setBounds(10,10,300,30);
    add(label1);

  }//constructor

  public void actionPerformed(ActionEvent e){
    if(e.getSource()== boton1){

      label1.setText("Has presionado el boton 1");

    }else if(e.getSource()== boton2){

      label1.setText("Has presionado el boton 2");

    }else if(e.getSource()== boton3){

      label1.setText("Has presionado el boton 3");    

    }else if(e.getSource()== boton4){

      System.exit(0);
 
    }else{
      label1.setText("Esa opcion no existe");    
    
    }//if
  }//captura los eventos   

  public static void main (String args[]){
    Botones botones = new Botones();
    botones.setBounds(0,0,450,200);
    botones.setVisible(true);
    botones.setResizable(false);
    botones.setLocationRelativeTo(null);
 }//main
}//class