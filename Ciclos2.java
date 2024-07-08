public class Ciclos2{
  public static void main(String args[]){

   int i = 1, j=99;

   System.out.println("Serie con for: ");
   
   for(i=1; i<=5; i+=1){
     if(i<5){
       System.out.print(i+",");
       System.out.print(j+",");

     }else {
       System.out.print(i+",");
       System.out.print(j);
     }//if
   j-=1;
   }//for

   System.out.println("");

   i = 1;
   j = 99;

   System.out.println("Serie while: ");

   while(i<=5){
     if(i<5){
       System.out.print(i+",");
       System.out.print(j+",");

     }else {
       System.out.print(i+",");
       System.out.print(j);
     }//if
   i+=1;
   j-=1; 


   }//while

   System.out.println("");

   i = 1;
   j = 99;

   System.out.println("Serie Do While: ");    

   do{
     if(i<5){
       System.out.print(i+",");
       System.out.print(j+",");

     }else {
       System.out.print(i+",");
       System.out.print(j);
     }//if
   i+=1;
   j-=1; 


   }while(i<=5); 
 }

}