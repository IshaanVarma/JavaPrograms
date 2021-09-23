class temperary{
int a;
int b;

void temp(temperary t){
  t.a+=4;
  t.b+=59;

}

temperary(int i, int j){

  a=i;
  b=j;

}
}

class PassByReference{
  public static void main(String ar[]){
temperary t1 = new temperary(14,659);
System.out.println(t1.a+" "+t1.b);
t1.temp(t1);
System.out.println(t1.a+" "+t1.b);

  }
}