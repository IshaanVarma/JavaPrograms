class box{
int length, width, height;

box(){
width = -1;
height = -1;
length = -1;
}

box(int length){
  length = width = height;

}
box(int l, int w, int h){
  length = l;
  width = w;
  height = h;


}


int vol(){
  return width*length*height;
}

}



class ConstructBox{
  public static void main(String ar[]){

box box1= new box();

box box2 = new box(7);

box box3 = new box(1,2,9);


System.out.println(box2.vol());
System.out.println(box3.vol());

  }
}