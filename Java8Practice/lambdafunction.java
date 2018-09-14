import java.util.*;
import java.time.*;

class LambdaFunction{

 public int calculation(int a, int b, Mathematics doOperation){
   ZonedDateTime now = ZonedDateTime.now( ZoneOffset.UTC );
   Instant instant = Instant.now();
System.out.println("time "+now+"   "+now.toInstant().toEpochMilli()+"   "+instant);
Calendar rightNow = Calendar.getInstance();

// offset to add since we're not UTC

long offset = rightNow.get(Calendar.ZONE_OFFSET) +
    rightNow.get(Calendar.DST_OFFSET);

long sinceMidnight = (rightNow.getTimeInMillis());

System.out.println(sinceMidnight + " milliseconds since midnight   "+now.toInstant().toEpochMilli());
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
  }
}

