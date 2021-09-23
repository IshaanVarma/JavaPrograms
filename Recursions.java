/*class Rec{


  int method(int a){
  int result;
  if(a==1)
  return 1;
  result = a*method(a-1);
  return result;
  

  }
}

class Recursions{
  public static void main(String ar[]){

Rec rec1 = new Rec();


System.out.print(rec1.method(4));
  }
}*/

/*import java.util.Scanner;
class Recursions{
  public static void main(String ar[]){
Scanner ob = new Scanner(System.in);

System.out.println("Choose a number to use permutation");

int a = ob.nextInt();

int b=1;


for(int c=1; c<=a; c++){
b=b*c;
}
System.out.println(b);
  }}*/

  import java.util.Scanner;
class Recursions{
  public static void main(String ar[]){
Scanner ob = new Scanner(System.in);

System.out.println("Choose a number to use permutation");

int a = ob.nextInt();

int b=1;
int c=1;

while (c<=a){
  b = b*c;
 c++;
}
System.out.println(b);






  }}