import java.util.*;

class ArrayDiff{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int size = sc.nextInt();
  int arr[] = new int[size];
  for(int i=0;i<size;i++){
   arr[i] = sc.nextInt();
  }
  int maxArray[] = new int[size];
  int minArray[] = new int[size];
  
  minArray[0] = arr[0];
  for(int j=1;j<size; j++){
   minArray[j] = arr[j] < minArray[j-1] ? arr[j] : minArray[j-1];
   System.out.println(minArray[j]);
  }

  maxArray[size-1] = arr[size-1];
  for(int k=size-2;k>=0;k--){
   maxArray[k] = arr[k] > maxArray[k+1] ? arr[k] : maxArray[k+1];
   System.out.println(maxArray[k]);
  } 

 int j=0,k=0,diff=0;
 while(j<size && k<size){
   if(minArray[j] <= maxArray[k]){
     diff = (j-k) < diff ? diff : (j-k);
     j++;
   }else{
     k++;
   }
  }
 System.out.println(diff);
 }
}
