class sq{
  int number;
void setDim(int i){
  number = i;

}

int squared(){
  return number * number;
}


}



class Square{
  public static void main(String ar[]){

sq square1 = new sq();
sq square2 = new sq();
square1.setDim(5);

System.out.println(square1.squared());

square2.setDim(15);

System.out.println(square2.squared());

  }
}