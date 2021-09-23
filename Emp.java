class employee{
  String Name;
  int ID;

  void Identification(String setName, int setID){
    
    Name = setName;
    ID = setID;
    
    System.out.println(Name+"\n"+ID);
  }

}

class Emp{
  public static void main(String ar[]){

    employee employee1 = new employee();
    employee employee2 = new employee();

    employee1.Identification("Ishaan", 1);
  
  

  }
}