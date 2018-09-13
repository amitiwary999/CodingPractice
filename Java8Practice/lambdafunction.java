import java.util.*;

class LambdaFunction{

 public int calculation(int a, int b, Mathematics doOperation){
   return doOperation.operation(a, b);
 }

 public static void main(String[] args){
  LambdaFunction lf = new LambdaFunction();
  Mathematics addition = (int a, int b) -> a+b;
  Mathematics multiply = (a, b) -> a*b;
  Mathematics division = (a, b) -> a/b;
  System.out.println("addition "+lf.calculation(12, 5, addition));
  System.out.println("multiply "+lf.calculation(12, 5, multiply));
 }
 
 interface Mathematics{
    int operation(int a, int b);
    float operation(int a, float b);
  }
}

