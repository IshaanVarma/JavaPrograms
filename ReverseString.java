import java.util.Scanner;

public class ReverseString {

    //1. using for loop and charAt
    public static void main(String[] args) 
    {

      Scanner ob = new Scanner(System.in);

      System.out.println("Insert a word or name to be reversed:");
      String s = ob.nextLine();
        
        String reverse="";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse=reverse+(s.charAt(i));
        }
        System.out.println(reverse);
}}