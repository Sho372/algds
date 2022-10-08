package com.sho372.algds.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LongestSubarray6189 {

    public int longestSubarray(int[] nums) {

        int max = Arrays.stream(nums).max().getAsInt();
        int maxLen = 0;
        int len = 0;

        for (int n:nums) {
            if(n != max) {
                max = 0;
                continue;
            }

            len++;
            if(len > maxLen) {
                maxLen = len;
            }
        }
        return maxLen;
    }

}
