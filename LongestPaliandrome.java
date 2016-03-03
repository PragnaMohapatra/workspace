
public class LongestPaliandrome {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("caba"));
	}

	public static String longestPalindrome(String s) {
		if (s == null) {
			return s;
		}
		if (s.length() == 1 || s.length()==2) {
			return s;
		}
		String palliandrome = new String();
		char[] arr = s.toCharArray();
		int firstIndex = 0;
		int lastIndex = 0;
		boolean flag = false;
		for (int i = 1; i < s.length() - 1; i++) {
			int forward = i + 1;
			int backward = i - 1;
			while (forward < arr.length && backward >= 0 && arr[forward] == arr[backward]) {
				forward = forward + 1;
				backward = backward - 1;
				flag = true;
			}
			if (flag) {
				firstIndex = backward + 1;
				lastIndex = forward;
				if (lastIndex > s.length()) {
					lastIndex = forward - 1;
				}
				break;
			}
		}
		palliandrome = s.substring(firstIndex, lastIndex);
		return palliandrome;
	}
}
