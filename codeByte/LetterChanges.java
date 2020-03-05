import java.util.*; 
import java.io.*;

class LetterChanges {

  public static String letterChanges(String str) {
  	StringBuffer sb = new StringBuffer();
  	String vowels = "aeiou";
    for(int i=0; i<str.length(); i++){
    	char ch = str.charAt(i);
    	
    	if(Character.isLetter(ch))
    	{
    	if(ch=='z')
    	  sb.append('A');
    	ch++;
    	if(vowels.contains(Character.toString(ch)))
    		sb.append(Character.toUpperCase(ch));
    	else
    		sb.append(ch);
    }
    else
    	sb.append(ch);
}
    return sb.toString();
  }

  public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
    System.out.println(letterChanges("hello*3")); 
    System.out.println(letterChanges("fun times!")); 
  }

}