import java.util.*;

class EvalExp{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter both expression");
   String exp1 = sc.nextLine();
   //sc.nextLine();
   String exp2 = sc.nextLine();
   String value1="",value2="";
   HashMap<Character, String> map = new HashMap();
   char[] alpha = new char[]{'#','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
   ArrayList<Character> check = new ArrayList();
   for(int i=0;i<exp1.length();i++){
    if(exp1.charAt(i) != '-' && exp1.charAt(i) != '+' && exp1.charAt(i) != '(' && exp1.charAt(i) != ')'){
      value1=value1+exp1.charAt(i);
    }
   }
   for(int i=0;i<exp2.length();i++){
    if(exp2.charAt(i) != '-' && exp2.charAt(i) != '+' && exp2.charAt(i) != '(' && exp2.charAt(i) != ')'){
      value2=value2+exp2.charAt(i);
    }
   }
   for(int i=0;i<value1.length();i++){
      if(!check.contains(value1.charAt(i))){
        check.add(value1.charAt(i));  
      }
   } 
   for(int i=0;i<value2.length();i++){
      if(!check.contains(value2.charAt(i))){
        check.add(value2.charAt(i));  
      }
   }
   for(int i=1;i<=26;i++){
    map.put(alpha[i], Integer.toString(i));
   } 
   for(int i=0;i<check.size();i++){
    exp1 = exp1.replace(Character.toString(check.get(i)), map.get(check.get(i)));
    exp2 = exp2.replace(Character.toString(check.get(i)), map.get(check.get(i)));
   }
   System.out.println(exp1+ " "+exp2);
  }
}
