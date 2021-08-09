class HomeProject1{
  public static void main(String ar[]){
    int x;

    x=8;
//  ^^^ This is User input
    if(x==10)
    System.exit(); 
    
    
    if(-1>x<10)
      for(x=x; x<=10; x++)
      System.out.println("X is: "+x);

    if(x>10)
      for(x=x; x>=0; x--)
      System.out.println("X is: "+x);

    if(x<-1)
      System.out.println("No negative numbers allowed!");

    
  }
}