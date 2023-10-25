public class Exercise3{
	public static void main(String[] ars)
	{
		Scanner name = new Scanner(System.in);
		Scanner year = new Scanner(System.in);
		Scanner height = new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String n = name.nextLine();
		
		System.out.println("Enter Year:");
		int y = year.nextInt();
		
		System.out.println("Enter Height");
		double h = height.nextDouble();
		
		System.out.println("Name: " + n);
		System.out.println("Year: " + y);
		System.out.println("Height: " + h);

    name.close();
    year.close();
    height.close();
	}
}
