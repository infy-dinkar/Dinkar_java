package DSA_PROBLEMS;

import java.util.HashSet;

public class IntersectionOfTwoArraysLeetcode349 {
    class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> resultSet = new HashSet<>();
        int[] arr = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            hs.add(nums1[i]);
        }

        for (int j = 0; j < nums2.length; j++) {
            if (hs.contains(nums2[j])) {
                resultSet.add(nums2[j]);
            }
        }

        int index = 0;
        for (int num : resultSet) {
            arr[index++] = num;
        }

        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }

        return result;
    }
}

    
}
