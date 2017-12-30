//find sum of any four numbers and check if it is equal to given sum or not. print 1 if you find four numbers else print 0
import java.util.*;

class FourConSum{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter number of items");
   int noi = sc.nextInt();
   int items[] = new int[noi];
   System.out.println("Enter items");
   for(int i=0;i<noi;i++){
    items[i] = sc.nextInt();
  }
  System.out.println("enter sum");
  int flag = sc.nextInt();
  int check =0 ;
  for(int i=0; i<noi-3;i++){
    for(int j=i+1;j<noi-2;j++){
     for(int k=j+1;k<noi-1;k++){
      for(int l=k+1;l<noi;l++){
       int sum = items[i]+items[j]+items[k]+items[l];
       if(sum == flag){
        check = 1;
        break;
      }
     }
    }
   }
  }
 System.out.println(check);
 }
}
