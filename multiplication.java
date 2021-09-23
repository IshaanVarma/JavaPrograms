import java.util.Scanner;

class multiplication{
  public static void main(String ar[]){

Scanner ob = new Scanner(System.in);
System.out.println("what number would you like to be multiplied");
int a = ob.nextInt();

System.out.println(a+" multiplied by all numbers til 10");

//Using For Loops
/*for(int i = 1; i<=10; i++){
  int result = a*i;
  System.out.println(a+" * "+i+" = "+result);
} 
*/

//Using While Loops
/*int i = 1;
int result = a*i;

while(i<=10){
  System.out.println(a+" * "+i+" = "+result);
  i++;
}*/

int i = 1;

do{
  System.out.println(a+" * "+i+" = "+(a*i));
  i++;
}
while(i<=10);

  }
}