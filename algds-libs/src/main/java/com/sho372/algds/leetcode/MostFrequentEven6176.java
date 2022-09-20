package com.sho372.algds.leetcode;

import java.util.*;

public class MostFrequentEven6176 {

    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int n: nums) {
            if(n%2 == 0) {
                if(!hm.containsKey(n)){
                    hm.put(n, 1);
                } else {
                    hm.put(n, hm.get(n)+1);
                }
            }
        }

        // 0:1, 2:2, 4:2
        Set<Integer> keys = hm.keySet();
        int max = -1;
        for (int k:keys) {
            if(hm.get(k) > max) {
                max = hm.get(k);
            }
        }

        ArrayList<Integer> al = new ArrayList<>();
        for (int k:keys) {
            if(hm.get(k) == max) {
                al.add(k);
            }
        }
        return al.size() != 0 ? Collections.min(al) : -1;
    }


    public static void main(String[] args) {

        MostFrequentEven6176 mf = new MostFrequentEven6176();

        //int ans = mf.mostFrequentEven(new int[]{0,1,2,2,4,4,1});
        int ans = mf.mostFrequentEven(new int[]{29,47,21,41,13,37,25,7});
        System.out.println(ans);
    }



}
