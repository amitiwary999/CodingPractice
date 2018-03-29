import java.util.*;

class TrapWater{
 
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the numbers of bar");
  int number = sc.nextInt();
  int bars[] = new int[number];
  int leftMax[] = new int[number];
  int rightMax[] = new int[number];
  int vol = 0;
  for(int i=0;i<number;i++){
   bars[i] = sc.nextInt();
  }
   for (int i = 1; i<number; i++)
    leftMax[i] = Math.max(bars[i-1], leftMax[i-1]);
   for (int i = number-2; i>0; i--)
    rightMax[i] = Math.max(bars[i+1], rightMax[i+1]);
   for (int i = 1; i<number-1; i++){
    int min = Math.min(leftMax[i], rightMax[i]) - bars[i];
    vol += min<0?0:min;
   }
  System.out.println(vol);
 }
}
