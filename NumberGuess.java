import java.util.Scanner;
class NumberGuess{
  public static void main(String ar[]){

Scanner ob = new Scanner(System.in);

int UserNumber;
int Counter = 0;
int CompNum;

CompNum = (int)(Math.random() * 100) + 1;

System.out.println("You are playing Guess the Number \n The goal is to guess a number from 1 to 100 trying to guess the number the computer chose. \n Do not try to put a number outside these ranges.\n type in a number:");

//System.out.println(CompNum);

do{

  UserNumber = ob.nextInt();

Counter++;

if (UserNumber == CompNum){
  System.out.println("You won! The number was "+CompNum+" and you got it in "+Counter);
}

//else if(Counter > 5){
//  System.out.println("GameOver \n you ran out of guesses\n The number was "+CompNum);
//}


if (UserNumber != CompNum && Counter < 6){
  System.out.println("Wrong, Try again"+Counter);
}
else if(Counter > 5){
  System.out.println("GameOver \n you ran out of guesses\n The number was "+CompNum);

}

}
while (UserNumber != CompNum && Counter <= 5);







}


  }

  


