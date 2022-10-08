package com.sho372.algds.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class SortPeople6188 {
    public String[] sortPeople(String[] names, int[] heights) {

        int n = names.length;

        int cnt = 0;
        while (cnt < n) {
            for (int i = 0; i < n-1-cnt; i++) {

                if(heights[i] < heights[i+1]) {
                    int tmph = heights[i];
                    heights[i] = heights[i+1];
                    heights[i+1] = tmph;

                    String tmps = names[i];
                    names[i] = names[i+1];
                    names[i+1] = tmps;
                }
            }
            cnt++;
        }

        return names;
    }


    public String[] sortPeople2(String[] names, int[] heights) {

        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] ret = new String[heights.length];
        for (int i = heights.length-1; i > -1; i--) {
            ret[heights.length -1 - i] = map.get(heights[i]);
        }
        return ret;
    }

    public static void main(String[] args) {
//        String[] names = {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
        String[] names = {"Mary","John","Emma"};
//        int[] heights = {17233,32521,14087,42738,46669,65662,43204,8224};
        int[] heights = {180,165,170};
        SortPeople6188 s = new SortPeople6188();
//        String[] ans =  s.sortPeople(names, heights);
        String[] ans =  s.sortPeople2(names, heights);
        System.out.println(ans);
    }
}
