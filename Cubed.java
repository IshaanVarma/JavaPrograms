import java.util.Scanner;
class Cubed{
  public static void main(String ar[]){
    Scanner ob = new Scanner(System.in);
    System.out.println("Choose a number you would to get cubed");
    int x = ob.nextInt();

    System.out.println(x+" cubed is equal to "+(x*x*x));
  }
}