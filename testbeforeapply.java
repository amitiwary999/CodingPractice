import java.util.*;

class TestBeforeApply{

 public static void main(String[] args){
   System.out.println("Enter size of array");
   Scanner sc = new Scanner(System.in);
   int size = sc.nextInt();
   int[] array = new int[size];
   for(int i=0;i<size;i++){
    array[i] = sc.nextInt();
  }
  int max = 0;
  int sum = 0;
  for(int i=0;i<size;i++){
    sum = sum+array[i];
    if(sum < 0 ){
     sum = 0;
    }
    if(max < sum){
      max = sum;
    }
  }
 System.out.println(max);
 }
}
