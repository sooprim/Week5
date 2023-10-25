import java.util.Scanner;
public class Exercise4{
	public static void main(String[] ars)
	{
		Scanner integer = new Scanner(System.in);
		System.out.println("Enter Integer:");
		int i = integer.nextInt();
		if(i < 1)
		{
			System.out.println("Enter a value above 1!");
		}
		System.out.println("Decimal: " + i);
		System.out.println("Binary: " + Integer.toBinaryString(i));
		System.out.println("Octal: " + Integer.toOctalString(i));
		System.out.println("Hexadecimal: " + Integer.toHexString(i));
		integer.close();
	}
}
