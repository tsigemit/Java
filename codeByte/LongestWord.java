import java.util.*; 
import java.io.*;

class LongestWord {
  public static String longestWord(String sen) {
    String splited[] = sen.split("[^A-Za-z0-9]");
    String answer = "";
    int len = 0;
    for (String s: splited) {
    	if(s.length()>len)
    	{
    		answer=s;
    	    len=s.length();
    	}

    }
    return answer;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.println(longestWord("fun&!! time")); 
    System.out.println(longestWord("I love dogs")); 
    System.out.println(longestWord("a confusing /:sentence:/[ this is not!!!!!!!~")); 
  }

}