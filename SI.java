class a{
int a;
int b;
int c;
void method(){
  System.out.println("a is 5 and b is 3");
}


}
class b extends a{
int d;
int e;
void method1(){
  System.out.println("d is 4 and c is 12314");
}

void add(){
  System.out.println(a+b+c+d+e);

}
}




class SI{
  public static void main(String ar[]){

a a1 = new a();
b b1 = new b();

a1.method();
b1.a=10;
b1.b=20;
b1.c=30;
b1.d=40;
b1.e=50;
b1.add();


  }
}