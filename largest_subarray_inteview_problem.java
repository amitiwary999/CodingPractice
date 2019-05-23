import java.util.*;

class LargestSubArrayProblem{

 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int size= sc.nextInt();
    int array[] = new int[size];
    System.out.println("Enter the array");
    for(int i=0; i<size; i++){
     array[i] = sc.nextInt();
   }
 
   int flag = 0;
   int temp;
   int tempSum = 0;
   int ans = 0;
   for(int i=0; i<size; i++){
     temp = array[i];
     flag = flag+temp;
     if(flag<0){
       flag = 0;
     }
    if(flag>ans){
       ans = flag;
     }
   }

  System.out.println("ans "+ans);
 }
}
