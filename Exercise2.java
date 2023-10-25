package week5;
import java.util.Scanner;
import java.lang.Math;

public class Week5 {
	public static void main(String[] ars) {
		Scanner d = new Scanner(System.in);
		System.out.println("Enter Decimal: ");
		double decimal = d.nextDouble(); 
		
		System.out.println(Math.sin(decimal));
		System.out.println(Math.cos(decimal));
		System.out.println(Math.tan(decimal));
		System.out.println(1.0 / Math.tan(decimal));
		
		System.out.println(Math.sqrt(decimal));
		System.out.println(Math.pow(decimal, 2));
		System.out.println(Math.pow(decimal, 3));
		
		System.out.println(Math.PI * decimal * decimal);		
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}
}
