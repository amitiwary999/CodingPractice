/*
Given an array of integers, return the highest product possible by multiplying 3 numbers from the array

Input:

array of integers e.g {1, 2, 3}
*/


public class Solution {
    public int maxp3(int[] A) {
        int size = A.length;
        int max1=Integer.MIN_VALUE, max2=Integer.MIN_VALUE, max3=Integer.MIN_VALUE, min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            int num=A[i];
            if(num>max1){
                max3=max2;
                max2=max1;
                max1=num;
            }else if(num>max2){
                max3=max2;
                max2=num;
            }else{
                max3=num;
            }
            
            if(num<min1){
                min2=min1;
                min1=num;
            }else if(num<min2){
                min2=num;
            }
        }
        
        return max(max1*max2*max3, max1*min1*min2);
    }
    
    static int max(int num1, int num2){
        System.out.println(num1+" "+num2);
        return num1>num2?num1:num2;
    }
}

