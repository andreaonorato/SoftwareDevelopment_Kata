package main.java;

public class String_Calculator {
	
	public static int calculate(String input) {
		String[] numbers;
		if (input.charAt(0) == '/') {
			String delimiter = String.valueOf(input.charAt(2));
			String newinput = input.substring(4);
			numbers = newinput.split(delimiter);
			
		}
		else {
			numbers = input.split("[,\n]"); 
			}
		
		int result = 0;
		for (String numStr: numbers) {
			try {
				int num = Integer.parseInt(numStr);
				if (num < 0) {
	                throw new RuntimeException("Negative number found: " + numStr);
	            }
				result += num;
			} catch (NumberFormatException e) {
				System.err.println("Invalid input format: " + numStr);
			}
		}
		return result;
	}
}