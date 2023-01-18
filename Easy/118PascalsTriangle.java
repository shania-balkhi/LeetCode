// https://leetcode.com/problems/pascals-triangle/description/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> currentRow, previousRow = null;
        for(int i = 0; i < numRows; ++i){
            currentRow = new ArrayList<>();
            for(int j = 0; j <= i; ++j){
                if(j == 0 || j == i){
                    currentRow.add(1);
                }else{
                    currentRow.add(previousRow.get(j - 1) + previousRow.get(j));
                }
            }
            previousRow = currentRow;
            res.add(currentRow);
        }

        return res;
    }
}
