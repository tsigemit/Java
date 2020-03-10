// Java code illustrating add() method 
import java.util.*; 
class VectorExample { 
	public static void main(String[] arg) 
	{ 
		// create default vector 
		Vector v = new Vector(); 
		v.add(1); 
		v.add(2); 
		v.add("geeks"); 
		v.add("forGeeks"); 
		v.add(3); 
		System.out.println("Vector is " + v); 
		v.add(0, 1); 
        v.add(1, 2); 
        v.add(4, 3); 
        System.out.println("Vector is " + v);

        ArrayList arr = new ArrayList(); 
        arr.add(3); 
        arr.add("Tsigabu"); 
        arr.add("Mebrahtu"); 
        arr.add(4);
        // copying all element of array list int0 vector 
        v.addAll(arr); 
  
        // checking vector v 
        System.out.println("vector v:" + v); 
}
}