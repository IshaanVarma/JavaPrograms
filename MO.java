class M{
   void add(){
     
     System.out.println("No paramaters");
   }

   void add(int a){
     System.out.println(a);
   }

   void add(int a, int b){
     System.out.println(a+b);
   }
   void add(int a, int b, int c){
     System.out.println(a+b+c);
   }
}



class MO{
  public static void main(String ar[]){
M M1 = new M();

M1.add();
M1.add(14);
M1.add(19, 49394);
M1.add(21, 1234, 1283);

  }
}