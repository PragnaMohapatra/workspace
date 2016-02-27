import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ParanthesisMissMatch_strInput {

	public static void main(String[] args) {
		ParanthesisMissMatch_strInput input = new ParanthesisMissMatch_strInput();
		System.out.println(input.isValid("((((((()))))))"));

	}

	public boolean isValid(String s) {

		if (s == null) {
			return false;
		}

		if (s.length() % 2 != 0) {
			return false;
		}
		boolean valid = true;
		Map<Character, Character> dict = new HashMap<Character, Character>();
		java.util.Stack<Character> stack = new java.util.Stack<Character>();
		Queue<Character> queue = new LinkedList<Character>();
		dict.put('{', '}');
		dict.put('[', ']');
		dict.put('(', ')');
		boolean flip = false;
		for (int i = 0; i < s.length(); i++) {
			if (dict.get(s.charAt(i)) != null && flip) {
				while (!stack.isEmpty()) {
					if (dict.get(stack.pop()) != queue.poll()) {
						valid = false;
						return valid;
					}
				}
				stack.add(s.charAt(i));
				flip = false;
			}
			else if (dict.get(s.charAt(i)) != null) {
				stack.add(s.charAt(i));
				flip = false;
			} else {
				queue.add(s.charAt(i));
				flip = true;
			}

		}
		while (!stack.isEmpty()) {
			if (dict.get(stack.pop()) != queue.poll()) {
				valid = false;
				return valid;
			}
		}
		
		return valid;

	}

}
