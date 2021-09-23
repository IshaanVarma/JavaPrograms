class Lamp{
  boolean isOn;

  void turnOn(){
    isOn = true;
    System.out.println("light is on");
  }

  void turnOff(){
    isOn = false;
    System.out.println("light is off");
  }
}

class Light{
  public static void main(String ar[]){
    
    Lamp LED = new Lamp();
    Lamp Halogen = new Lamp();

LED.turnOn();
Halogen.turnOn();
LED.turnOff();
Halogen.turnOff();
  }
}