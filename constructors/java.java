package constructors;

public class java {
	private String girlName;
	// For constructor method name must be same as class name
	public java(String name) {
		girlName = name;
	}
	
	public void setName(String name) {
		girlName = name;
	}
	public String getName() {
		return girlName;
	}
	public void saying() {
		System.out.printf("Your first gf was %s\n", getName());
	}
	
}
