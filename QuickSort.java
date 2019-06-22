import java.util.*;

class QuickSort{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int size = sc.nextInt();
   int[] input = new int[size];
   for(int i=0; i<size; i++){
    input[i] = sc.nextInt();
   }
   quickSort(input, 0, size-1);
   printAr(input, size);
 }

 static int partion(int[] ar, int low, int high){
   int flagPos=low;
   int temp;
   for(int i=low; i<high; i++){
     if(ar[i]<ar[high]){
       temp = ar[i];
       ar[i] = ar[flagPos];
       ar[flagPos] = temp;
       flagPos = i+1;
     }
   }
   temp = ar[flagPos];
   ar[flagPos] = ar[high];
   ar[high] = temp;
   return flagPos;
 }

 static void quickSort(int ar[], int low, int high){
   if(low<high){
     int pointPart = partion(ar, low, high);
     quickSort(ar, low, pointPart-1);
     quickSort(ar, pointPart, high);
   }else{
    return;
   }
 }

 static void printAr(int[] ar, int size){
  for(int i=0; i<size; i++){
   System.out.println(ar[i]);
  }
 }
}
