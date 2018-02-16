
public class Greeter {
	private String name;
	private int age;
	
	public Greeter() {
		name = "Alena";
		age = 18;
	}
	
	public Greeter(String xName, int xAge) {
		name = xName;
		age = xAge;
	}
	
	public String toString() {
		return "Greeter:" +name +age;
	}
}
