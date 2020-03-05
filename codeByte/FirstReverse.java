import java.util.*; 
import java.io.*;

class FirstReverse {

  public static String firstReverse(String str) {
      
      return new StringBuilder(str).reverse().toString();
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.println(firstReverse("coderbyte")); 
    System.out.println(firstReverse("I Love Code")); 
    System.out.println(firstReverse("123456789")); 
    System.out.println(firstReverse("aq")); 
    System.out.println(firstReverse("b")); 
  }

}