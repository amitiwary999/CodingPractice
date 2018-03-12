import java.util.*;

class ArrayWave{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the array size");
  int size = sc.nextInt();
  int min = 0, temp, flag, last;
  int array[] = new int[size];
  for(int i=0;i<size;i++){
    array[i] = sc.nextInt();
  }
 for(int i=0;i<size-1;i++){
   min = array[i];
   flag = i;
  for(int j=i;j<size;j++){
    if(array[j]<min){
      min = array[j];
      flag = j;
    }
   }
  temp = array[i];
  array[i] = array[flag];
  array[flag] = temp; 
  }
 int check = size%2 == 0?1:0;
 if(check == 1)
   last = (size/2) - 1;
 else
   last = size/2;
 
 for(int i=0;i<last;i++){
   System.out.print(array[size-1-i]+" "+array[i]+" ");
  } 
 if(check == 0){
   System.out.print(array[last]);
  } 
 }
} 
