import java.util.HashMap;
import java.util.Map;

public class Anagram_Alt {

	public static void main(String[] args) {
	System.out.println(validateAnagram("Mango", "tango"));
	}
	
	public static boolean validateAnagram(String input, String compare){
		if(input==null || compare==null || (input.length()!=compare.length())){
			return false;
		}
		
		HashMap map1 = calculateCharacters(input);
		HashMap map2 = calculateCharacters(compare);
		
		for(Object key: map1.keySet()){
			Integer count1 = (Integer) map1.get((Character)key);
			Integer count2 = (Integer) map2.get((Character)key);
			if(count1!=count2){
				return false;
			}
		}
		
		return true;
		
	}
	
	public static HashMap calculateCharacters (String input){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<input.length();i++){
			if(map.get(input.charAt(i))==null){
				map.put(input.charAt(i), 1);
			}else{
				map.put(input.charAt(i),map.get(input.charAt(i))+1);
			}
		}
		return map;
	}
}
