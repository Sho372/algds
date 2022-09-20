package com.sho372.algds.leetcode;

import java.util.HashMap;

public class PartitionString6177 {

    public int partitionString(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();
        char[] chs = s.toCharArray();

        int cnt = 1;
        for (char c:chs) {
            if(hm.containsKey(c)) {
                cnt++;
                hm.clear();
                hm.put(c, 1);
            } else {
                hm.put(c, 1);
            }
        }
        return cnt;

    }

    public static void main(String[] args) {
        String s = "ssssss";
        PartitionString6177 ps = new PartitionString6177();
        System.out.println(ps.partitionString(s));
    }


}
