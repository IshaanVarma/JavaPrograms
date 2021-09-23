class house{
  int door;
  int windows;
  int rooms;
  int area;

int area(){
//  System.out.println("area is ");
 return door*windows*rooms;
}
}

class Box{
 public static void main(String ar[]){
house house1 = new house();
house house2 = new house();

house1.door = 14;
house1.windows = 21;
house1.rooms = 12;

//house1.area = house1.door * house1.windows * house1.rooms;
//house1.area();
System.out.println(house1.area());

house2.door = 42;
house2.windows = 35;
house2.rooms = 490;

//house2.area();
System.out.println(house2.area());
//house2.area = house2.door * house2.windows * house2.rooms;

//System.out.println(house1.area);
//System.out.println(house2.area);
 } 
}
