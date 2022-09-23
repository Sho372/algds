package com.sho372.algds.leetcode;

import java.util.*;

/*
https://leetcode.com/problems/most-frequent-even-element/
 */

public class MostFrequentEven2404 {

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

    public int mostFrequentEven2(int[] nums) {

        int ret = -1;
        int freq = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n:nums) {
            if(n%2!=0) continue;

            map.put(n, map.getOrDefault(n,0)+1);

            if(map.get(n) > freq||map.get(n) == freq && n < ret) {
                ret = n;
                freq = map.get(ret);
            }
        }
        return  ret;
    }

    public static void main(String[] args) {

        MostFrequentEven2404 mf = new MostFrequentEven2404();

//        int ans = mf.mostFrequentEven2(new int[]{0,1,2,2,4,4,1});
//        int ans = mf.mostFrequentEven2(new int[]{4,4,4,9,2,4});
//        int ans = mf.mostFrequentEven(new int[]{29,47,21,41,13,37,25,7});
        int ans = mf.mostFrequentEven(new int[]{8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290});
        System.out.println(ans);
    }



}
