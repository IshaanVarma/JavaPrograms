import java.util.Scanner;

class ThreeNum{
  public static void main(String ar[]){
   
  Scanner ob = new Scanner(System.in); 
    int a;
   System.out.println("choose a value for a");
    a = ob.nextInt();
    int b;
    System.out.println("choose a value for b");
    b = ob.nextInt();
    int c;
    System.out.println("choose a value for c");
    c = ob.nextInt();
    int d;
   // int e;
   // int f;
    d = (a>b) ? (a>c?a:c):(b>c?b:c);
    //e = (a>c) ? a: c;
    //f = (d>e) ? d: e;
// if(d==e){
   System.out.println(d+" is the highest number");
    
 //   }
//else{
//System.out.println(f+" is the highest number");

}

  
  }
