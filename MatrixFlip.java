import java.util.*;

class MatrixFlip{

  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter number of test cases");
   int testCase = sc.nextInt();
   while(testCase-- > 0){
    System.out.println("Enter number of rows, columns, and number of times need to flip matrix left side");
    int m = sc.nextInt();
    int n = sc.nextInt();
    int k = sc.nextInt();
    int size = m*n;
    int[] arr = new int[size];
    int[] arrFlip = new int[size];
    int flag = 0; 
    System.out.println("Enter elements");
    for(int i=0;i<size;i++){
     arr[i] = sc.nextInt();
    }
    switch(k%4){
     case 0:
       for(int i=0;i<size;i++){
        arrFlip[flag++] = arr[i];
       }
      break;
     case 1:
       for(int i = m-1;i>=0;i--){
        for(int j=i;j<size;j=j+m){
         arrFlip[flag++] = arr[j];
       }  
      } 
      break;
     case 2:
       for(int i=size-1;i>=0;i--){
        arrFlip[flag++] = arr[i];
       }
      break;
     case 3:
      for(int i=size-m;i<size;i++){
        for(int j=i;j>=0;j=j-m){
         arrFlip[flag++] = arr[j];
       }
     }
    }
     for(int i=0;i<size;i++){
      System.out.print(arrFlip[i]+" ");
    }
   }
  }
}
