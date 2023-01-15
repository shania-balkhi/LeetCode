// https://leetcode.com/problems/add-binary/

//TC : O(Max(a.length, b.length))
//SC : O(a.length + b.length)
class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        while(i >= 0 || j >= 0){

            int num1 = 0, num2 = 0;
            if(i >= 0){
                num1 = a.charAt(i) - '0';
            }
             if(j >= 0){
                num2 = b.charAt(j) - '0';
            }

            int sum = num1 + num2 + carry;   
            carry = sum/2;
            ans = sum%2 + ans; //'+ans' is written after 'sum%2' so that string gets reversed

            --i;
            --j;
        }

        if(carry != 0){
            ans = carry + ans; //'+ans' is written after 'sum%2' so that string gets reversed
        }

        return ans;

    }
}
