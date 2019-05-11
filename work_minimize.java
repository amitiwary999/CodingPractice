import java.util.*;

class MaxWork{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of works");
     int now = sc.nextInt();
     System.out.println("Enter start and end time of work");
     int startTime[] = new int[now];
     int endTime[] = new int[now];
     
    for(int i=0; i<now; i++){
      int s = sc.nextInt();
      int e = sc.nextInt();
   
     startTime[i] = s;
     endTime[i] = e;
    }

   
   for(int i=0; i<now-1; i++){
     int timeEnd = endTime[i];
     int timeStart = startTime[i];
     int flag = i;
     int temp = endTime[i];
     for(int j=i+1; j<now; j++){
      if(temp > endTime[j]){
        temp = endTime[j];
        flag = j;
      }
    }
    int test = endTime[i];
    endTime[i] = endTime[flag];
    startTime[i] = startTime[flag];
    endTime[flag] = timeEnd;
    startTime[flag] = timeStart;
   } 

   int incArray = endTime[0];
   int ans = 1;
   for(int i=1;i<now;i++){
     if(startTime[i] >= incArray){
       incArray = endTime[i];
       ans++;
    }
   }
   System.out.println("ans is"+ans);
  }
}
