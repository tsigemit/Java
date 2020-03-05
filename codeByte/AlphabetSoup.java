import java.util.*; 
import java.io.*;

class AlphabetSoup {

  public static String alphabetSoup(String str) {
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    return new String(chars);
  }

  public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
    System.out.println(alphabetSoup("coderbyte")); 
    System.out.println(alphabetSoup("hooplah")); 
  }

}