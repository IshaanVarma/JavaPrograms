class AverageOfValues{
  public static void main(String ar[]){
    double Averaging[] = {31.424, 59.87, 1923.45, 529.8, 192.93};
    double a;
    a=0;
    for(int i =0; i < 5; i++){
      a=a+Averaging[i];
    
    }
    System.out.println(a/5);
  }
}