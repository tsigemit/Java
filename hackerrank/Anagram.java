import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    static boolean isAnagram(String a, String b) {
       if(a.length()!=b.length())
            return false;
        a=a.replace(" ", "").toUpperCase();
        b=b.replace(" ", "").toUpperCase();
        char [] char_a=a.toCharArray();
        char [] char_b=b.toCharArray();
        Arrays.sort(char_a);
        Arrays.sort(char_b);
        if(Arrays.equals(char_a,char_b))
            return true;
    return false;
    }
 static int countA(int a){
    for(int i=0; i<10; i++){
        a++;
    }
    return a;
 }
  public static void main(String[] args) {
    
        //Scanner scan = new Scanner(System.in);
        //String a = scan.next();
        //String b = scan.next();
        //scan.close();
        String a="CAT";
        String b="TCA";
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        System.out.println(countA(3));
        int arr1[] ={2,1,3};
        int arr2[] ={1,3,2};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
