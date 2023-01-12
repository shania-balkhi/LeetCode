// https://leetcode.com/problems/merge-sorted-array/description/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //add elements of nums2 to nums1
        //sort nums1 and return

        int j = 0;
        for(int i = m; i < (m + n); ++i){
            nums1[i] = nums2[j++];
        }

        Arrays.sort(nums1);
    }
}

