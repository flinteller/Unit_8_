/**
 * @author Flint Eller
 * @since 4/8/20
 */

package com.company;

public class MagicSquare {
    private int[][] grid;

    /**
     * Initializes the class, takes one 2D array as a parameter
     * @param g g is a 2D array
     */
    public MagicSquare(int[][] g) {
        grid = g;
    }

    /**
     * This finds the sum of the number row that is passed
     * @param row which row to find the sum of
     * @return the sum of this row
     */
    public int rowSum(int row) {
        int sum = 0;
        for(int col = 0; col < grid.length; col++){
            sum += grid[row][col];
        }
        return sum;
    }

    /**
     * This finds the sum of the number column that is passed
     * @param col which column to find the sum of
     * @return the sum of the column
     */
    public int colSum(int col) {
        int sum = 0;
        for(int row = 0; row < grid.length; row++){
            sum += grid[row][col];
        }
        return sum;
    }

    /**
     * Finds the sum diagonally across the square going up, starting in the bottom left
     * @return the sum of the upward diagonal
     */
    public int upDiagSum() {
        int sum = 0;
        int row = grid.length - 1;
        int col = 0;
        while(col < grid.length){
            sum += grid[row][col];
            col++;
            row--;
        }
        return sum;
    }

    /**
     * Finds the sum diagonally across the square going down, starting in the top right
     * @return the sum of the downward diagonal
     */
    public int downDiagSum() {
        int sum = 0;
        int row = 0;
        int col = 0;
        while(col < grid.length){
            sum += grid[row][col];
            col++;
            row++;
        }
        return sum;
    }

    /**
     * Checks to see if all sums are the same
     * @return returns boolean of if it is a magic square or not
     */
    public boolean isMagicSquare() {
        for(int i = 0; i < grid.length; i++){
            if(rowSum(i) != colSum(i))
                return false;

            else if(rowSum(i) != upDiagSum())
                return false;

            else if(rowSum(i) != downDiagSum())
                return false;
        }
        return true;
    }


    /**
     * This method is complete. You do not need to provide additional
     * comments here.
     */
    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}

