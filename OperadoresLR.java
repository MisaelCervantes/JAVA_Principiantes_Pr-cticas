import java.util.Scanner;

public class OperadoresLR{
  public static void main(String  args[]){
   
   Scanner input = new Scanner(System.in);
   String nombre = "";
   int clave = 0, antiguedad = 0;
   System.out.println("==========================================================");
   System.out.println("Bienvenido al sistema de ExampleCompany");
   System.out.println("==========================================================");
   System.out.println("¿Cual es el nombre del trabajador?");
   nombre = input.nextLine();

   System.out.println("¿Cuantos años de servicio tiene el trabajador?");
   antiguedad = input.nextInt();

   System.out.println("¿Cual es la clave del trabajador?");
   clave = input.nextInt();

   if(clave == 1){
     System.out.println("Atencion al cliente");

     if(antiguedad== 1){
       System.out.println(nombre + " Tiene derecho a 6 dias de vacaciones");
     
     }else if(antiguedad >= 2 && antiguedad <=6){
       System.out.println(nombre + " Tiene derecho a 14 dias de vacaciones");

     }else if(antiguedad >= 7){
       System.out.println(nombre + " Tiene derecho a 20 dias de vacaciones");

     }else{
       System.out.println(nombre + " Necesita un año deexperiencia miimo para tener vacaciones");     
     }

   }else if(clave == 2){
     System.out.println("Logistica");
     if(antiguedad== 1){
       System.out.println(nombre + " Tiene derecho a 7 dias de vacaciones");
     
     }else if(antiguedad >= 2 && antiguedad <=6){
       System.out.println(nombre + " Tiene derecho a 15 dias de vacaciones");

     }else if(antiguedad >= 7){
       System.out.println(nombre + " Tiene derecho a 22 dias de vacaciones");

     }else{
       System.out.println(nombre + " Necesita un año deexperiencia miimo para tener vacaciones");     
     }

   }else if(clave == 3){
     System.out.println("Gerencia");

     if(antiguedad== 1){
       System.out.println(nombre + " Tiene derecho a 10 dias de vacaciones");
     
     }else if(antiguedad >= 2 && antiguedad <=6){
       System.out.println(nombre + " Tiene derecho a 20 dias de vacaciones");

     }else if(antiguedad >= 7 ){
       System.out.println(nombre + " Tiene derecho a 30 dias de vacaciones");

     }else{
       System.out.println(nombre + " Necesita un año de experiencia minimo para tener vacaciones");     
     }

   }else{
     System.out.println("No existe esa opcion");     
   }

 }

}