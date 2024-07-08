public class ECOperaciones{
  public static void main(String args[]){
    int Operacion = 1;
    int num1 = 8;
    int num2 = 4;
    int resultado = 0;
    
    System.out.println("Selecciona un numero para realizar la operacio del numero 8 y numero 4");
    System.out.println("1.Suma, 2. Resta, 3. Multiplicacion, 4. Division ");
    
    if(Operacion == 1 ){

      System.out.println("Elegiste Suma");
      resultado = num1+num2;
      System.out.println("El resultado es: "+ resultado);

    }else if(Operacion == 2 ){

      System.out.println("Elegiste Resta");
      resultado = num1-num2;    
      System.out.println("El resultado es: "+ resultado);

    }else if(Operacion == 3 ){

      System.out.println("Elegiste Multiplicacion");
      resultado = num1*num2;
      System.out.println("El resultado es: "+ resultado);

    }else if(Operacion == 4 ){

      System.out.println("Elegiste Division");
      resultado = num1/num2;
      System.out.println("El resultado es: "+ resultado);

    }else{
      System.out.println("No existe esa operacion");    
    }

 }

}