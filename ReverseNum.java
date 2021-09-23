import java.util.Scanner;
class ReverseNum{
  public static void main(String ar[]){
    int a =4123;
    int i = 0;//I holds the result
    int b =0;//b holds the remainder
  /*  while(a!=0){
      b = a%10;//3
      i=i*10+b;//3214
      
    }
    System.out.println(i);*/

for(; a!=0;a/=10 ){

b= a%10;
i=i*10+b;


}
System.out.println(i);
  }
}
