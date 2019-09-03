import java.util.*;

class PartionPalin{

 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String input = sc.next();
   char[] inputCharArray = input.toCharArray();
   int size = inputCharArray.length;
   int[][] temp = new int[size][size];
   int[] cut = new int[size];
   for(int i=0;i<size;i++){
    temp[i][i]=1;
    cut[i]=Integer.MAX_VALUE;
   }

   for(int i=2;i<=size;i++){
    for(int j=0;j<=size-i;j++){
     int flag= j+i-1;
     if(inputCharArray[j] == inputCharArray[flag]){
       if(i==2){
         temp[j][flag]=1;
       }else{
        temp[j][flag]=temp[j+1][flag-1];
       }
     }
    }
   }

  for(int i=0;i<size;i++){
   if(temp[0][i]==1){
    cut[i]=0;
   }else{
    for(int j=0;j<i;j++){
     if((temp[j+1][i]==1) && (cut[j]+1<cut[i])){
      cut[i]=cut[j]+1;
     }
    }
   }
  }

 System.out.println(cut[size-1]);
 }
}
