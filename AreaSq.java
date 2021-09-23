class rect{
int length,width;
rect(int l,int w){
length = l;
width = w;  
}

int area(){
  return length*width;
}

}

class AreaSq{
  public static void main(String ar[]){

    rect rect1 = new rect(3,4);
    rect rect2 = new rect(3,499);

  System.out.println(rect1.area());
  System.out.println(rect2.area());

    
  }
}