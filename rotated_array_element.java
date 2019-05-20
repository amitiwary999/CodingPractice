import java.util.*;

class RotatedArray{

  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number of element in array");
    int size = sc.nextInt();
    int array[] = new int[size];

    for(int i=0; i<size; i++){
     array[i] = sc.nextInt();
   }

   
 }

 private void getPivotpoint(int[] arr, int start, int end){
   int mid = (start+end)/2;
   
   if(mid == start|| mid == end){
     return mid;
   }else{
     
   }
 }
}
