// https://leetcode.com/problems/plus-one/description/ 

class Solution {
    public int[] plusOne(int[] digits) {

        //handling the case for numbers like 9, 99, 999, 9999 etc part 1
        int[] digits9 = new int[digits.length + 1];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < digits.length; ++i){
            map.put(digits[i], map.getOrDefault(digits[i], 0) + 1);
        }
        int HashMapSize = map.size();

        //for handling normal case
        for(int i = digits.length - 1; i >= 0; --i){
            if(digits[i] >= 0 && digits[i] <= 8){
                digits[i] += 1;
                break;
            }else if(digits[i] == 9 && digits.length > 1 && HashMapSize > 1){
                digits[i] = 0;
                continue;
            }
            //handling the case for numbers like 9, 99, 999, 9999 etc part 2
            else if(digits[i] == 9 && HashMapSize == 1){
                for(int j = 1; j < digits9.length; ++j){
                    digits9[j] = 0;
                }
                digits9[0] = 1;
                return digits9;
            }
        }
        return digits;
    }
}
