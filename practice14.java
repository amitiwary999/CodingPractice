public class Solution {
    public String convert(String A, int B) {
        char[] strArray = A.toCharArray();
        int size = strArray.length;
        String ans ="";
        int flag1 = (B-1)*2;
        int flag2 = 0;
        int counter = 0;
        if(B != 1 && B<size){
        for(int i=0; i<B; i++){
            int nextPt = i;
            counter = 0;
            while(nextPt <size){
                ans=ans+String.valueOf(strArray[nextPt]);
               if(counter == 0){
                   nextPt = nextPt+((flag1>0)?flag1:flag2);
                   counter = 1;
               } else{
                   counter = 0;
                   nextPt = nextPt+((flag2>0)?flag2:flag1);
               }
            }
            flag1 = flag1-2;
            flag2 = flag2+2;
        }
        return ans;
        }else{
            return A;
        }

     /*
       other approach

      if (B<=1) return A;
        if(A.length()<=1) return A;
        StringBuilder s = new StringBuilder();
        for (int i=0; i<B; i++){
            int distIn = (B-i-1)*2;
            int distOut = i*2;
            int dist = distOut;
            for(int j=i; j<A.length(); j+=dist){
                s.append(A.charAt(j));
                dist = dist==distIn ? distOut : distIn;
                if(dist==0) dist = dist==distIn ? distOut : distIn;
            }
        }
        return s.toString();
     */
    }
}
