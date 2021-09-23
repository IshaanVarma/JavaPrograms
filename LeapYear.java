import java.util.Scanner;
class LeapYear{
  public static void main(String arr[]){
    Scanner ob = new Scanner(System.in);
    
    System.out.println("What year is it");
    int y = ob.nextInt();

    

  
    if(y%4 == 0 && y>=0)
    System.out.println("The year of "+y+" is a leap year");
    else
    System.out.println("This is not a leap year");

  }
}