// Java program to demonstrate working of ArrayList in Java 
import java.io.*; 
import java.util.*; 

class ArrayListExample extends ArrayList<Integer> { 
	public static void main(String[] args) 
					throws IOException 
	{ 
		// size of ArrayList 
		//declaring ArrayList with initial size n 
		ArrayList<Integer> arrli = new ArrayList<Integer>(); 

		// Appending the new element at the end of the list 
		for (int i=1; i<=5; i++) 
			arrli.add(i); 
        arrli.set(2, 20); // replace value at index 2 with 20
        arrli.add(3, 35); // add element at index 3
        System.out.println(arrli.indexOf(2)); // prints index of 2
        arrli.add(3);
        System.out.println(arrli.lastIndexOf(3)); // the lastIndexOf 3 is returned
		// Printing elements 
		System.out.println(arrli); 

		// Remove element at index 3 
		arrli.remove(3); 

		// Displaying ArrayList after deletion 
		System.out.println(arrli); 

		// Printing elements one by one 
		arrli.forEach((n)-> System.out.print(n+" "));
		System.out.println();
		// Creating an empty array list 
		ArrayList<String> bags = new ArrayList<String>(); 

		// Add values in the bags list. 
		bags.add("pen"); 
		bags.add("pencil"); 
		bags.add("paper"); 

		// Creating another array list 
		ArrayList<String> boxes = new ArrayList<String>(); 

		// Add values in the boxes list. 
		boxes.add("pen"); 
		boxes.add("paper"); 
		boxes.add("books"); 
		boxes.add("rubber"); 

		// Before Applying method print both lists 
		System.out.println("Bags Contains :" + bags); 
		System.out.println("Boxes Contains :" + boxes); 

		// Apply retainAll() method to boxes passing bags as parameter 
		boxes.retainAll(bags); 

		// Displaying both the lists after operation 
		System.out.println("\nAfter Applying retainAll()"+" method to Boxes\n"); 
		System.out.println("Bags Contains :" + bags); 
		System.out.println("Boxes Contains :" + boxes); 
		// create an ArrayList which going to 
        // contains a list of Numbers 
        ArrayList<Integer> Numbers = new ArrayList<Integer>(); 
  
        // Add Number to list 
        Numbers.add(23); 
        Numbers.add(32); 
        Numbers.add(45); 
        Numbers.add(63); 
  
        // apply removeIf() method 
        // we are going to remove numbers divisible by 3 
        Numbers.removeIf(n -> (n % 3 == 0)); 
        // print list 
        for (int i : Numbers)  
            System.out.println("After removing using removeIf"+i); 
        //use contains() to check if the element exists or not
            System.out.println(Numbers.contains(23)); // true

            // Creating object of ArrayList<String> 
            ArrayList<String> arrlist = new ArrayList<String>(); 
            // Populating arrlist1 
            arrlist.add("A"); 
            arrlist.add("B"); 
            arrlist.add("C"); 
            arrlist.add("D"); 
            arrlist.add("E"); 
            // print arrlist 
            System.out.println("Original arrlist: "+ arrlist);   
            // getting the subList using subList() method 
            List<String> arrlist2 = arrlist.subList(2, 4); 
            // print the subList 
            System.out.println("Sublist of arrlist: "+ arrlist2);
         // Java program to demonstrate 
// removeAll() method for Integer value 
			// Creating object of ArrayList<Integer> 
			ArrayList<Integer> arrlist1 = new ArrayList<Integer>(); 

			// Populating arrlist1 
			arrlist1.add(1); 
			arrlist1.add(2); 
			arrlist1.add(3); 
			arrlist1.add(4); 
			arrlist1.add(5); 

			// print arrlist1 
			System.out.println("ArrayList before removeAll() operation : "+ arrlist1); 

			// Creating another object of ArrayList<Integer> 
			ArrayList<Integer> arrlist22 = new ArrayList<Integer>(); 
			arrlist22.add(1); 
			arrlist22.add(2); 
			arrlist22.add(3); 

			// print arrlist2 
			System.out.println("Collection Elements to be removed : "+ arrlist22); 

			// Removing elements from arrlist1 specified in arrlist2 
			// using removeAll() method 
			arrlist1.removeAll(arrlist22); 
			// print arrlist1 
			System.out.println("ArrayList after "+ "removeAll() operation : "+ arrlist1); 


          ArrayListExample arr = new ArrayListExample();

		// use add() method to add values in the list 
		arr.add(1); 
		arr.add(2); 
		arr.add(3); 
		arr.add(12); 
		arr.add(9); 
		arr.add(13); 

		// prints the list before removing 
		System.out.println("The list before using removeRange:" + arr); 

		// removing range of 1st 2 elements 
		arr.removeRange(0, 2); 
		System.out.println("The list after using removeRange:" + arr); 
		arrlist1.addAll(arrlist22);
		System.out.println("Value of arrlist1 after using addAll()" + arrlist1);
        } 
	} 
