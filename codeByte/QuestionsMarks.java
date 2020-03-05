import java.util.*; 
import java.io.*;

class QuestionsMarks {

  public static String questionsMarks(String str) {
  	int firstNumber=0;
  	int secondNumber=0;
  	int count=0;
  	int checker=0;
  	int minIndex=0;
  	int maxIndex=0;
    String ans="false";
    for (int i = 0; i < str.length(); i++){
    	if (Character.isDigit(str.charAt(i)) && checker==0){
    		firstNumber=Character.getNumericValue(str.charAt(i));
    		minIndex=i;
    		checker++;
    	}
    	else if (Character.isDigit(str.charAt(i)) && checker!=0){
    		secondNumber=Character.getNumericValue(str.charAt(i));
    		 maxIndex=i;
    	}
    if(Character.isDigit(str.charAt(i)) && firstNumber+secondNumber==10){
    	//count=0;
         for (int j=minIndex+1; j<maxIndex; j++){
         	if(str.charAt(j)=='?')
      		   count++;
           }
           firstNumber=secondNumber;
           minIndex=maxIndex;
          if(count==3)
            	ans="true";
          else
          {
          ans="false";
          break;
          } 
          count=0;   
          
       }  
  }
  return ans;
  }


  public static void main (String[] args) {  
    // keep this function call here     
    //Scanner s = new Scanner(System.in);
    System.out.println(questionsMarks("acc?7??sss?3rr1??????5")); 
    System.out.println(questionsMarks("aa6?9")); 
    System.out.println(questionsMarks("9???1???9???1???9")); 
    System.out.println(questionsMarks("9???1???9??1???9")); 
  }

}