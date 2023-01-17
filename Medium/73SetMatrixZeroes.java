// https://leetcode.com/problems/set-matrix-zeroes/description/

class Solution {
    public void setZeroes(int[][] matrix) {
        int[] temp = new int[matrix.length * matrix[0].length]; 
        int k = 0;
        for(int i = 0; i < matrix.length; ++i){
            for(int j = 0; j < matrix[0].length; ++j){
                if(matrix[i][j] == 0 && k < temp.length - 1){   
                    temp[k] = i;
                    temp[k + 1] = j;
                    k += 2;
                }
            }
        }

        for(int i = 0; i < k; i+=2){
            
            //fill row
            for(int j = 0; j < matrix[0].length; ++j){
                int x = temp[i];
                matrix[x][j] = 0;
            } 

            //fill column
            for(int j = 0; j < matrix.length; ++j){
                int y = temp[i + 1];
                matrix[j][y] = 0;
            }

        }
    }
}
