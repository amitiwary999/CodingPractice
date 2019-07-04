/*
Implement strStr().

 strstr - locate a substring ( needle ) in a string ( haystack ). 
Try not to use standard library string functions for this question.

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 NOTE: Good clarification questions:
What should be the return value if the needle is empty?
What if both haystack and needle are empty?
For the purpose of this problem, assume that the return value should be -1 in both cases. 
*/


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        char[] firstStr = A.toCharArray();
        char[] secondStr = B.toCharArray();
        
        int length1 = firstStr.length;
        int length2 = secondStr.length;
        int ans = -1;
        int flag = 0;
        int j;
        if(length1 == 0 || length2 == 0){
            return ans;
        }
        for(int i=0; i<length1; i++){
            flag = i;
            if(flag+length2>length1){
                break;
            }
            for(j=0; j<length2; j++){
                if(flag <length1){
                if(firstStr[flag] != secondStr[j]){
                    break;
                }else{
                    flag++;
                }
                }else{
                    break;
                }
            }
            if(j==length2){
                ans = i;
                break;
            }
        }
        return ans;
    }
}

