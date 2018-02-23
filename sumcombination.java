/*
Given an array of integers A and a sum B, find all unique combinations in A where the sum is equal to B. The same repeated number may be chosen from A unlimited number of times.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class SumCombination{
     static LinkedHashSet<String>hs;
	public static void main (String[] args){
	 //code
	 Scanner in=new Scanner(System.in);
	 int t=in.nextInt();
	 while(t--!=0) {
	     int n=in.nextInt();
	     HashSet<Integer>lol=new HashSet<>();
	     for(int i=0;i<n;i++)
	     lol.add(in.nextInt());
	     int arr[]=new int[lol.size()];
	     Iterator<Integer>it=lol.iterator();
	     int a=0;
	     while(it.hasNext())
	     arr[a++]=it.next();
	     int k=in.nextInt();
	     hs=new LinkedHashSet<>();
	     Arrays.sort(arr);
	    solve(0,arr,0,lol.size(),"",k);
	     if(hs.isEmpty())
	     System.out.println("Empty");
	     else{
	         Iterator<String>itr=hs.iterator();
	         while(itr.hasNext())
	         System.out.print("("+itr.next().substring(1)+")");
	         System.out.println();
	     }
	 }
	 }
	 static void solve(int sum,int arr[],int st,int n,String s,int k)
	 {
	     if(sum==k)
	     {
	         hs.add(s);
	         return;
	     }
	     for(int i=st;i<n;i++)
	     {
	         if(sum+arr[i]<=k)
	         {
	             solve(sum+arr[i],arr,i,n,s+" "+Integer.toString(arr[i]),k);
	            solve(sum+arr[i],arr,i+1,n,s+" "+Integer.toString(arr[i]),k);
	            solve(sum,arr,i+1,n,s,k);
	         }
	     }
	 }
}
