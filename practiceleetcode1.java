/*Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
*/

class Solution {
    public int[] countBits(int num) {
        int[] ans = new int[num+1];
        int[] temp = new int[4];
        temp[0]=0;
        temp[1]=1;
        temp[2]=1;
        temp[3]=2;
        int flag=4;
        int counter=4;
        for(int i=0;i<=num;i++){
            if(i<4){
                ans[i]=temp[i];
            }else{
               if(i==counter){
                   ans[i]=1;
               } else{
                  ans[i]=ans[i-counter]+1; 
               }
                flag--;
                if(flag==0){
                    flag=counter*2;
                    counter=flag;
                }
            }
        }
        return ans;
    }
}
