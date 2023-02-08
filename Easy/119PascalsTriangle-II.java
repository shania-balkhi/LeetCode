class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<Integer>();
        long val = 1;
        int i = rowIndex;
        for(int j = 0; j <= rowIndex; ++j){
            ans.add((int)val); 
            val = (val * (i - j)) / (j + 1);
        }
        return ans;
    }
}
