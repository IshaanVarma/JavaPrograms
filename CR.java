class student{
  int math;
  int science;
  int english;
  String studentName;

  void report(int mathsc, int sciencesc, int englishsc, String setStudentName){

    math = mathsc;
    science = sciencesc;
    english = englishsc;
  studentName = setStudentName;

  }

  int scores(){
    int a = (math+science+english)/3;
return a;
   
  }

}

class CR{
  public static void main(String ar[]){
    student student1 = new student();
    student student2 = new student();

student2.report(98, 55, 89, "Hi");

 System.out.println(student2.studentName+" scored "+student2.scores()+" in average");


  }
}