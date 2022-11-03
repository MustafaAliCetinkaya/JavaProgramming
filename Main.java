import java.util.Scanner;
class Main {
  
  public static void sign(int n){
    //WRITE YOUR CODE BELOW
String result=(n<0)?"negative":(n==0)?"zero":"positive";
    System.out.println(result);
    
  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    
    sign(n);
    
  }
}