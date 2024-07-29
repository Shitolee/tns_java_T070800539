package sess_1;

public class Demo2 {
private int day, month, year;
	
	public void setDay(int d) {
		day = d;
	}
	 public int getDay() {
		 return day;
	 }
	 
	 public static void main(String[] args) {
		 Demo2 d = new Demo2();
		 d.setDay(4);
		 int day = d.getDay();
		 System.out.println("Date = " + day);
		 System.out.println("Date = " + d.getDay());
	 }
}

