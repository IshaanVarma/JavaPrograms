import java.util.Scanner;

public class Seasons{
  public static void main(String ar[]){

    Scanner ob = new Scanner(System.in);

  System.out.println("choose a month from 1-12 as a number: ");
  int a = ob.nextInt();
  String s;
  if(a==1 || a==2)
  s="Winter";

  else if(a==4||a==5)
  s="Spring";

  else if (a==7||a==8)
  s="Summer";

  else if (a==10|| a==11)
  s="Autumn";

  else if(a==3||a==6||a==9||a==12)
  s="multi-seasoned";
  else
  s="Not a real month";

  System.out.println("This month falls under the "+s+" category");
  }
}