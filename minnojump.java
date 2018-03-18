import java.util.*;

class MinNoJump{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[] = new int[size];
    for(int i=0;i<size; i++){
     numbers[i] = sc.nextInt();
   }
   int step = 0;
   int flag = 0;
   flag = numbers[0];
   step = numbers[0];
   int ans = 1;
   if(step == 0){
     ans = 0;
   }else{
   for(int k=1;k<flag;k++){
    if(numbers[k] + k > step){
     step = numbers[k] + k;
    }
   if(--flag == 0){
     if(k > step){
       ans = -1;
       break;
     }
     ans++;
     step = step - k;
    } 
   }
  }
 System.out.println(ans);
  
 }
} 
