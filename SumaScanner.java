import java.util.Scanner;
public class SumaScanner{
  public static void main(String args[]){
    
    Scanner input= new Scanner(System.in);    
    String nombre = "";
    int num1 = 0, num2 = 0, resultado = 0;

    System.out.println("¿Cual es tu nombre?");
    nombre = input.nextLine();

    System.out.println("¿Cual es el primer numero?");
    num1 = input.nextInt();

    System.out.println("¿Cual es el segundo numero?");
    num2 = input.nextInt();

    resultado = num1+num2;
    System.out.println("Tu nombre es: "+ nombre);
    System.out.println("Elresultado es: "+ resultado);

    


 }


}