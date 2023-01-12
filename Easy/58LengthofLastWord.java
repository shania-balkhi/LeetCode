// https://leetcode.com/problems/length-of-last-word/description/

//reverse the string
//now two loops will be needed to sort this
//loop 1 : iterate over reversed string
//         if str.charAt(i) == " ", then continue till str.charAt(i) != " " and store index i;
//loop 2 : intitialise 2nd loop counter var with with the index obtained in the first loop
//         iterate another loop with starting index(say, j) == i and continue till str.charAt(j) != space
// do j - i + 1 and return it
class Solution {
    public int lengthOfLastWord(String s) {
        int j = 0;
        StringBuilder newStr = new StringBuilder();
        newStr.append(s);
        newStr.reverse();

        for(int i = 0; i < newStr.length(); ++i){
            if(newStr.charAt(i) != ' '){
                j = i;
                break;
            }
        }

        int i = j;
        for(; i < newStr.length(); ++i){
            if(newStr.charAt(i) == ' '){
                break;
            }
        }

        return (i - j);
    }
}
