import java.util.*;

class StairCount{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter height of stairs");
   int height = sc.nextInt();
   int flag = height/2;
   System.out.println(flag+1);
  }
}
