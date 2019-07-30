/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        int size = A.size();
        int ans=0;
        int temp=Integer.MAX_VALUE;
        for(int i=0; i<size; i++){
            if(A.get(i)>temp){
                ans = ans+(A.get(i)-temp);
            }
            temp= A.get(i);
        }
        return ans;
    }
}
/*
extra space solution
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
        int size = A.size();
        int max=0;
        int temp[][] = new int[size+1][size+1];
        for(int i=0; i<size; i++){
            temp[i][0]=0;
        }
        
        for(int i=0; i<size; i++){
            temp[0][i]=0;
        }
        
        for(int i=1;i<size+1;i++){
            int sumFlag = temp[i-1][i-1];
            int maxTemp=0;
           // System.out.println("su "+sumFlag+" "+temp[i][i-1]);
            for(int j=1;j<size+1;j++){
                if(j<=i){
                    temp[i][j]=temp[i-1][j];
                }else{
                    int flag = (((A.get(j-1)-A.get(i-1))+sumFlag)>temp[i-1][j]?((A.get(j-1)-A.get(i-1))+sumFlag):temp[i-1][j]);
                    maxTemp = maxTemp>flag?maxTemp:flag;
                    temp[i][j]=maxTemp;
                    max = max>flag?max:flag;
                   // System.out.println(i+" "+j+"  "+flag+" "+max+" "+sumFlag+" "+maxTemp);
                }
            }
        }
        return max;
    }
}
*/
