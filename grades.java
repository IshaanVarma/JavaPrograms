import java.util.Scanner;

class grades{
  public static void main(String ar[]){
   int i; 
    Scanner ob = new Scanner(System.in);
System.out.println("enter your grades");
i = ob.nextInt();


switch(i){
  case 50:
  case 51:
  case 52:
  case 53:
  case 54:
  case 55:
  case 56:
  case 57:
  case 58:
  case 59:
  System.out.println("You got a D");
break;

  case 60:
  case 61:
  case 62:
  case 63:
  case 64:
  case 65:
  case 66:
  case 67:
  case 68:
  case 69:
System.out.println("You got a C");
break;

case 70:
case 71:
case 72:
case 73:
case 74:
case 75:
case 76:
case 77:
case 78:
case 79:
System.out.println("You got a B");
break;

case 80:
case 81:
case 82:
case 83:
case 84:
case 85:
case 86:
case 87:
case 88:
case 89:
System.out.println("You got an A");
break;

case 90:
case 91:
case 92:
case 93:
case 94:
case 95:
case 96:
case 97:
case 98:
case 99:
case 100:
System.out.println("You got an A+");
break;
}

if(i>100)
System.out.println("You recieved extra-credit");

if(i<50)
System.out.println("You Failed the Test!");
 }
}