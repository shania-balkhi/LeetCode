// https://leetcode.com/problems/fraction-to-recurring-decimal/

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder ans = new StringBuilder();

        //to handle the case when either of the num and denom are negative (but not both)
        if( (numerator < 0) ^ (denominator < 0) && numerator != 0 ){
            ans.append('-');
        }
        // long num = Math.abs(numerator);
        long num = (long) Math.abs((long) numerator);
        // long denom = Math.abs(denominator);
        long denom = (long) Math.abs((long) denominator);

        long remainder = num % denom;
        long quotient = num / denom;
        ans.append(quotient);

        if(remainder == 0){
            return ans.toString();
        }else{
            ans.append('.');
            Map<Long, Integer> map = new HashMap<>(); //to store remainder and the pos ( = length of ans till rem) of the remainder
            while(remainder != 0){
                if(map.containsKey(remainder)){
                    int len = map.get(remainder);
                    ans.insert(len, '(');
                    ans.append(')');
                    break;
                }else{
                    map.put(remainder, ans.length());
                    remainder = remainder * 10;
                    quotient = remainder / denom;
                    remainder = remainder % denom;
                    ans.append(quotient);
                }
            }
        }

        return ans.toString();
    }
}
