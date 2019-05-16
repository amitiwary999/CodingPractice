/*
Given two sorted arrays of size m and n respectively, you are tasked with finding the element that would be at the k’th position of the final sorted array.
*/

import java.util.*;

class TwoSortedArray{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter first array size");
  int fSize = sc.nextInt();

  System.out.println("Enter second array size");
  int sSize = sc.nextInt();

  int[] firstArray = new int[fSize];
  int[] secondArray = new int[sSize];

  System.out.println("Enter first array elements");
  for(int i=0; i<fSize; i++){
   firstArray[i] = sc.nextInt();
  }

  System.out.println("Enter second array elements");
  for(int i=0; i<sSize; i++){
   secondArray[i] = sc.nextInt();
  }

  System.out.println("Enter the position of element to find in merged array");
  int kPos = sc.nextInt();

  int flag = 0;
  int finalArrayPos = 0;
  int finalArray[] = new int[fSize+sSize];
  int i=0, j=0;

  for(j=0; j<sSize; j++){
   int temp = secondArray[j];
   for(i=flag; i<fSize; i++){
     if(firstArray[i] < temp){
       finalArray[finalArrayPos] = firstArray[i];
       finalArrayPos++;
    }else{
      finalArray[finalArrayPos] = temp;
      flag = i;
      finalArrayPos++;
      break;
    }
   }
  if(i == fSize){
     finalArray[finalArrayPos] = secondArray[j];
     finalArrayPos++;
   }
  }

  j--;
  if(j<sSize-1){
   while(j<sSize){
    finalArray[finalArrayPos] = secondArray[j];
    finalArrayPos++;
    j++;
   }
  }else if(flag<fSize-1){
   while(flag<fSize){
    finalArray[finalArrayPos] = firstArray[flag];
    finalArrayPos++;
    flag++;
    }
   }
   else if(flag<fSize && finalArrayPos<((sSize+fSize))){
     while(flag<fSize){
      finalArray[finalArrayPos] = firstArray[flag];
      finalArrayPos++;
      flag++;
    }
   }

   System.out.println("Kth element of merged array "+finalArray[kPos-1]);
 } 

}
