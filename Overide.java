class figure{
  int dim1;
  int dim2;

  figure(int a, int b){
    dim1 = a;
    dim2 = b;
  }
double area(){
  System.out.println("The area of the figure is: ");
  return 0;
  
}

}

class rectangle extends figure{
  
  rectangle(int a, int b){
    super(a,b);
  }
  double area(){
    System.out.println("The area of the figure is: ");
  return dim1 * dim2;
}
}

class triangle extends figure{

  triangle(int a, int b){
    super(a, b);
  }
double area(){
  System.out.println("The area of the figure is: ");
  return (dim1 * dim2) / 2;
}
}

class Overide{
  public static void main(String ar[]){
    figure shape = new figure(12, 42);
    triangle shape1 = new triangle(13, 5);
    rectangle shape2 = new rectangle(41, 12);

    figure f; 
    f = shape;
    System.out.println(f.area());
    f = shape1;
    System.out.println(f.area());
    f = shape2;
    System.out.println(f.area());
  }
}