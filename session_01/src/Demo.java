
public class Demo {
  
	private int dd,mm,yy;
	public void initDate()
   {
		dd=mm=yy=1;
	}
	public void setDate(int d,int m,int y) {
		dd=d;
		mm=m;
		yy=y;
	}public void displayDate() {
		System.out.println("Date = ["+dd+"/"+mm+"/"+yy+"]");
	}
	public static void main(String[]args) {
		Demo d=new Demo();
		System.out.println("d = "+d.dd);
		d.initDate();
		d.setDate(3, 07, 2024);
		d.displayDate();
	}
}
 