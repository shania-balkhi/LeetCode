// https://leetcode.com/problems/climbing-stairs/description/

//memoization 
class Solution {
    public int climbStairs(int n) {
        
        int[] dp = new int[n + 1];
        return climbStairsHelper(n, dp);

    }

    private static int climbStairsHelper(int n, int[] dp){

        int ans1 = 0, ans2 = 0;

        //base case
        if(n == 1 || n == 2){
            return n;
        }

        if(dp[n] != 0){
            return dp[n];
        }else{
            ans1 = climbStairsHelper(n - 1, dp);
            dp[n - 1] = ans1;
            ans2 = climbStairsHelper(n - 2, dp);
            dp[n - 2] = ans2;
        }

        return ans1 + ans2;

    }

}
