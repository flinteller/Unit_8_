package com.company;

public class FourByFour {
    public static void main(String [] args) {
//code to define an initially empty int 2D array,
//minimum size 4x4
        int[][] nums = {{6, 2, 9, 7}, {7, 45, 12, 44}, {5, 4, 3, 2}, {45, 66, 1, 12}};

//code to output all original values
        System.out.println(nums[0][0]);
        System.out.println(nums[0][1]);
        System.out.println(nums[0][2]);
        System.out.println(nums[0][3]);

        System.out.println(nums[1][0]);
        System.out.println(nums[1][1]);
        System.out.println(nums[1][2]);
        System.out.println(nums[1][3]);

        System.out.println(nums[2][0]);
        System.out.println(nums[2][1]);
        System.out.println(nums[2][2]);
        System.out.println(nums[2][3]);

        System.out.println(nums[3][0]);
        System.out.println(nums[3][1]);
        System.out.println(nums[3][2]);
        System.out.println(nums[3][3]);


//code to change half the values to even positive numbers

        nums[0][0] = 2;
        nums[0][1] = 4;
        nums[0][2] = 6;
        nums[0][3] = 8;
        nums[1][0] = 10;
        nums[1][1] = 12;
        nums[1][2] = 14;
        nums[1][3] = 16;

//and the other half to negative odd numbers

        nums[2][0] = -1;
        nums[2][1] = -3;
        nums[2][2] = -5;
        nums[2][3] = -7;
        nums[3][0] = -9;
        nums[3][1] = -11;
        nums[3][2] = -13;
        nums[3][3] = -15;

//code to output a blank line separating output sets

        System.out.println("\n");

//code to output all array elements
        System.out.println(nums[0][0]);
        System.out.println(nums[0][1]);
        System.out.println(nums[0][2]);
        System.out.println(nums[0][3]);

        System.out.println(nums[1][0]);
        System.out.println(nums[1][1]);
        System.out.println(nums[1][2]);
        System.out.println(nums[1][3]);

        System.out.println(nums[2][0]);
        System.out.println(nums[2][1]);
        System.out.println(nums[2][2]);
        System.out.println(nums[2][3]);

        System.out.println(nums[2][0]);
        System.out.println(nums[2][1]);
        System.out.println(nums[2][2]);
        System.out.println(nums[2][3]);


    }

}
