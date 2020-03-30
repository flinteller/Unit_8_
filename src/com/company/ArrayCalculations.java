package com.company;

public class ArrayCalculations {

    public static int rowSum(int[][] arr, int row) {
        // create a variable to keep track of the total
        int total = 0;


        // check to see if the given row variable is valid.
        // If the row is less than 0 or is greater than
        // the number of rows it is not valid. Return -1 if not valid.

        if(row < 0 || row > arr.length){
            total = -1;
        }


        // if row is valid, create a loop to calculate the sum. hint:
        // elements in a 2D array are found like
        // this arr[row][column]. If you are finding the sum of a row,
        // the [row] number will not change
        // only the [column] part will.

        if(total != -1){
            for(int x = 0; x < arr[row].length; x++){
                total += arr[row][x];
            }
        }

        // return the total

        return total;
    }

    public static int columnSum(int[][] arr, int col) {
        // create a variable to keep track of the total

        int total = 0;


        // check to see if the given col variable is valid.
        // If col is less than 0 or is greater than
        // the number of columns (the length of one array) it is not valid.
        // Return -1 if not valid.

        if(col < 0 || col > arr[0].length){
            total = -1;
        }

        // if col is valid, create a loop to calculate the sum. hint:
        // elements in a 2D array are found like
        // this arr[row][column]. If you are finding the sum of a col,
        // the [column] number will not change
        // only the [row] part will.

        if(total != -1){
            for(int x = 0; x < arr.length; x++){
                total += arr[x][col];
            }
        }

        // return the total

        return total;

    }

    public static int diagonalSum(int[][] arr, int direction) {

        int total = 0;

        if(direction == 1){
            int col = 0;
            int row = arr.length - 1;
            while(col < arr.length){
                total += arr[row][col];
                col++;
                row--;
            }
        }
        else if(direction == 0){
            int col = 0;
            int row = 0;
            while(col < arr.length){
                total += arr[row][col];
                col++;
                row++;
            }
        }
        else
            total = -1;

        return total;

    }



    public static void main(String[] args){
        int[][] arr = {{1, 2, 3, 4}, {9, 7, 4, 3}, {0, 2, 5, 1}};

        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        System.out.println(rowSum(arr, 4));

        System.out.println(columnSum(arr, 0));

        System.out.println(diagonalSum(arr2, 0));

    }

}
