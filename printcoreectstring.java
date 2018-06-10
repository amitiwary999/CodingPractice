import java.util.*;
 
class PrintCorrectString {
   public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of string and sum");
        int size = sc.nextInt();
        int sum = sc.nextInt();
        char[] array = new char[size];
        Arrays.fill(array, 'a');
        int flag = size;
        int total = sum;
        int beforeAns = total - flag;
        String ans = "";
        for(int i=size-1; i>=0; i--){
         if(beforeAns>26){
           array[i] = 'z';
           beforeAns = (beforeAns - 26)+1;
           ans = array[i]+ans;
         }else if(beforeAns == 26){
           array[i] = (char)(array[i]+25);
           beforeAns = beforeAns - 25;
           ans = array[i]+ans;
        }else if(beforeAns > 0){
           array[i] = (char)(array[i]+beforeAns);
           beforeAns = 0; 
           ans = array[i]+ans;
        }else if(beforeAns == 0){
           ans = array[i] + ans;
        }
       }
     System.out.println(ans);
    }
}
