import java.util.*;

class DP_15_PRACTICE{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int max= 0;
    int answer[] = new int[size];
    int array[] = new int[size];
    for(int i=0; i<size; i++){
      int input = sc.nextInt();
      array[i] = input;
      answer[i] = input;
    }

   for(int i=1;i<size; i++){
    for(int j=0; j<i; j++){
      if(array[i] > array[j] && answer[i] < answer[j]+array[i]){
       int temp = answer[j]+array[i];
       if(temp > max){
         max = temp;
       }
       answer[i] = answer[j]+array[i];
     }
    }
   }
  System.out.println(max);
  }
}
