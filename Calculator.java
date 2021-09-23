import java.util.Scanner;


class Calc{
  double number1;
  double number2;
  
  void numb(double a, double b){
    number1 = a;
    number2 = b;
  }

  double addition(){
    return number1 + number2;
  }

  double subtraction(){
    return number1 - number2;
  }

  double multiplication(){
    return number1 * number2;
  }

  double division(){
    return number1 / number2;
  }

}

class Calculator{
  public static void main(String ar[]){

Scanner ob = new Scanner(System.in);


Calc Calc1 = new Calc();

System.out.println("Choose your first number in the calculator");
double a = ob.nextDouble();

System.out.println("Choose your operation");
char c = ob.next().charAt(0);

System.out.println("Choose your second number in the calculator");
double b = ob.nextDouble();

Calc1.numb(a,b);

switch(c){
  case '+':
System.out.println(a+" "+c+" "+b+" = "+Calc1.addition());
break;
  case '-':
  System.out.println(a+" "+c+" "+b+" = "+Calc1.subtraction());
break;
  case '*':
  System.out.println(a+" "+c+" "+b+" = "+Calc1.multiplication());
break;
  case '/':
  System.out.println(a+" "+c+" "+b+" = "+Calc1.division());
break;
  default:
  System.out.println("choose an actual operation next time");
  break;
}

}
}