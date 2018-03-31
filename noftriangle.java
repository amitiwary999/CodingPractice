import java.util.*;

class NofTriangle{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of array");
  int size = sc.nextInt();
  int array[] = new int[size];
  int min = 0, temp, flag=0, ans = 0;
  System.out.println("Enter array element");
  for(int i=0;i<size;i++){
   array[i] = sc.nextInt();
  }
  for(int i=0;i<size-1;i++){
   min = array[i];
   for(int j=i+1; j<size;j++){
    if(array[j] < min){
     min = array[j];
     flag = j;
   }
  }
  temp = array[flag];
  array[flag] = array[i];
  array[i] = temp; 
 }
 for(int i=0;i<size-2;i++){
  for(int j=i+1;j<size-1;j++){
   for(int k=j+1; k<size;k++){
    if(array[i]+array[j] >array[k] && array[i]+array[k] >array[j] && array[k]+array[j] >array[i]){
     ans++;
    } 
   }
  }
 } 
 System.out.println(ans);   
 }
}
