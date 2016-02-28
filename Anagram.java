import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(anagramTest("hello", "pulli"));

	}
	
	public static boolean anagramTest(String input1, String input2){
		
		if(input1==null || input2==null || (input1.length()!=input2.length())){
			return false;
		}
		
		char[] inputArr1 = input1.toCharArray();
		char[] inputArr2 = input2.toCharArray();
				
	    Arrays.sort(inputArr1);
		Arrays.sort(inputArr2);
		
		String sorted1 = String.valueOf(inputArr1);
		String sorted2 = String.valueOf(inputArr2);
		
		return sorted1.equalsIgnoreCase(sorted2);
	}

}
