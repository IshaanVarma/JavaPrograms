//import java.util.Scanner

import java.util.Scanner;

public class InputAndImport{
  public static void main(String ar[]){
    Scanner ob = new Scanner(System.in);

   double a, b, c;

   System.out.println("input a: ");
   a = ob.nextDouble();
  
   System.out.println("input b: ");
   b = ob.nextDouble();
  
   System.out.println("input c: ") ;
  c = ob.nextDouble();

double result = b*b-4.0*a*c;
System.out.println(result);
  
  
  }
}