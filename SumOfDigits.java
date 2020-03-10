import java.util.ArrayList;
public class SumOfDigits{
	public static int sumOfDigits(int num){
     int sum = 0;
     while(num > 0){
     	sum += num%10;
     	num /= 10;
     }
    return sum;
	}
public static void main(String[] args) {
	System.out.println(sumOfDigits(823));
	ArrayList arrayList = new ArrayList<>();
	arrayList.add(1);
	arrayList.add("Examples");
	arrayList.add(true);
	System.out.println(classarrayList);
}
}