public class SuperClass{
	private String  firstName;
	private String lastName;
	private int id;
	public SuperClass() {
		
	}
	 // public String getId() {
	 // 	getId2();
	 // 	return "This getId() inside the SuperClass is called";	 	
	 // }
	public String gerName() {
		return this.firstName;
	}
	public void setName(String name) {
		this.firstName=name;
	}
	 public void getId2() {
	 	System.out.println("second getId() of the SuperClass is called");
	 	
	 }
	 private class InnerClass{
    	private  String firstName;
	    private String lastName;
	    private int id;
	   InnerClass(String firstName, String lastName, int id){
			this.firstName = firstName;
			this.lastName = lastName;
			this.id = id;
			System.out.println("Private inner is called");
		}
		// public static String getName() {
	 //  	return firstName;
	 //  }
    }
   public String getName() {
	  	return this.firstName;
	  }
	  public static void main(String[] args) {
	  	
	  }
    public  void callInnerClass(){
    	InnerClass forCheck = new InnerClass("Tsigabu", "Birhanu", 201011);
	 	
	 }
}