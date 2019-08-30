import java.util.*;

class MinInsert{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the string");
   String input = sc.next();
   char[] charArray = input.toCharArray();
   int size = charArray.length;
   int[][] temp = new int[size][size];
   for(int i=1;i<size;i++){
      int j=0;
      int h=i;
    for(;h<size;j++,h++){
     if(charArray[j] == charArray[h]){
       temp[j][h] = temp[j+1][h-1];
     }else{
       temp[j][h] = min(temp[j+1][h], temp[j][h-1])+1;
     }
    }
   }
  System.out.println(temp[0][size-1]);
  }
 static int min(int a, int b){
   return (a>b)?b:a;
 }
}
