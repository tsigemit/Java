import java.util.*; 
import java.io.*;

class LongestWord {
  public static String longestWord(String sen) {
    String splited[] = sen.split("[^A-Za-z0-9]");
    String answer = "";
    int len = 0;
    for (int i = 0; i < splited.length; i++){
    	if(splited[i].length()>len)
    	{
    		answer=splited[i];
    	    len=splited[i].length();
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