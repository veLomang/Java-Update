package methods_and_instances;

public class tuna {
	private String girlName; //Public = any class can use it / Private = only methods in the class can use it.
	public void setName(String name) {
		girlName = name;
	}
	
	public String getName() { //Return type = String; this method will return a string. If returning nothing, use 'void
		return girlName;
	}
	
	public void saying() {
		System.out.printf("Your first gf was %s", getName());
		//'printf' takes arguments, such as, "%s, getName"
	}
}
