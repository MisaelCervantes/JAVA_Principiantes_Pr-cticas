import java.util.Scanner;

public class Cadenas{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    String nom1="", nom2="";

    System.out.println("==================================");
    System.out.println("Comparacion de nombres");
    System.out.println("==================================");
    System.out.println("Ingresa el primer nombre");
    nom1 = input.nextLine();
    System.out.println("Ingresa el segundo nombre");
    nom2 = input.nextLine();

    if(nom1.equalsIgnoreCase(nom2)){
   
      System.out.println("Los nombres son iguales");

    }else{
      System.out.println("Los nombres son diferentes");

    }//if
 }
}