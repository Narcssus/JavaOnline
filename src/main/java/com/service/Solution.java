package com.service;

import com.alibaba.fastjson.JSON;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    public int orangesRotting(int[][] grid) {
        int res = 0;
        int flag = 0;
        int goodNum = 0;
        int badNum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    goodNum++;
                }
                if (grid[i][j] == 2) {
                    badNum++;
                }
            }
        }
        if (goodNum == 0) {
            return 0;
        }
        do {
            flag = 0;
            int[][] tmp = new int[grid.length][grid[0].length];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    tmp[i][j] = grid[i][j];
                }
            }
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    int orange = grid[i][j];
                    if (orange == 2) {
                        if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                            tmp[i - 1][j] = 2;
                            flag++;
                        }
                        if (i + 1 < grid.length && grid[i + 1][j] == 1) {
                            tmp[i + 1][j] = 2;
                            flag++;
                        }
                        if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                            tmp[i][j - 1] = 2;
                            flag++;
                        }
                        if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {
                            tmp[i][j + 1] = 2;
                            flag++;
                        }
                    }
                }
            }
            if (flag > 0) {
                res++;
            }
            grid = tmp;
        } while (flag > 0);
        boolean f = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    f = true;
                }
            }
        }
        if (f) {
            return -1;
        }
        return res;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
        System.out.println(s.orangesRotting(new int[][]{{2, 1, 1}, {0,1,1}, {1,0,1}}));
        System.out.println(s.orangesRotting(new int[][]{{0,2}}));
        System.out.println(s.orangesRotting(new int[][]{{1}}));
        System.out.println(s.orangesRotting(new int[][]{{1,2}}));

    }
}

