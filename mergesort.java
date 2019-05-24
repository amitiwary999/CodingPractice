import java.util.*;

class MergeSort{
  public static void main(String[] args){
   MergeSort ms = new MergeSort();

   Scanner sc = new Scanner(System.in);
   System.out.println("merge sort array size");
   int size = sc.nextInt();
   int inputArray[] = new int[size];
   
   for(int i=0; i<size; i++){
    inputArray[i] = sc.nextInt();
   }

  ms.sortArray(inputArray, 0, size-1);
  ms.printArray(inputArray, size);
 }

 private void sortArray(int[] arr, int l, int r){
  if(l < r){
    int mid = (l+r)/2;
    sortArray(arr, l, mid);
    sortArray(arr, mid+1, r);
    mergeArray(arr, l, mid, r);
  }
 }

 private void mergeArray(int[] arr, int l, int m, int r){
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        int i = 0, j = 0; 

        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 

        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
 }

 private void printArray(int[] arr, int size){
  for(int i=0; i<size; i++){
    System.out.print(arr[i]+" ");
  }
 }
}
