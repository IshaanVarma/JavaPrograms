abstract class bike{
  bike(){
System.out.println("2 wheels vehicle");
    }
  abstract void run();

  void gears(){
    System.out.println("gears are moving");
  }

  }

  class car extends bike{
    void run(){
      System.out.println("I am running slow");
    
    }
  }

  class Vehicles{
    public static void main(String ar[]){
      bike f = new car();
      f.gears();
      f.run();
      

      
    }
  }

