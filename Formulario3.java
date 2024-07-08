import javax.swing.*;

public class Formulario3 extends JFrame{
  private JLabel label1;
  private JLabel label2;
  public Formulario3(){
    setLayout(null);
    label1 = new JLabel("interfaz gráfica");
    label1.setBounds(10,20,300,30);
    add(label1);

    label2 = new JLabel("Version 1.0");
    label2.setBounds(10,100,100,30);
    add(label2);

  }//constructor

  public static void main(String args[]){
    Formulario3 formulario3 = new Formulario3();
    formulario3.setBounds(0,0,300,200);
    formulario3.setResizable(false);
    formulario3.setVisible(true);
    formulario3.setLocationRelativeTo(null );
  }//main

}//class