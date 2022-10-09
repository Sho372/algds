package com.sho372.algds.leetcode;

public class HardestWorker6200 {

    public int hardestWorker(int n, int[][] logs) {

        int prevLeaveTime = 0;
        int hardestWorkerId = Integer.MAX_VALUE;
        int longestTime = 0;

        for (int[] log:logs) {
            if((log[1] - prevLeaveTime > longestTime) || (log[1]-prevLeaveTime == longestTime && log[0] < hardestWorkerId)) {
                longestTime = log[1] - prevLeaveTime;
                hardestWorkerId = log[0];
            }
            prevLeaveTime = log[1];
        }
        return hardestWorkerId;
    }


    public static void main(String[] args) {
        int n = 26;
        int[][] logs = {{1,1},{3,7},{2,12},{7,17}};

        HardestWorker6200 h = new HardestWorker6200();
        int s = h.hardestWorker(n, logs);
        System.out.println(s);
    }
}
