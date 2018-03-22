import java.util.*;

class AmazonQue27{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of array");
  int size = sc.nextInt();
  int array[] = new int[size];
  int sum = 0;
  for(int i=0;i<size;i++){
   sum = sum+sc.nextInt();
   array[i] = sum;
  }
int limit = size - 1;
int min = Integer.MAX_VALUE;
  for(int i=0;i<limit;i++){
   int temp = sum - (2*array[i]);
   min = Math.abs(temp) < min? Math.abs(temp) : min;
   if(min == 0)
    break;
  }
 System.out.println(min);
 }
}
