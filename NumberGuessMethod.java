import java.util.Scanner;
class Logic{

Scanner ob = new Scanner(System.in);

void Game(){
int UserNumber;
int Counter = 0;
int CompNum;

CompNum = (int)(Math.random() * 100) + 1;

System.out.println("You are playing Guess the Number \n The goal is to guess a number from 1 to 100 trying to guess the number the computer chose. \n Do not try to put a number outside these ranges.\n type in a number:");

while(true){

  UserNumber = ob.nextInt();

Counter++;

if (UserNumber == CompNum){
  System.out.println("You won! The number was "+CompNum+" and you got it in "+Counter);
  break;
}

else if(Counter > 5){
  System.out.println("GameOver \n you ran out of guesses\n The number was "+CompNum);
  break;
}


if (UserNumber > CompNum){
  System.out.println("Wrong, Try again but a Lower Value");
  
}
else if (UserNumber < CompNum){
  System.out.println("Wrong, Try again but a High Value");
  
}


}


}
}


class NumberGuessMethod{
  public static void main(String ar[]){
Scanner ob1 = new Scanner(System.in);

boolean playAgain;

Logic l = new Logic();
do{
 l.Game();
  System.out.println("Would you like to play again? \n True or False");
  playAgain = ob1.nextBoolean();
}
while(playAgain);


}
  }

  


