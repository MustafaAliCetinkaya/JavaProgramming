import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    System.out.println("Enter seconds:");
   int inputSeconds=input.nextInt();
    int hours, minutes, seconds;
    seconds=inputSeconds%60;
    minutes=(inputSeconds/60)%60;
    hours=inputSeconds/(60*60);
    System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");    
  }
}