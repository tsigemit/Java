//Scored 100%
public class CountDivisibleByK {
    public static int countDivisibleByK(int A, int B, int K){
   int count = 0;
   for (int i=B; i>=A; i--) {
       if (i % K == 0) {
           count=(i-A)/K+1;
           break;
       }
   }
   return count;
    }
    public static void main(String[] args) {
        System.out.println(countDivisibleByK(6,11,2));
        System.out.println(Integer.MAX_VALUE );
    }
}
