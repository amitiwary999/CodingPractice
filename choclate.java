import java.util.*;

class Choclate{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of station");
  int nos = sc.nextInt();
  int[] station = new int[nos];
  System.out.println("Price of each choclate");
  int price = sc.nextInt();
  System.out.println("Enter number of choclates present in different station");
  station[0] = sc.nextInt();
  int r = station[0]*price;
  int diff = 0;
  for(int i=1;i<nos;i++){
    station[i] = sc.nextInt();
    diff = diff + station[i-1]-station[i];
    if(diff<0){
      r = r+(diff*(-1)*price);
      diff = 0;
    }
  }
  System.out.println(r);
 }
}
