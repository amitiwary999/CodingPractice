import java.util.*;

class ValidInvalidArray{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of elements in array");
  int size = sc.nextInt();
  sc.nextLine();
  String arrays = sc.nextLine();
  ArrayList<String> numbers = new ArrayList<String>(Arrays.asList(arrays.split(" ")));
  ArrayList<Integer> result = new ArrayList<Integer>();
  int flag = -1;
  for(int i=0;i<numbers.size();i++){
   if(numbers.get(i).equals(String.valueOf(0))){
    continue;
   }else{
    if(numbers.get(i).equals(String.valueOf(flag))){
      result.remove(new Integer(flag));
      result.add(2*flag);
      flag = -1;
    }else{
      result.add(Integer.parseInt(numbers.get(i)));
      flag = Integer.parseInt(numbers.get(i));
    }
   }
  }
  for(int i=0;i<result.size();i++){
   System.out.print(result.get(i)+" ");
  }
  for(int i=result.size();i<numbers.size();i++){
   System.out.print(0+" ");
  }
 }
}
