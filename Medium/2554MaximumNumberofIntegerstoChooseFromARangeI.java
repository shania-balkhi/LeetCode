// https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/

//TC : O(n) + O(n) //1st for traversing visited[] array and 2nd for traversing from 1 to n in the second for loop
//SC : O(n) ; for creating visited array
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        //creating a visited array
        boolean[] visited = new boolean[n + 1];
        for(int i = 0; i < banned.length; ++i){
            if(banned[i] <= n){
                visited[banned[i]] = true;
            }
        }

        int sum = 0, count = 0;
        for(int i = 1; i <= n; ++i){ //condition 1 : The chosen integers have to be in the range [1, n]. 
            if(!visited[i]){         //condition 2 : The chosen integers should not be in the array banned.
                sum += i;
                ++count;
                if(sum > maxSum){   //condition 3 : The sum of the chosen integers should not exceed maxSum.
                    sum -= i;
                    --count;
                }
            }
        }
        return count;
    }

}
