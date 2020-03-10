import java.util.*;
class Test
{
 public static void main(String[] a)
 {
  List<Integer> aob;
  aob = new ArrayList<>();
  aob.add(22);
  aob.add(11);
  aob.add(44);
  aob.add(22);
  aob.add(33);
  aob.add(55);
  
  List<Integer> vob;
  vob = new Vector<>();
  vob.addAll(aob);
  
  Set<Integer> hob;
  hob = new HashSet<>();
  hob.addAll(aob);

  Set<Integer> tob;
  tob = new TreeSet<>();
  tob.addAll(aob);
  HashSet<Integer> hash_set=new LinkedHashSet<>();
  hash_set.addAll(aob);

  System.out.println("ARR-LIST:"+aob);
  System.out.println("VECTOR  :"+vob);
  System.out.println("HASHSET :"+hob); //can not access using get method
  System.out.println("TREESET :"+tob); //can not access using get method
  System.out.println("LinkedHashSet :"+hash_set); //can not access using get method
  System.out.println("ARR-LIST:"+aob.get(0));
  System.out.println("VECTOR  :"+vob.get(0));

  Iterator<Integer> itTree = tob.iterator();
  System.out.println("TREESET VALUES:");
  while(itTree.hasNext())
    System.out.print(" " + itTree.next());
  System.out.println();
  Iterator<Integer> itLinked = vob.iterator();
  System.out.println("LinkedHashSet VALUES:");
  while(itLinked.hasNext())
    System.out.print(" " + itLinked.next());
  System.out.println();
  Iterator<Integer> itHaseSet = vob.iterator();
  System.out.println("HashSet VALUES:");
  while(itHaseSet.hasNext())
    System.out.print(" " + itHaseSet.next());
 }

}