import java.util.Scanner;
class SeasonsSwi{
  public static void main(String ar[]){

Scanner ob = new Scanner(System.in);

System.out.println("choose a number of the month you want to find out the season of");
int s = ob.nextInt();

switch(s){
case 1:
case 2:
System.out.println("This month falls under Winter");
break;

case 4:
case 5:
System.out.println("This month falls under Spring");
break;

case 7:
case 8:
System.out.println("This month falls under Summer");
break;

case 10:
case 11:
System.out.println("This month falls under Autumn");
break;

case 3:
case 6:
case 9:
case 12:
System.out.println("This month falls under the multi month cateogry");
break;

default:
System.out.println("This month falls under the non-existant category");
}


  }
}