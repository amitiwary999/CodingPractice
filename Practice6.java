/*
Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers.

If such arrangement is not possible, it must be rearranged as the lowest possible order ie, sorted in an ascending order.

The replacement must be in-place, do not allocate extra memory.

Examples:

1,2,3 → 1,3,2

3,2,1 → 1,2,3

1,1,5 → 1,5,1

20, 50, 113 → 20, 113, 50
Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.


*/

public class Solution {
    public void nextPermutation(ArrayList<Integer> a) {
        int size = a.size();
        int prev = 0;
        int temp = -1;
        int flag=-1;
        for(int i=size-1; i>=0; i--){
            int num = a.get(i);
            if(num < prev){
                for(int j=i+1; j<size; j++){
                    if(num < a.get(j)){
                        temp = a.get(j);
                        if(j==size-1){
                            a.set(j, num);
                             a.set(i, temp);
                            if(i==size-2){
                             
                            }else{
                                for(int k=i+1;k<size-1;k++){
                            int knum = a.get(k);
                            int inner = k;
                            for(int l=k+1; l<size; l++){
                               if(knum > a.get(l)){
                                   knum = a.get(l);
                                   inner = l;
                               } 
                            }
                            int innerTemp = a.get(k);
                            a.set(k, knum);
                            a.set(inner, innerTemp);
                        }
                            }
                        flag = 0;
                        break;
                        }
                    }else{
                        a.set(j-1, num);
                        a.set(i, temp);
                        
                        for(int k=i+1;k<size-1;k++){
                            int knum = a.get(k);
                            int inner = k;
                            for(int l=k+1; l<size; l++){
                               if(knum > a.get(l)){
                                   knum = a.get(l);
                                   inner = l;
                               } 
                            }
                            int innerTemp = a.get(k);
                            a.set(k, knum);
                            a.set(inner, innerTemp);
                        }
                        flag=0;
                        break;
                    }
                }
                if(flag == 0){
                break;
                }
            }
            prev = num;
        }
        if(flag==-1){
            Collections.sort(a);
        }
    }
}




/*

Better way

public class Solution {
	public void nextPermutation(ArrayList<Integer> a) {
	    int n = a.size();
	    int index = -1;
	    for (int i = n-1; i > 0; i--) {
            if (a.get(i) > a.get(i-1)) {
                index = i-1;
                break;
            }
        }
       
        if (index == -1) {
            Collections.sort(a);
        }
        else {
           
            int swapWithIndex = -1;
            for(int j = n-1; j >index; j--) {
                if (a.get(j) > a.get(index)) {
                    swapWithIndex = j;
                    break;
                }
            }
          
            int temp = a.get(index);
            a.set(index, a.get(swapWithIndex));
            a.set(swapWithIndex, temp);
           
            Collections.sort(a.subList(index+1, n));
        }
	}
}

*/

