/*
Given a sequence, find the length of the longest increasing subsequence from a given sequence .
The longest increasing subsequence means to find a subsequence of a given sequence in which the subsequence's elements are in sorted order, lowest
to highest, and in which the subsequence is as long as possible. This subsequence is not necessarily contiguous, or unique.
*/
import java.util.*;

class AmazonQue21{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter numbers of data");
  int size = sc.nextInt();
  int numbers[] = new int[size];
  int lis[] = new int[size];
  int max = 0;
  for(int i=0;i<size;i++){
    numbers[i] = sc.nextInt(); 
    lis[i] = 1;
  }
  for(int i=1;i<size;i++){
   for(int j=0;j<i;j++){
     if(lis[j] >= lis[i] && numbers[i] > numbers[j]){
       lis[i] = lis[j]+1;
    } 
   }
   if(lis[i] > max){
    max = lis[i];
   }
  }
 System.out.println(max);
 }
}
