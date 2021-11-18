    abstract class bank{
  abstract int interest();
}

class bank1 extends bank{
  int interest(){
    return 7;
  }

}

class bank2 extends bank{
  int interest(){
    return 8;

  }

}                 

class AbsBank{
  public static void main(String ar[]){
    bank e = new bank1();
    bank f = new bank2();

    System.out.println(e.interest()+"%");
    System.out.println(f.interest()+"%");

  }
}
