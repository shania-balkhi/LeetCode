// https://leetcode.com/problems/sqrtx/description/

class Solution {
    public int mySqrt(int x) {

        //base case
         if (x == 0 || x == 1)
            return x;

        int low = 1, high = x/2; 
        int ans = 0;
        while(low<=high){
            int mid = low + (high - low)/2;
            //instead of mid*mid we are giving x/mid to tackle overflow of integer range when multiplying with bigger numbers
            if(mid == x/mid){
                return mid;
            }else if(mid > x/mid){
                high = mid - 1;
            }else{
                low = mid + 1;
                ans = mid;
            }
        }
       
        return ans;
    }
}
