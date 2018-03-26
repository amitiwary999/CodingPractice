import java.util.*;

class MidArraySum{
 
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of array");
  int size = sc.nextInt();
  int i=0, j=0, sum=0;
  int array1[] = new int[size];
  int array2[] = new int[size];
  System.out.println("Enter array 1");
  for(int k=0;k<size;k++){
    array1[i] = sc.nextInt();
  }
  System.out.println("Enter array 2");
  for(int k=0;k<size;k++){
   array2[i] = sc.nextInt();
  }
  while(i+j <= size){
    if(i+j == size-1 || i+j == size){
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
