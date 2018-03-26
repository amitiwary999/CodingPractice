import java.util.*;

class MidArraySum{
 
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of array");
  int size = sc.nextInt();
  int array1[] = new int[size];
  int array2[] = new int[size];
  System.out.println("Enter array 1");
  for(int i=0;i<size;i++){
    array1[i] = sc.nextInt();
  }
  System.out.println("Enter array 2");
  for(int i=0;i<size;i++){
   array2[i] = sc.nextInt();
  }
  while(i+j <= n){
    if(i+j == n-1 || i+j == n){
      sum = sum+(array1[i] < array2[j] ? array1[i] : array2[j]);
    }
   if(array1[i] <= array2[j]){
     i++;
   }else{
     j++;
   }
  }
 }
}
