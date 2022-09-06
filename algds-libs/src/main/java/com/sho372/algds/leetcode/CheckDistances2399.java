package com.sho372.algds.leetcode;

import java.util.HashMap;

public class CheckDistances2399 {

    /*
    https://leetcode.com/contest/weekly-contest-309/problems/check-distances-between-same-letters/
     */

    public boolean checkDistance(String s, int[] distance) {

        char[] chs = s.toCharArray();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < chs.length; i++) {
            int ci = chs[i] - 'a';
            if(map.containsKey(ci)) {
                int prev = map.get(ci);
                if(distance[ci] != i - prev - 1) {
                   return false;
                }
            } else {
                map.put(ci, i);
            }
        }
        return true;
    }

    public static void main(String[] args) {

        CheckDistances2399 cd = new CheckDistances2399();
//        boolean ans = cd.checkDistance("abaccb", new int[]{1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
        boolean ans = cd.checkDistance("aa", new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
        System.out.println(ans);
    }

}
