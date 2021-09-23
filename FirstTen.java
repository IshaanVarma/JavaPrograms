import java.util.Scanner(;
class FirstTen{
  public static void main(String ar[]){
    Scanner ob = new Scanner(System.in);
    int y=0;
    int a;
    System.out.println("Choose a number");
    a = ob.nextInt();
    //for x<=10 x++ y = 
    for(int x = 0; x<=a; x++){
    y += x;
    
    }
    System.out.println(y);
  }
}