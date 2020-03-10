import java.util.*;  
class SetExample{  
 public static void main(String args[]){  
  TreeSet<String> set=new TreeSet<String>();  
         set.add("A");  
         set.add("B");  
         set.add("C");  
         set.add("D");  
         set.add("E");  
           
         System.out.println("Intial Set: "+set);  
           
         System.out.println("Head Set: "+set.headSet("C"));  
          
         System.out.println("SubSet: "+set.subSet("A", "E"));  
           
         System.out.println("TailSet: "+set.tailSet("C"));  
   TreeSet<Integer> intSet = new TreeSet<Integer>(Arrays.asList(5,1,3,2,1,5,6,8,3));
   Iterator<Integer> it = intSet.iterator();
   while(it.hasNext()){
      if (it.next()%2==0)
      System.out.print(it.next()+" ");
      }
   System.out.println();
 }  
}  