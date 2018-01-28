import java.util.*;

class RemoveSpace{
 
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the sentence");
   String sentence = sc.nextLine();
   int size = sc.nextInt();
   ArrayList<String> words = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
   int length = sentence.length();
   int flag = size-length;
   for(int i=0;i<words.size();i++){
     if(flag > 0){
       System.out.print(words.get(i)+"%20");
       flag--;
     }else{
       System.out.print(words.get(i)+" ");
     }
   }
  if(flag > 0){
   System.out.print("%20");
  }
 }
}
