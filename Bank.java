import java.util.Scanner;
class Bank{
  public static void main(String ar[]){

    Scanner ob = new Scanner(System.in);

    System.out.println("Welcome to the bank");

double b=10004;//Bank Balance
double o;//operation like withdrawal or deposit
  int n; 
    
    do{
      System.out.println("press 1 to view your balance.");
      System.out.println("Press 2 to deposit money."); 
      System.out.println("Press 3 to withdraw money."); 
      System.out.println("Press 4 to leave the bank.");
       n = ob.nextInt();

      switch(n){
        case 1:
        System.out.println("Your balance is "+b);
        System.out.println();
break;
        case 2:
        System.out.println("How much money would you like to deposit?");
        o = ob.nextDouble();
        
        for(;o<0;){
          System.out.println();
          System.out.println("Please pick a valid number(positive number)");
          o = ob.nextDouble();
          System.out.println();
        }
        b+=o;
        System.out.println("Transaction Successful current balance: "+b);
        System.out.println();
        break;

        case 3:
         
         System.out.println("How much money would you like to withdraw?");
        o = ob.nextDouble();
            
        if(o<=0){
        System.out.println("Please pick a valid number(Positive Number)");
          System.out.println();
        }
       
        else if(b>=o){
           b-=o;
        System.out.println("Transaction Successful current balance: "+b);
        System.out.println();
        }

        else{
          System.out.println("Insufficient Balance");
          System.out.println();
        }

        break;

        case 4:
        System.out.println("You have left the bank."); 
        break;
                }

        

      if(n<0 || n>4){
        System.out.println("Please pick a valid number from 1 2 3 or 4, No Decimals, negative numbers, or numbers above 4.");
        n=ob.nextInt();
      }}
       
  while(n!=4);
  }
  }

  //for(; o<0;){
          //System.out.println();
          //System.out.println("Please pick a //valid number(positive number)");
          //o = ob.nextDouble();
