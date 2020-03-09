//Scored 62%
import java.util.Arrays;
public class DNASequances {
    public static int[] dNASequances(String S, int[] P, int[] Q) {
        int arr[] =new int[P.length];
        int currentValue=0;
        for (int i = 0; i <P.length; i++) {
            int minValue = Integer.MAX_VALUE;
            for (int j= P[i]; j<=Q[i]; j++) {
                if(S.charAt(j)=='A')
                    currentValue=1;
                else if(S.charAt(j)=='C')
                    currentValue=2;
                else if(S.charAt(j)=='G')
                    currentValue=3;
                else if(S.charAt(j)=='T')
                    currentValue=4;
                if(currentValue<minValue)
                    minValue=currentValue;
            }
            arr[i]=minValue;


        }
return arr;
    }
    public static void main(String[] args) {
        int P[]={2,5,0};
        int Q[]={4,5,6};
        String str="CAGCCTA";
        System.out.println(Arrays.toString(dNASequances(str, P, Q)));

    }
}
