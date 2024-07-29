package sess8;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		String str = "JSPM";
		System.out.println(str);
		//System.out.println(str.concat(" Wagholi"));
		//str.concat(" Wagholi");
		str = str.concat(" Wagholi");
		System.out.println(str);
		
		System.out.println(str.length());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character = ");
		char ch = sc.next().charAt(0);
		System.out.println("ch = " + ch);
		
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(4));
		
	}

}