import java.util.Scanner;

public class VectoresDinamicos{
  public static void main(String args[]){

    Scanner input = new Scanner(System.in);
    int longitud = 0;

    System.out.println("===============================");
    System.out.println("Arreglos Dinamico");
    System.out.println("===============================");
    

    System.out.print("Cuantos numero deseas ingresar");
    longitud = input.nextInt();

    int numeros[] = new int[longitud];
    
    for(int i =0; i<numeros.length; i+=1){
    System.out.print("dame el valor de #"+ (i+1)); 
  
    numeros[i]= input.nextInt();
  
    }//for

    for(int i =0; i<numeros.length; i+=1){
    System.out.print("["+numeros[i]+"]");  
      
  
    }//for2




 }//main

}//class