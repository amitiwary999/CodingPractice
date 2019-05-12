import java.util.*;

class TwoSortedArray{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter first array size");
  int fSize = sc.nextInt();

  System.out.println("Enter second array size");
  int sSize = sc.nextInt();

  int[] firstArray = new int[fSize];
  int[] secondArray = new int[sSize];

  System.out.println("Enter first array elements");
  for(int i=0; i<fSize; i++){
   firstArray[i] = sc.nextInt();
  }

  System.out.println("Enter second array elements");
  for(int i=0; i<sSize; i++){
   secondArray[i] = sc.nextInt();
  }

  int flag = 0;
  int finalArrayPos = 0;
  int finalArray[] = new int[fSize+sSize];

  for(int j=0; j<sSize; j++){
   int temp = secondArray[j];
   for(int i=flag; i<fSize; i++){
     if(firstArray[i] < temp){
       finalArray[finalArrayPos] = firstArray[i];
       finalArrayPos++;
    }else{
      finalArray[finalArrayPos] = temp;
      flag = i;
      finalArrayPos++;
      break;
    }
   }
  }

  for(int i=0;i<fSize+sSize; i++){
    System.out.println("ans "+finalArray[i]);
  }
 } 

}
