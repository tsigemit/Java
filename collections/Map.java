import java.util.*;
class Map
{
 public static void main(String[] a)
 {
  Map <Integer, String> m = new HashMap<Integer, String>();
  m.put(1001,"Ajay");
  m.put(1005,"Ayaan");
  m.put(1003,"Bob");
  m.put(1004,"Peter");
  m.put(1002,"Tony");
  
 Set<Map,Entry> s = m.entrySet();
 for(Map.Entry e : s){
  System.out.print("K : "+e.getKey());
  System.out.print("V : "+e.getValue());
  System.out.println("------------");
 }
}
}