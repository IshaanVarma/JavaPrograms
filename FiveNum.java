import java.util.Scanner;
public class FiveNum{
  public static void main(String ar[]){
    Scanner ob  new Scanner(System.in);

    int a,b,c,d,e;

  System.out.println("What value would you like for a");
  a=ob.nextInt();
  System.out.println("What value would you like for b");
  b=ob.nextInt();
  System.out.println("What value would you like for c");
  c=ob.nextInt();
  System.out.println("What value would you like for d");
  d=ob.nextInt();
  System.out.println("What value would you like for e");
  e=ob.nextInt();

int x = a+b+c+d+e;
  System.out.println("The sum of those numbers are "+x);
  System.out.println("The average of those numbers are "+(x/5));
  }
}