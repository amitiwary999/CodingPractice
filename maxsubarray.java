import java.util.*;

class MaxSubArray{

 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of items");
  int no = sc.nextInt();
  System.out.println("Enter max element");
  int max = sc.nextInt(); 
  ArrayList<Integer> arrayList = new ArrayList();
  System.out.println("Enter items");
  int ans = 0;
  for(int i=0;i<no;i++){
   int item = sc.nextInt();
   if(item<=max){
    arrayList.add(item);
   }else if(arrayList.size()!=0){
     if(arrayList.contains(max)){
      ans = ans+arrayList.size(); 
    }
   arrayList.clear();
   }
  }
  if(arrayList.contains(max)){
   ans = ans+arrayList.size();
  }
 System.out.println(ans); 
 }
}
