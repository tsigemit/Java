import java.util.Arrays;
public class FindSmallestGreaterThanZero {
    public static int FindSmallestGreaterThanZero(int A[]){
        Arrays.sort(A);
        int intialValue =1;
        for (int i = 0; i < A.length; i++){
            if(A[i]>0)
            {
                if(A[i]==intialValue)
                    intialValue++;
            }

        }
return intialValue;
    }
    public static void main(String[] args) {
        System.out.println(FindSmallestGreaterThanZero(new int[] {1, 3, 6, 4, 1, 2}));
        System.out.println(FindSmallestGreaterThanZero(new int[] {-1, -3}));
    }
}
