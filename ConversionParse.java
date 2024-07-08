import javax.swing.*;
import java.awt.event.*;

public class ConversionParse extends JFrame implements ActionListener{

  private JTextField textfield1, textfield2;
  private JLabel label1, label2, label3;
  private JButton boton1;

  public ConversionParse(){
    setLayout(null);
    label1 = new JLabel("Valor1");
    label1.setBounds(50,5,100,30);
    add(label1);

    label2 = new JLabel("Valor2");
    label2.setBounds(50,35,100,30);
    add(label2);

    label3 = new JLabel("Resultado");
    label3.setBounds(120,80,100,30);
    add(label3);

    textfield1 = new JTextField();
    textfield1.setBounds(120,10,150,20);
    add(textfield1);

    textfield2 = new JTextField();
    textfield2.setBounds(120,40,150,20);
    add(textfield2);

    boton1 = new JButton("Calcular");
    boton1.setBounds(10,80,100,30);
    add(boton1);
    boton1.addActionListener(this);

  }//constructor

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      int num1 = 0, num2 = 0, resultado;
      
      num1 = Integer.parseInt(textfield1.getText());      
      num2 = Integer.parseInt(textfield2.getText());
 
      resultado = num1 + num2;
      
      label3.setText("Resultado: "+ resultado);
            

    }//if
  }//evento

  public static void main(String args[]){
    ConversionParse form1 = new ConversionParse();
     form1.setBounds(0,0,300,150);
     form1.setVisible(true);
     form1.setResizable(false);
     form1.setLocationRelativeTo(null);
  }//main

}//class