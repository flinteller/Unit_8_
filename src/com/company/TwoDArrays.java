package com.company;


public class TwoDArrays {

    public static int maxValue(int[][] list){
        int max = Integer.MIN_VALUE;

        for(int row = 0; row < list.length; row++){
            for(int col = 0; col < list[0].length; col++){
                if(list[row][col] > max){
                    max = list[row][col];
                }
            }
        }

        return max;
    }

    public static int sumAll(int[][] nums){
        int total = 0;

        for(int row = 0; row < nums.length; row++){
            for(int col = 0; col < nums[0].length; col++){
                total += nums[row][col];
            }
        }

        return total;
    }

    public static void main(String args[]){
        int[][] list = {{21, -4, 89}, {65, 33, 1}, {-2, 3, 1}};
        System.out.println(maxValue(list));

        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sumAll(nums));

    }

}
