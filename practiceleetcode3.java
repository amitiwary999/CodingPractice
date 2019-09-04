class Solution {
    public List<Integer> partitionLabels(String S) {
        char[] charArray = S.toCharArray();
        int size = charArray.length;
        int[] count = new int[size];
        HashMap<Character, Integer> charMap= new HashMap();
        HashMap<Integer, Integer> posMap = new HashMap();
        charMap.put(charArray[0], 0);
        count[0]=1;
        posMap.put(1, 0);
        int max=0;
        for(int i=1;i<size;i++){
            if(charMap.get(charArray[i]) != null){
                int pos = charMap.get(charArray[i]);
                count[i] = count[i-1]>count[pos]?count[pos]:count[i-1];
            }else{
                charMap.put(charArray[i], i);
                count[i]=count[i-1]+1;
            }
            posMap.put(count[i], i);
            System.out.println(count[i]+" "+i+" "+count[i-1]+" "+count[charMap.get(charArray[i])]+" "+charMap.get(charArray[i]));
            max = max>count[i]?max:count[i];
        }
        
        int flag=-1;
        List<Integer> ans = new ArrayList();
        for(int i=1;i<=max;i++){
            if(flag>=size-1)
                break;
            int pos = posMap.get(i);
            if(pos>flag){
                ans.add(pos-flag);
                flag=pos;
            }
        }
        // for(int i=1;i<size;i++){
        //     System.out.println(count[i]+" "+count[i-1]);
        //     if(count[i]==count[i-1]){
        //         flag++;
        //     }else{
        //         ans.add(flag);
        //         flag=1;
        //     }
        // }
        return ans;
    }
}
