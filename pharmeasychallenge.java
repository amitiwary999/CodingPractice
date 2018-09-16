import java.util.*;

class PharmChallenge1{

  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of test case");
     int testCase = sc.nextInt();
//another flag to check if 
     for(int i=0; i<testCase; i++){
       int nofstudent = sc.nextInt();
       sc.nextLine();
       String height = sc.nextLine();
       List<String> heights = new ArrayList<String>(Arrays.asList(height.split(" "))); 
       int first = Integer.parseInt(heights.get(0));
       int falseResult = 0;
       int breakPoint = 0;
       int firstN=0,secondN = 0;
       int largest = first;
       for(int j=1; j<heights.size(); j++){
         int smallest = Integer.parseInt(heights.get(j));
          if(smallest >=first){
           if(smallest >= largest){
             if(breakPoint == 0){
                firstN = j;
                breakPoint = 1; 
             }else if(breakPoint == 1){   
               secondN = j-1;
               breakPoint = 2; 
             }
            
             largest = smallest;
           }else{
             falseResult = 1; 
             break;
           }
          }else{
            if(breakPoint == 2){
               falseResult = 1; 
             break;
            }
          }
          first = smallest;
         System.out.println(heights.get(j));
       }
       if(falseResult == 1){
          System.out.println("-1,-1");
       }else{
         System.out.println(firstN+","+secondN);
      }
     }
  }
}
