public class Fibonacci{
  public static void main(String args[]){

  int i=0, a =0, b=1, c=0;
  
  for (i=0; i<10; i+=1){
    if(i<9){
      System.out.print(a+",");

      c=a+b;
      a=b;
      b=c;
    }else{
      System.out.print(a);
    }//if
    
  }//for  /salida:  0,1,1,2,3,
   
  System.out.println("");

  i= 0;
  b= 1;
  a= 0;
  c= 0;
  System.out.println("Serie con while");
  
  while(i<10){
    if(i<9){
      System.out.print(a+",");

      c=a+b;
      a=b;
      b=c;

    }else{
      System.out.print(a);

    }//if
    i+=1;
  }//while

  System.out.println("");

  i= 0;
  b= 1;
  a= 0;
  c= 0;
  System.out.println("Serie con Do while");
  do{
   if(i<9){
      System.out.print(a+",");

      c=a+b;
      a=b;
      b=c;

    }else{
      System.out.print(a);

    }//if
    i+=1;
  }while(i<10);


 }
}