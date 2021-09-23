import java.util.Scanner;
class Vowel{
  public static void main(String ar[]){
Scanner ob = new Scanner(System.in);

System.out.println("choose a letter to know if it is a vowel or consonant");
String l = ob.next();
//String l = ob.next().charAt(0);

switch(l){
  case "a":
  case 'c':
  case 'd':
  case 'f':
  case 'g':
  case 'h':
  case 'j':
  case 'k':
  case 'l':
  case 'm':
  case 'n':
  case 'p':
  case 'q':
  case 'r':
  case 's':
  case 't':
  case 'v':
  case 'w':
  case 'x':
  case 'z':
  System.out.println(l+" is a consonant");

  case 'a':
  case 'e':
  case 'i':
  case 'o':
  case 'u':
  System.out.println(l+" is a vowel");

  case 'y':
  System.out.println(l+" is a special letter that is usually a consonant but can be a vowel");
}
  }
}