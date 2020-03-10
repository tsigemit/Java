import java.util.Collections;
import java.util.ArrayList;
public class PowerOf2And3{
 public static Long solution(int N){
 	long product1;
 	ArrayList<Long> sequences= new ArrayList<Long>();
 	//sequences.add((long)1);
 	int k=2;
 	for (int p = 0; p <=N/k; p++) {
 		for (int q =0; q<=N/k; q++) {
        product1= (long)Math.pow(2,p) * (long)Math.pow(3,q);
        //product2= (long)Math.pow(2,q) * (long)Math.pow(3,p);
		sequences.add(product1);
        //sequences.add(product2); 
        
 }
 //k=k+1;
}
 Collections.sort(sequences);
 System.out.println(sequences);
 return sequences.get(N);
 }
public static void main(String[] args) {
System.out.println(solution(4));
}
}

