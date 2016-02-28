import java.util.HashMap;
import java.util.Map;

public class ParathesisMatch_CharInput {

	public static void main(String[] args) {
	   ParathesisMatch_CharInput match = new ParathesisMatch_CharInput();
	   System.out.println(match.isValid("'(',')'"));

	}

	public boolean isValid(String s) {
		
		if(s==null){
			return false;
		}
		String[] inComingReq = s.split(",");
		if(inComingReq.length%2!=0){
			return false;
		}
		boolean valid = true;
		Map<Character, Character> dict = new HashMap<Character, Character>();
		dict.put('{', '}');
		dict.put('[', ']');
		dict.put('(', ')');

		
		for (int i = 0; i < inComingReq.length; i++) {

			if (inComingReq[i + 1].charAt(1) == dict.get(inComingReq[i].charAt(1))) {
				i=i+2;
			} else {
				System.out.println("miss match found");
				valid = false;
				return valid;
			}
		}
		return valid;

	}

}
