import java.util.Stack;
import java.util.TreeMap;

public class RemoveDuplicate {
	public static void main(String... args) {
		char[] input = new char[] { 'c', 'b', 'a', 'c', 'd', 'c','b','c' };
		TreeMap resp = createCharMap(input);
		String result = removeDuplicate(resp, input);
		System.out.println(result);
	}

	public static TreeMap createCharMap(char[] input) {
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		for (int i = 0; i < input.length; i++) {
			if (map.get((Character) input[i]) == null) {
				map.put(input[i], 1);
			} else {
				map.put(input[i], map.get((Character) input[i]) + 1);
			}
		}
		return map;
	}

	public static String removeDuplicate(TreeMap<Character, Integer> map,
			char[] input) {
		Stack<Character> stk = new Stack<Character>();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < input.length; i++) {
			char cc = input[i];
			if (map.get(input[i]) == null) {
				continue;
			}
			if (cc > map.firstKey() && map.get(cc) > 1) {
				if (!stk.contains(cc)) {
					stk.push(cc);
				}
				map.put(cc, map.get(cc) - 1);
			} else if (cc > map.firstKey() && map.get(cc) == 1) {
				if (!stk.isEmpty()&&cc > stk.peek()) {
					if (!stk.isEmpty()) {
						map.remove(stk.peek());
						if (map.get(stk.peek()) != null) {
							sb.append(stk.pop());
						} else {
							stk.pop();
						}

					}
					sb.append(cc);
				} else {
					sb.append(cc);
					map.remove(cc);
				}

			} else if (cc == map.firstKey()) {
				sb.append(cc);
				map.remove(cc);
			}
		}
		return sb.toString();
	}
}
