/*class box{
  private double length;
  private double height;
  private double width;


box(box a){
  width = a.width;
  height = a.height;
  length = a.length;
}

box(double w,double h,double l){
  width = w;
  height = h;
  length = l;
}

double vol(){
  return width*height*length;
}
}

class box1 extends box{
double weight;
box1(box1 a){
super(a);
weight = a.weight;
}

box1(double w,double h,double l, double we){
super(w, h, l);
weight = we;
}

}


class Super{
  public static void main(String ar[]){
    box1 myBox = new box1(13, 14, 1231.2, 17854.1232);
    box1 myBox1 = new box1(myBox);

System.out.println(myBox.vol());
System.out.println(myBox1.vol());
  }
}*/


class box{
  double a;
  double b;
}

class box1 extends box{
  double a;
  double b;


  box1(double i, double j, double k, double l){
super.a = i;
super.b = j;
a = k;
b = l;
  }
 void show(){
   
  System.out.println(super.a);
  System.out.println(super.b);
  System.out.println(a);
  System.out.println(b);

 }

}
class Super{
public static void main(String ar[]){

  box1 ob = new box1(1, 2, 3, 4);
  ob.show();
  
}
}