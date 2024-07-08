import java.util.Scanner;

public class Login {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    String user="", pass="";

    System.out.println("==================================");
    System.out.println("Login");
    System.out.println("==================================");
    System.out.println("Ingresa tu nombre de usuario");
    user = input.nextLine();
    System.out.println("Ingresa la contrasena");
    pass = input.nextLine();

    if(user.equals("misael") && pass.equals("123456")){
   
      System.out.println("Inicio de sesion existoso");
      System.out.println("Bienvenido "+user);

    }else{
      System.out.println("La contraseña de "+user+" es incorrecta");
      System.out.println("Intenta otra vez");

    }//if
 }
}