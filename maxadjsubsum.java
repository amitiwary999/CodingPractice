import java.util.*;

class MaxAdjSubSum{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of items");
  int noi = sc.nextInt();
  int evenSum=0,oddSum=0,evenSum1=0,oddSum1=0,maxOdd=0,maxEven=0;
  System.out.println("Enter items");
  int arr[] = new int[noi];
  for(int i=0;i<noi;i++){
   arr[i] = sc.nextInt();
   if(i==0){
     oddSum1 = arr[i];
     evenSum=arr[i];
   }else if(i == 1){
      evenSum1=arr[i];
      oddSum=arr[i];
   }else if(i==2){
    evenSum=evenSum+arr[i];
   }else if(i>=3){
     if(i%2==0){
       evenSum = evenSum+arr[i];
       evenSum1=evenSum1+arr[i];
       maxEven=(evenSum>evenSum1)?evenSum:evenSum1;
    }else{
      oddSum=oddSum+arr[i];
      oddSum1=oddSum1+arr[i];
      maxOdd=(oddSum>oddSum1)?oddSum:oddSum1;
    }
   }
  }
 System.out.println(maxOdd>maxEven?maxOdd:maxEven);
 }
}
