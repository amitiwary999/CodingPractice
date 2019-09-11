/*
Given a list of words, each word consists of English lowercase letters.

Let's say word1 is a predecessor of word2 if and only if we can add exactly one letter anywhere in word1 to make it equal to word2.  For example, "abc" is a predecessor of "abac".

A word chain is a sequence of words [word_1, word_2, ..., word_k] with k >= 1, where word_1 is a predecessor of word_2, word_2 is a predecessor of word_3, and so on.

Return the longest possible length of a word chain with words chosen from the given list of words.
*/

class Solution {
    public int longestStrChain(String[] words) {
        int size = words.length;
        Arrays.sort(words, new Comparator<String>() {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
});
        int[][] temp = new int[size][size];
        
        int res = 0;
        for(int i=1;i<size;i++){
            temp[0][i]=cal(words[0], words[i]);
            res = max(res, temp[0][i]);
        }
        
        for(int i=1;i<size-1;i++){
            String curr = words[i];
            for(int j=i+1;j<size;j++){
                String test = words[j];
                int cal = cal(curr, test);
                if(cal == 0){
                   temp[i][j]=temp[i-1][j]; 
                }else{
                   temp[i][j]=max(temp[i-1][i]+1, temp[i][j]);
                }
              //  System.out.println(temp[i][j]+" "+temp[i-1][i]+" "+cal+" "+curr+" "+test);
                res = max(res, temp[i][j]);
            }
        }
        return res+1;
    }
    
    static int cal(String curr, String test){
        int currLength = curr.length();
        int testLength = test.length();
              if(testLength>currLength){
                    if((testLength-currLength) == 1){
                        return isPredecessor(test, curr);
                    }else{
                        return 0;
                    }
                }else{
                    if((currLength-testLength) == 1){
                        return isPredecessor(curr, test);
                    }else{
                        return 0;
                    }
                }
    }
    
    static int isPredecessor(String s1, String s2){
        int size1=s1.length();
        int size2=s2.length();
        
        int i=0,j=0,danger=0;
        while(i<size1 && j<size2){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;j++;
            }else{
                if(danger == 1){
                    return 0;
                }else{
                    danger=1;
                }
                i++;
            }
        }
        return 1;
    }

/*
class Solution {
public int longestStrChain(String[] words) {
	Set<String> dict = new HashSet<>(Arrays.asList(words));
	Map<String, Integer> memo = new HashMap<>();
	int result = 0;
	for (String word : words) {
		result = Math.max(result, helper(word, dict, memo));
	}
	return result;
}

private int helper(String word, Set<String> dict, Map<String, Integer> memo) {
	if (memo.containsKey(word)) {
		return memo.get(word);
	}
	if (!dict.contains(word)) {
		return 0;
	}
	int result = 0;
	for (int i = 0; i < word.length(); i++) {
		String newWord = new StringBuilder(word).deleteCharAt(i).toString();
		if (dict.contains(newWord)) {
			result = Math.max(result, helper(newWord, dict, memo));
		}
	}
	memo.put(word, result + 1);
	return result + 1;
}
}
*/
    
    static int max(int num1, int num2){
        return num1>num2?num1:num2;
    }
}
