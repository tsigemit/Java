import java.util.*;
public class MinMax{
	public static void main(String[] args) {
		int arr[] ={2,7,12,7,98,23};
		int max1=Math.max(arr[0],arr[1]);
		int max2=Math.min(arr[0],arr[1]);
		for(int i=2;i<arr.length;i++){
			if(arr[i]>max1)
			{
				max2=max1;
				max1=arr[i];
			}
		  else if(arr[i]>max2 && arr[i]<max1)
				 max2=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(max1+" "+max2);
	}
}