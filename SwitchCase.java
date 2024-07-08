import java.util.Scanner;
public class SwitchCase{
  public static void main(String args[]){
   
  Scanner input = new Scanner(System.in);

    int num1= 5, num2 = 3, resultado = 0, opcion = 0;
        System.out.println("SELLECCIONA LA OPERACION QUE DESEAS REALIZAR");
        System.out.println("1.- SUMA");
        System.out.println("2.- RESTA");
        System.out.println("3.- MULTIPLICACION");
        System.out.println("4.- DIVISION");

    opcion= input.nextInt();
    switch(opcion){
      case 1: resultado = num1 + num2;
        System.out.println("El resultado de la suma es: "+ resultado);
        break;
      case 2: resultado = num1 - num2;
        System.out.println("El resultado de la resta  es: "+ resultado);
        break;
      case 3: resultado = num1 * num2;
        System.out.println("El resultado de la multiplicacion es: "+ resultado);
        break;
      case 4: resultado = num1 / num2;
        System.out.println("El resultado de la division es: "+ resultado);
        break;
      default:        System.out.println("Error la opcion no existe");
        break;
    }


 }

}