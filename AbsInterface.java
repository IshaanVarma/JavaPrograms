


import java.lang.Math.*;

interface Polygon{
  void area(int r, int w, int l);
  void circumference(int s);

}

class circle implements Polygon{
  public void area(int r, int w, int l){
System.out.println("radius squared multiplied by pi"+(Math.PI*(r*r)));}

public void circumference(int s){
  System.out.println("a "+(2*Math.PI*s));
  }
}

class AbsInterface{
  public static void main(String ar[]){
    circle c1 = new circle();
    circle c2 = new circle();
    c2.circumference(2);
    c1.area(2,11,1);

  }
}