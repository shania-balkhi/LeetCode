// https://leetcode.com/problems/search-insert-position/description/

//TC : O(log n)
class Solution {
    public int searchInsert(int[] nums, int target) {

        //edge case
        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            }else if(nums[0] < target){
                return 1;
            }
        }

        int low = 0, high = nums.length - 1;
        while(low<high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }

            if(low == high){
                if(nums[low] < target){
                    return (low + 1);
                }else{
                    return low;
                }   
            } 
        }   

        return low;

    }
}
