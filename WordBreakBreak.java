import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakBreak {

	public static void main(String... args) {
		Set<String> dict = new HashSet<String>();
		dict.add("cat");
		dict.add("cats");
		dict.add("and");
		dict.add("sand");
		dict.add("dog");

		String s = "catsanddog";
		ArrayList<String> list = new ArrayList<String>();

		WordBreakBreak break1 = new WordBreakBreak();
		list = (ArrayList<String>) fetchWords(list, s, dict);
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < list.size(); i++) {
			if (i != 0 && s.startsWith(list.get(i))) {
				sb.append(",");
			}
			sb.append(list.get(i) + " ");
		}
		String[] finalRes = sb.toString().split(",");
		List<String> result = new ArrayList<String>();
		for (String vals : finalRes) {
			result.add(vals.trim());
		}

		

	}

	public List<String> fetchWords(List<String> list, String s, Set<String> dict) {

		for (int i = 1; i <= s.length(); i++) {
			String temp = s.substring(0, i);
			if (dict.contains(temp)) {
				list.add(temp);
				String temp2 = s.substring(i);
				fetchWords(list, temp2, dict);
			}
		}
		return list;
	}
}
