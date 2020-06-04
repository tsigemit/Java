public class digitSeparator{
 public static int solution(int N){
 	int count=0;
 	for (int i = 0; i <= N; i++) {
 		int num =i;
       while(num>0)
       {
 		if(num%10==1){
 			//System.out.println(num);
 			count++;
 		}
 		num/=10;     
 	}
 }
 return count;
 }
public static void main(String[] args) {
System.out.println(solution(13));
System.out.println(solution(14));
}
}