import java.util.*;

class NextBig{

 public void sortAndFind(String str[]){
  int size = str.length;
  int min;
  int minf, max;
  String ans="";
  int arr[] = new int[size];
  ArrayList<Integer> arrList = new ArrayList<>();
  for(int i=0;i<size;i++){
    arr[i] = Integer.parseInt(str[i]);
  }
  minf = arr[0];
  max = 100001;
  for(int i=0;i<size;i++){
    min = arr[i];
    int temp;
    for(int j=i+1;j<size;j++){
     if(min>arr[j]){
      temp = arr[i];
      arr[i] = arr[j];
      min = arr[j];
      arr[j] = temp;
     }
    }
   if(minf<min && min<max){
       if(max!=100001)
         arrList.add(max);
       max = min;
   }else{
      arrList.add(min);
    }
  }
  if(max == 100001){ 
    System.out.println("Not possible");
  }else{
    ans = Integer.toString(max);
    for(int i=0;i<size-1;i++){
      ans = ans+Integer.toString(arrList.get(i));
    }
   System.out.println(ans);
  }
 }
 public static void main(String args[]){
  NextBig obj = new NextBig();
  Scanner sc = new Scanner(System.in);
  System.out.println("Number of test cases");
  int test = sc.nextInt();
  for(int i=0;i<test;i++){
    System.out.println("Enter number");
    String no = sc.next();
    String str[] = no.split("");
    obj.sortAndFind(str);
   }
  }
}
