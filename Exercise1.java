package week5;

public class Exercise1{
		public static void main(String[] ars) {
		String s = "Computer";
		int length = s.length();
		
		char first = s.charAt(0);
		char middle = s.charAt(s.length() / 2);
		char last = s.charAt(s.length() - 1);
		
		System.out.println("Original: " + s);
		System.out.println("In small letters: " + s.toLowerCase());
		System.out.println("In capital letters: " + s.toUpperCase());
		System.out.println("Length: " + length);
		
		if(s.startsWith("Com")){
			System.out.println("Starts with 'Com': true");
		}
		else{
			System.out.println("Starts with 'Com': false");
		}
		
		if(s.endsWith("ion"))
		{
			System.out.println("Ends with 'ion': true");
		}
		else{
			System.out.println("Ends with 'ion': false");
		}
			System.out.println("Replace 'i' with 'o': " + s.replace("i","o"));
		//professor scrolled before i could finish :)
	}
}
