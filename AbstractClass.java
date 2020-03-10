abstract class ParentAbstractClass{
	//abstract  void abstractFunction();
}
public class AbstractClass extends ParentAbstractClass{
	void abstractFunction1(){
		System.out.println("This is abstract function");
	}
	
 public static void main(String[] args) {
 	AbstractClass abj= new AbstractClass();
 	abj.abstractFunction1();
 }
}