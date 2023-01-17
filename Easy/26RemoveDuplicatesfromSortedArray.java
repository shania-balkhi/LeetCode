// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution {
    public int removeDuplicates(int[] nums) {
        int addAtIndex = 1; //index at which unique element will be added; 0th element is always unique, so next unique element will be stored at index 1

        for(int i = 0; i < nums.length - 1; ++i){
            if(nums[i] < nums[i + 1]){
                nums[addAtIndex] = nums[i + 1];
                ++addAtIndex;
            }
        }

        return addAtIndex;
    }
}
