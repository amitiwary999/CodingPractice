/*
S and T are strings composed of lowercase letters. In S, no letter occurs more than once.

S was sorted in some custom order previously. We want to permute the characters of T so that they match the order that S was sorted. More specifically, if x occurs before y in S, then x should occur before y in the returned string.

Return any permutation of T (as a string) that satisfies this property.
*/

class Solution {
    public String customSortString(String S, String T) {
        int sizeS = S.length();
        int sizeT = T.length();
        
        if(sizeS>0){
            int[] sPosArray = new int[26];
            for(int i=0;i<26;i++){
                sPosArray[i]=-1;
            }
            for(int i=0;i<sizeS;i++){
                char c = S.charAt(i);
                sPosArray[c-'a'] = i;
            }
        
            ArrayList<Character> ans = new ArrayList(sizeT);
            ans.add(T.charAt(0));
            
            int flag=0;
            for(int i=1;i<sizeT;i++){
                char currChar = T.charAt(i);
                flag=i;
                for(int j=i-1;j>=0;j--){
                    char ansChar = ans.get(j);
                    
                    if(sPosArray[currChar-'a'] == -1 ){
                        break;
                    }
                    if(sPosArray[currChar-'a'] < sPosArray[ansChar-'a']){
                        flag=j;
                    }
                }
                ans.add(flag, currChar);
            }
            
            
            StringBuilder sb = new StringBuilder(); 
  
            for (Character ch : ans) {   
                sb.append(ch); 
            } 
            return sb.toString();
        }else{
            return "";
        }
    }
}

/*
class Solution {
    public String customSortString(String S, String T) {
        if(S.length() == 0 || T.length() == 0)
            return "";
        HashSet<Character> hs = new HashSet<>();
        HashMap<Integer,String> hm = new HashMap<>();
        for(int i=0;i<S.length();i++)
            hs.add(S.charAt(i));
        for(int i=0;i<T.length();i++)
        {
            char ch = T.charAt(i);
            if(!hs.contains(ch))
                hm.put(200,(hm.get(200)==null?"":hm.get(200))+ch+""); 
            else
            {
                int index = S.indexOf(ch);
                hm.put(index,(hm.get(index)==null?"":hm.get(index))+ch+"");
            }
        }
        StringBuilder str = new StringBuilder();
        for(Map.Entry<Integer,String> entry:hm.entrySet())
            str.append(entry.getValue());
            
            
        return str.toString();
            
    }
}
*/
