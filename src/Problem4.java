import java.util.HashMap;

/**
 * you have an array of integers. each integer in the array should be listed 3
 * times in the array. find the integer that does not comply to that rule
 */
public class Problem4 {
	// brute force
	// n #
	// for each new # loop through n - i #s and add up to 3
	// nlogn

	/*
	 * Non brute force = HASH MAP
	 */
	public int findRuleBreaker(int[] array) {
		HashMap<Integer, Integer> numMap = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			Integer val = numMap.get(array[i]);
			if (val != null) {
				if (val < 3) {
					numMap.put(array[i], val + 1);
				} else {
					return array[i];
				}
			} else {
				numMap.put(array[i], 1);
			}
		}
		for (int j = 0; j < array.length; j++) {
			Integer val = numMap.get(array[j]);
			if (val != 3) {
				return array[j];
			}
		}
		return -1;

	}

}
