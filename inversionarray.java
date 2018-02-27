import java.util.*;

class InversionArray{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int flag, min;
  System.out.println("Enter the size of array");
  int size = sc.nextInt();
  int count = 0;
  int arr[] = new int[size]; 
  for(int i = 0;i<size;i++){
   arr[i] = sc.nextInt();
  }
  for(int i=0;i<size-1;i++){
     min = arr[i];
   for(int j=i+1;j<size;j++){
     if(arr[j] < min){
      //min =arr[j];
      //flag = j;
      count++;
     }
   }
  /*if(flag != i){
    int temp = arr[flag];
    arr[flag] = arr[i];
    arr[i] = temp;
    count++;
   }*/
  }
 System.out.println(count);
 }
}
