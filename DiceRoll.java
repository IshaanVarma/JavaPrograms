import java.util.Scanner;
class DiceRoll{
  public static void main(String ar[]){

//Scanner.ob = new Scanner(System.in);
//System.out.println("press f to exit");



int roll1;
int roll2;

int counter=0;

/*for(counter = 0;(roll1 != 1 && roll2 != 1); counter ++){

roll1 = (int)(Math.random()*6)+1;
roll2 = (int)(Math.random()*6)+1;
System.out.println("You rolled a "+roll1+" and a "+roll2);
}

System.out.println("You recieved a snake eyes in "+counter+" rolls");

*/
  
do {
roll1 = (int)(Math.random()*6)+1;
roll2 = (int)(Math.random()*6)+1;
counter ++;
System.out.println("You rolled a "+roll1+" and a "+roll2);
} while (roll1 !=1 || roll2 != 1);

System.out.println("You recieved a snake eyes in "+counter+" rolls");
  }}


  
