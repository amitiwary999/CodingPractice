import java.util.*;

class CheckMultiple{
 public static void main(String[] args){
  Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++){
            int no = s.nextInt();
            for(int j=1;j<=no;j++){
                if(j%15 == 0){
                    System.out.println("FizzBuzz");
                }
                else if(j%3 == 0){
                    System.out.println("Fizz");
                }else if(j%5 == 0){
                    System.out.println("Buzz");
                }else{
                    System.out.println(j);
                }
            }
        }

   }
}
