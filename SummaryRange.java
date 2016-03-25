import java.util.ArrayList;
import java.util.List;

public class SummaryRange {

	public static void main(String[] args) {
		int[] nums = new int[] {-2147483648,-2147483647,2147483647};
		summaryRanges(nums);
	}

	public static List<String> summaryRanges(int[] nums) {
		if(nums==null|| nums.length==0){
			return new ArrayList<String>();
		}
		String r = new String();
		List<String> resultArr = new ArrayList<String>();
		int count = 0;
		int l = nums.length;
		r = r + nums[0];
		if (nums.length != 1) {
			while (count < l) {
				count++;
				if (count < l && Math.abs(nums[count] - nums[count - 1])>1) {
					r = r + "," + nums[count];
				} else if (count < l) {
					r = r + "~"+nums[count];
				}
			}

			String[] result = r.split(",");
			for (String str : result) {
				StringBuffer sb = new StringBuffer();
				String[] temp =str.split("~");
				if (temp.length != 1) {
					
					sb.append(temp[0] + "->"
							+ temp[temp.length-1]);
					resultArr.add(sb.toString());
				} else {
					sb.append(str);
					resultArr.add(str);
				}
			}
			return resultArr;
		} else {
			resultArr.add("" + nums[0]);
			return resultArr;
		}
	}

}
