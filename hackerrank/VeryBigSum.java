import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
       String ans="no answer";
       char letters[] =w.toCharArray();
       for (int i = 0; i < letters.length; i++){
        for (int j = i+1; j<letters.length; j++){
            if (letters[j]>letters[i])
                ans=letters[j]+w.substring(0, j)+w.substring(j+1,letters.length);
        }

       }
       return ans;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
