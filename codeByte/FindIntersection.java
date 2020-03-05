import java.util.*; 
import java.io.*;

class FindIntersection {

  public static String findIntersection(String[] strArr) {
    String str1[]=strArr[0].replace(" ", "").split(",");
    String str2[]=strArr[1].replace(" ", "").split(",");
    String str3="";
    for (int i=0; i<str1.length; i++) {
    	for (int j= 0; j<str2.length; j++){
    		if (str1[i].equals(str2[j]))
    			str3+=str1[i]+",";
    	}
    }
    if(str3.length()==0){
    	return "false";
    }
   String result=(str3.substring(0,str3.length()-1)).replaceAll(" ", "");
   String str4="1,3,5,10";
   return result;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
   System.out.println(findIntersection(new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"})); 
    System.out.println(findIntersection(new String[] {"2, 3, 4", "3"})); 
    System.out.println(findIntersection(new String[] {"1, 5, 6, 7, 10, 11, 12", "5, 6, 8, 11, 17"})); 
    System.out.println(findIntersection(new String[] {"1, 2, 3, 4, 5", "6, 7, 8, 9, 10"})); 
    System.out.println(findIntersection(new String[] {"1, 2, 4, 5, 6, 9", "2, 3, 4, 8, 10"})); 
    System.out.println(findIntersection(new String[] {"21, 22, 23, 25, 27, 28", "21, 24, 25, 29"})); 
  }

}