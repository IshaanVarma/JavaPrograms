import java.util.Scanner;

class ThreeNumbers{
  public static void main(String ar[]){
   
   Scanner ob = new Scanner(System.in);

  System.out.println("choose a value for a");
  double a = ob.nextDouble();

  System.out.println("choose a value for b");
  double b = ob.nextDouble();

  System.out.println("choose a value for c");
  double c = ob.nextDouble();


    if(a == b && a == c){
      System.out.println("All numbers are equal");
    }
    else if((a>b && b>c) || (a>b && b<c) || (a<b && b>c) || (a<b && b<c))
    System.out.println("All numbers are different");

    else
    System.out.println("Neither are the numbers all equal or all different");

  }
}