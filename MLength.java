import java.util.Scanner;
public class MLength{
  public static void main(String args[]){

  Scanner input = new Scanner(System.in);

  String word = "", newword="";
  int num_caracteres = 0, inicio=0, hasta=0;
  
  System.out.println("INGRESA LA PALABRA");
  word=input.nextLine();

  
  num_caracteres = word.length();

  System.out.println("la cadena de caracteres ->>"+word +"<<- posee"+ num_caracteres+ " caracteres");

  System.out.println("Desde que caracter deseas obtener");
  inicio=input.nextInt();
  System.out.println("Hasta que caracter deseas obtener");
  hasta=input.nextInt();
  
  newword=word.substring(inicio,hasta);
  System.out.println("la nueva palabra es: "+ newword);



 }//metodo main


}//class