import java.util.*;

class NextSmallPalin{

 public static void main(String[] args){
  Scanner sc = new Scanner(Sytem.in);
  System.out.println("Enter the size of array");
  int size = sc.nextInt();
  int array = new int[size];
  System.out.println("Enter array");
  int flag = size%2 == 0? 1:0;
  for(int i=0;i<size;i++){
    array[i] = sc.nextInt();
  }
  for(int i=0;i<size/2-1;i++){
   array[(size-1)-i] = array[i]; 
  }
  if(array[i] > array[(size-1)-i]){
   array[i] = array[(size-1)-i]; 
  }else{
   array[(size-1)-i] = array[i];
  }
  for(int i=0;i<size;i++){
   System.out.println(array[i]+" ");
  }
 }
}
