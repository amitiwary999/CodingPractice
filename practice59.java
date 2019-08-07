/*
Given the array of strings A, 
you need to find the longest string S which is the prefix of ALL the strings in the array.

Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 
and S2.

For Example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".
*/

public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        int size = A.size();
        if(size>0){
        int minLenPos = 0;
        int minLen = A.get(0).length();
        for(int i=0; i<size; i++){
            if(A.get(i).length()<minLen){
                minLen = A.get(i).length();
                minLenPos = i;
            }
        }
        
        String testString = A.get(minLenPos);
        for(int i=0;i<size;i++){
            int flagSize = testString.length();
            String temp="";
            String currString = A.get(i);
            for(int j=0;j<flagSize;j++){
                char char1=currString.charAt(j);
                char char2 = testString.charAt(j);
                
                if(char1==char2){
                    temp=temp+char1;
                }
            }
            testString = temp;
           // System.out.println(testString);
        }
        return testString;
        }else{
            return "";
        }
    }
}
