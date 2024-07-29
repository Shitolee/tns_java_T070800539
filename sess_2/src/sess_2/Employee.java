package sess_2;

public class Employee {
	private int empId;
	private String empName;
	private float empSalary;
	
	public Employee() {
		System.out.println("Default constructor invoked");
		empId = 111;
		empName= "Shivani Shitole";
		empSalary = 50722.74f;
	}
	
	public Employee(int empId, String empName, float empSalary)
	{
		System.out.println("Parameterized constructor invoked");
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	public String toString()
	{
		return "Employee =" + empId + " " + empName + " " + empSalary ;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e);
		
		Employee e1 = new Employee(222, "Shraddha", 67848.63f);
		System.out.println(e1);
	}

}
