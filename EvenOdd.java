import java.util.Scanner;
public class EvenOdd{
  public static void main(String ar[]){



Scanner ob = new Scanner(System.in);

System.out.println("b is: ");
int b = ob.nextInt();

if(b%2 == 0){
  System.out.println(b+" is an even number");
}
else{
  System.out.println(b+" is an odd number");
}
  }
}