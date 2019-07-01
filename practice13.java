public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> ans = new ArrayList();
        String flag = "";
        for(int i=1; i<=A; i++){
            flag = "";
            if(i%15 == 0){
                flag = "FizzBuzz";
            }else if(i%3 == 0){
                flag = "Fizz";
            }else if(i%5 == 0){
                flag = "Buzz";
            }else{
               flag = String.valueOf(i); 
            }
            ans.add(flag);
        }
        return ans;
    }
}

