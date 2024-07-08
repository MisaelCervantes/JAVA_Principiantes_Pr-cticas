import java.util.Scanner;

public class MatrizDina{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    
    int contador=1, columnas = 0, filas= 0;
    System.out.println("¿Cuantas filas deseas?");
    filas= input.nextInt();

    System.out.println("¿Cuantas columnas deseas?");
    columnas= input.nextInt();

    int numeros [][] = new int [filas][columnas];
    
    for(int j=0; j<filas; j+=1){
      for(int i=0; i<columnas; i+=1){
        numeros[j][i] = contador;
        contador +=1;
        System.out.print("[" + numeros[j][i] + "]");
      }//for filas       
      System.out.println("");
    }//for filas
     
  
 }//main

}//class