package p2.p3;

public class person {

	private int age = 18;
	private String name;

	public person(String name) {
		this.name = name; 
		System.out.println(this.name);
	}
	
	public void Display() {
		System.out.println("Name = " + name + " Age = " + age); 
	}
	
	public static void main(String[] args) {
		person person = new person("Shivani Shitole");
		person.Display();
	}
}
