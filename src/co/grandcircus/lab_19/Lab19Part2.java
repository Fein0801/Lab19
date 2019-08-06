package co.grandcircus.lab_19;

import java.util.Arrays;
import java.util.HashMap;

public class Lab19Part2 {

    public static void main(String[] args) {
	int[] nums = { 0, 2, 5, 6, 8, 9, 10, 1, 1, 5, 6, 8, 7, 3 };
	Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));

	int[] frequency = getFrequency(nums);

	for (int i = 0; i < frequency.length; i++) {
	    if (frequency[i] != 0) {
		System.out.println("[" + i + "]: " + frequency[i]);
	    }
	}
    }

    // I estimate this method may be time complexity O(n) because it only uses one
    // for-each loop
    public static int[] getFrequency(int[] nums) {
	int[] frequency = new int[11];

	HashMap<Integer, Integer> frequencyMap = new HashMap<>();
	for (int num : nums) {
	    frequencyMap.put(num, ++frequency[num]);
	}

	return frequency;
    }

}
