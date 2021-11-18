interface Polygo{
  void area(int l, int w, int h, int b);

}


class Rect implements Polygo{
  public void area(int l,int w, int h, int b){
    System.out.println("area of a rectangle is length * width "+(l*w));
  }

}

class Triangle implements Polygo{
  public void area(int l, int w, int h, int b){
    System.out.println("the area of a triangle is base*height/2 "+((b*h)/2));
  }
}

class Polygon{
  public static void main(String ar[]){
  
  Triangle ob1 = new Triangle();
  Rect ob2 = new Rect();

  ob1.area(1,1,14,4);
  ob2.area(14,14,1,1);

  }
}