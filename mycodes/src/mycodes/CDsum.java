package mycodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CDsum {
	 public static int[] twoSum(int[] numbers, int target)
	    {
		 Map<Integer, Integer> numMap = new HashMap<>();
	        for (int i = 0; i < numbers.length; i++) {
	            int complement = target - numbers[i];
	            if (numMap.containsKey(complement)) {
	                return new int[] { numMap.get(complement), i };
	            } else {
	                numMap.put(numbers[i], i);
	            }
	        }
	        return new int[] {};
	    }
	public static void main(String[] args) {
		int [] monTableau = {1,2,3};
		int c = 4;
		int [] res = twoSum(monTableau, c);
		System.out.println(Arrays.toString(res));
	}

}
