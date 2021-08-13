import java.util.Scanner;

public class PositiveOrNegative{
  public static void main(String ar[]){
//variable a input value if statement %= 0
Scanner ob = new Scanner(System.in);

int a;

System.out.println("a is: ");
a = ob.nextInt();

if(a > 0){
  System.out.println("A is positive");
}
if(a<0){
System.out.println("A is negative");
}
if(a==0){
  System.out.println("A is neither negative or positive");
}

  }
}