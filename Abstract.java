abstract class Shape{
abstract void draw();
}

class Rectangle extends Shape{

void draw(){
System.out.println("rectangle");
}
}

class Ellipse extends Shape{
  void draw(){
    System.out.println("ellipse");
  }

}

class Abstract{
  public static void main(String ar[]){

    Shape s = new Rectangle();
    Shape s1 = new Ellipse();

    s1.draw();
    s.draw();
  }
}
