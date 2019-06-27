import java.util.*;

/*public class Solution {
	public ArrayList<Integer> getRow(int a) {
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    res.add(1);
	    for(int i=1; i<=a; i++){
	        int num = (a+1-i)*res.get(i-1)/i;
	        res.add(num);
	    }
	    return res;
	}
}*/

/*
Given an index k, return the kth row of the Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
*/
class Solution {
   public static void main(String[] args){
     Solution sol = new Solution();
     ArrayList<Integer> list = sol.getRow(70);
     for(int i=0; i<list.size(); i++){
       System.out.println(list.get(i));
     }
   }
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int prevTop = 1;
        int prevBottom = 1;
        for(int i=0; i<=A; i++){
            if(i==0){
                ans.add(1);
            }else{
                int temp = A-(i-1);
                int flag = temp*ans.get(i-1)/i;
               // System.out.println(temp*prevTop+"  "+(temp*prevTop)/i);
                ans.add(flag);
                prevTop = flag;
            }
        }
        return ans;
    }
}

