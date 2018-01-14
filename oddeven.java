import java.util.*;

class OddEven{


 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int noi = sc.nextInt();
  int i = 0;
  sc.nextLine();
  String numbers = sc.nextLine();
  String[] number = numbers.split(" ");
  int oddNumber=0;
  int evenNumber=0;
  int oddIndex = -1,evenIndex = -1;
  while(i<noi){
   int num = Integer.parseInt(number[i]);
   if((i+1)%2 == 0 && num%2 != 0){
    if(oddNumber != 0 && oddIndex != -1){
     number[i] = String.valueOf(oddNumber);
     number[oddIndex] = String.valueOf(num); 
     oddNumber = 0;
    }
     evenNumber = num;
     evenIndex = i;
   }else if((i+1)%2 != 0 && num%2 == 0){
    if(evenNumber != 0 && evenIndex != -1){
     number[i] = String.valueOf(evenNumber);
     number[evenIndex] = String.valueOf(num);
     evenNumber = 0;
    }
     oddNumber = num;
     oddIndex = i;
   }
  i++;
  }
  for(int j=0;j<noi;j++){
   System.out.println(number[j]); 
  }
 }
}
