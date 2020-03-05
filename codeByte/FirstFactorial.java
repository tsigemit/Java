import java.util.*; 
import java.io.*;

class FirstFactorial {

  public static int firstFactorial(int num) {
    int sum =num;
    for (int i =num-1; i > 0; i--) {
    	 sum=sum*i;
    }
    return sum;
  }
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.println(firstFactorial(5)); 
    System.out.println(firstFactorial(8)); 
  }

}