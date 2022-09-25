import java.util.*;

public class Main {
  public static void main(String[] args) {
     //DO NOT TOUCH THESE LINE/LINES.  
    Scanner input = new Scanner(System.in);
    String word = input.nextLine();
    
    if(word.equalsIgnoreCase("Java")){
      System.out.println("Today's word of the day is: Java");
    }

   if(word.equalsIgnoreCase("Apple")){
       System.out.println("Today's word of the day is: Apple");
    }   

    if(word.equalsIgnoreCase("SDET")){
       System.out.println("Today's word of the day is: SDET");
    }  

       if(word.equalsIgnoreCase("Testing")){
       System.out.println("Today's word of the day is: Testing");
    } 
  }
}