import java.util.Scanner;

class ElectricityBill{
  public static void main(String ar[]){
  
  
  Scanner ob = new Scanner(System.in);

  System.out.println("How much is your bill without tax ");
  double b = ob.nextDouble();
  

  
  
  if(b<=100 && b>0){
  System.out.print("Your total bill will be "+(b*0.01+b));
  }
  
  
  if(b>100 && b<=200){
     if(b%100 > 0 || b==200){
       if(b>100)
      System.out.println("Your total bill will be "+(100*0.01+(b-100)*0.02+b));
      }
      
      }
      

  if(b>200 && b<=300){
    if(b%100 > 0 || b==300){
      if(b>200)
      System.out.println("Your total bill will be "+(100*0.01+(b-100)*0.02+(b-200)*0.03+b));
    }
        
  }
  if(b>300 && b<=400){
    if(b%100 > 0 || b==400){
      if(b>300)
      System.out.println("Your total bill will be "+(100*0.01+(b-100)*0.02+(b-200)*0.03+(b-400)*0.04+b));

    }}
  if(b>400){
    System.out.println("Your total bill will be "+(100*0.01+(b-100)*0.02+(b-200)*0.03+(b-400)*0.04+(b-400)*0.05+b));
  }

  if (b<0)
  System.out.println("You earned: "+b);

  if(b==0)
  System.out.println("You earned no money or have to spend any money");

  
  }
}