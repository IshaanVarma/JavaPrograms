


interface b1 {
  double RateOfInterest();
}
class BOA implements b1{
  public double RateOfInterest(){
    return 1.3;
  }
}

class Chase implements b1{
  public double RateOfInterest(){
    return 1.352;
  }
}

class InterBank{
  public static void main(String ar[]){

    b1 obj = new BOA();
    b1 objj = new Chase();

    System.out.println(obj.RateOfInterest());
    System.out.println(objj.RateOfInterest());
  }
}