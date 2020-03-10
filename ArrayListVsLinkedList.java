import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class ArrayListVsLinkedList {
  public static void main(String[] args) {
    List<Integer> linkedList = new LinkedList<>(Arrays.asList(10,20,25));
    List<Integer> arrayList = new ArrayList<>(Arrays.asList(10,20,25));
    /*Block 1: Insert at last in LinkedList*/
    long startTime = System.nanoTime();
    linkedList.add(1);
    linkedList.add(111);
    long endTime = System.nanoTime();
    long duration = endTime - startTime;
    System.out.println("LinkedList Insert at last:  " + duration);
    System.out.println(linkedList); /* Output: [1, 111]*/
    /*Block 2: Insert at last in Arraylist*/
    startTime = System.nanoTime();
    arrayList.add(1);
    arrayList.add(111);
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("ArraylistList Insert at last:  " + duration);
    System.out.println(arrayList); /* Output: [1, 111]*/
    /*Block 3: Insert at given index in LinkedList*/
    startTime = System.nanoTime();
    linkedList.add(0, 11);
    linkedList.add(1, 1111);
    linkedList.add(3, 1112);
    linkedList.add(4, 1113);
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("LinkedList Insert at pos:  " + duration);
    System.out.println(linkedList); /* Output: [1, 11, 111, 1111]*/
    /*Block 4: Insert at given index in Arraylist*/
    startTime = System.nanoTime();
    arrayList.add(0, 11);
    arrayList.add(1, 1111);
    arrayList.add(3, 1112);
    arrayList.add(4, 1113);
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("ArrayList Insert at pos:  " + duration);
    System.out.println(arrayList); /* Output: [1, 11, 111, 1111]*/
    /*Block 5: Search by value in LinkedList(searching 111 value)*/
    startTime = System.nanoTime();
    for(int i=0; i < linkedList.size(); i++) {
      if(linkedList.get(i).equals(111)){
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList search:  " + duration);
        System.out.println("Value found at index: "+i); /* Output: Value found at index: 2*/

      }
    }
    /*Block 6: Search by value in ArrayList(searching 111 value)*/
    startTime = System.nanoTime();
    for(int i=0; i < arrayList.size(); i++) {
      if(arrayList.get(i).equals(111)){
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList search:  " + duration);
        System.out.println("Value found at index: "+i); /* Output: Value found at index: 2*/
      }
    }
    /*Block 7: Get value by index in LinkedList*/
    startTime = System.nanoTime();
    Integer value = linkedList.get(2);
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("LinkedList get:  " + duration);
    System.out.println(value); /* Output: 111*/
    /*Block 8: Get value by index in ArrayList*/
    startTime = System.nanoTime();
    value = arrayList.get(2);
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("ArrayList get:  " + duration);
    System.out.println(value); /* Output: 111*/
    /*Block 9: Remove by value in LinkedList(remove 111)*/
    startTime = System.nanoTime();
    boolean isDeleted = linkedList.remove(new Integer(111));
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("LinkedList remove by value:  " + duration);
    System.out.println(isDeleted); /* Output: true*/
    /*Block 10: Remove by value in ArrayList(remove 111)*/
    startTime = System.nanoTime();
    isDeleted = arrayList.remove(new Integer(111));
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("ArrayList remove by value:  " + duration);
    System.out.println(isDeleted); /* Output: true*/
    /*Block 11: Remove by index in LinkedList*/
    startTime = System.nanoTime();
    value = linkedList.remove(2);
    System.out.println("Removed value: "+value); /* Output: Removed value: 1111*/
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("LinkedList remove by index:  " + duration);
    /*Block 12: Remove by index in ArrayList*/
    startTime = System.nanoTime();
    value = arrayList.get(2);
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("ArrayList remove by index" + duration);
    System.out.println("Removed value: "+value); /* Output: Removed value: 1111*/
    List<Integer> checkRemoveAll = new ArrayList<Integer>(Arrays.asList(2,4,7,7,2,2,1,4,3));
    System.out.println("Cheking remve operations");
    System.out.println("size of checkRemoveAll before removeAll "+checkRemoveAll.size());
    for (int i=0; i<checkRemoveAll.size()+i; i++){
        System.out.println(checkRemoveAll);
        checkRemoveAll.removeAll(Collections.singleton(checkRemoveAll.get(0)));
        System.out.println(checkRemoveAll.size());
    }

  }
}