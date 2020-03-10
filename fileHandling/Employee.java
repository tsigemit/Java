public class Employee implements java.io.Serializable {
   public transient String name;
   public  transient String address;
   public transient int SSN;
   public  transient int number;
   
   public void mailCheck() {
      System.out.println("Mailing a check to " + name + " " + address);
   }
}