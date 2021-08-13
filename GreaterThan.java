import java.util.Scanner;

public class GreaterThan{
  public static void main(String ar[]){
    Scanner ob = new Scanner(System.in);

    System.out.println("a is:");
    double a = ob.nextDouble();

    System.out.println("b is:");
    double b = ob.nextDouble();

   
    
    
    if(a>b){
      System.out.println(a+" is greater than "+b);
    }
    else if(a==b){
      System.out.println("a and b are both equal");
    }
    else{
      System.out.println(b+" is greater than "+a);
      }
    }
  }
