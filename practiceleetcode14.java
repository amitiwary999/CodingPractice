/*
Given a binary string S (a string consisting only of '0' and '1's) and a positive integer N, return true if and only if for every integer X from 1 to N, the binary representation of X is a substring of S.
*/

class Solution {
    public boolean queryString(String S, int N) {
        int size = S.length();
        
        Map<Integer, Integer> map = new HashMap();
        
        int flag=2;
        int length=2;
        int temp=flag;
        if(S.contains("1")){
            map.put(1,1);
        }else{
            return false;
        }
        for(int i=2;i<=N;i++){
            if(map.get(i) == null){
                int foundi=0;
                for(int j=0;j<=size-length;j++){
                    int num=0;
                    for(int k=0;k<length;k++){
                        int pos = j+(length-1)-k;
                        int mul = S.charAt(pos)-'0';
                        int pow = (int)Math.pow(2,k);
                        num =  num+(mul*pow);
                        if(num!=0)
                        map.put(num,1);
                    }
                 //   System.out.println(num+" "+length+" "+i);
                    if(num==i){
                        foundi=1;
                        break;
                    }
                }
                //if i not found return false;
                if(foundi==0){
                    return false;
                }
            }
            if(--flag==0){
                temp = 2*temp;
                flag=temp;
                length++;
            }
        }
        
        if(map.size()>=N){
            return true;
        }else{
            return false;
        }
    }
}

/*
class Solution {
    public boolean queryString(String S, int N) {
        for (int i = N; i > 0; i--) {
            if (!S.contains(intToBin(i))) return false;
        }
        return true;
    }
    
    private String intToBin(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int bit = n & 1;
            sb.append(bit == 1 ? '1' : '0');
            n >>= 1;
        }
        return sb.reverse().toString();
    }
}
*/
