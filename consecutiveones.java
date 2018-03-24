import java.util.*;

class ConsecutiveOne{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of array");
  int size = sc.nextInt();
  int array[] = new int[size];
  System.out.println("Enter elements of array");
  for(int i = 0; i<size; i++){
   array[i] = sc.nextInt();
  }
  System.out.println("Enter the numbers of zeros to be replaced");
  int replaceZero = sc.nextInt();
  int j=0, startIndex=0, max=0; 
  while(j<size){
   if(arr[j] == 0){
    if(replaceZero > 0){
     replaceZero--;
    }else{
     while(startIndex <= j && array[startIndex]!= 0){
      startIndex++;
     }
    } 
   }
   j++;
   max = Math.max(max, j-startIndex);
  }  
 }
}     
