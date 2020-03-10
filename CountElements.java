import java.util.*;

public class CountElements{

public static Map<Integer,Integer> countElements(int arr[]){
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();

    for(int i: arr){
    	if(map.containsKey(i))
    	{
    		//int temp = map.get(i);
    	    //temp++;
    	    map.put(i,map.get(i)+1);
    	}
    	else
    	map.put(i,1);
    }

return map;
	}
	public static void main(String[] args) {
		int arr [] = {1, 2, 3,1,2,5,4,0,1};
		System.out.println(countElements(arr));
	}
}