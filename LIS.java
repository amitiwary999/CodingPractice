import java.util.*;
class LIS {

  public void calculate(int number[], int n){
  int count[] = new int[n];
  Arrays.fill(count, 1);
  int max =  1;
  for (int i=1; i<n; i++) {
   for(int j=0; j<i; j++){
     if(number[i]>number[j] && count[i] < count[j]+1){
      count[i]= count[j]+1;
     } 
   }
  }
  for(int i=0; i<n; i++) {
   if(max<count[i]){
    max = count[i];
   }
  }
  System.out.println("Length of LIS " + max);
 }
  public static void main(String args[]){
   LIS lis = new LIS();
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter how many numbers are there");
   int n = sc.nextInt();
   System.out.println("Enter numbers");
   int numbers[] = new int[n];
   for (int i=0; i<n; i++) {
     numbers[i] = sc.nextInt();
   }
   
   lis.calculate(numbers, n);
 } 
}
