/*
Given an input stream of n characters consisting only of small case alphabets the task is to find the first non repeating character each time a character is inserted to the stream.
*/

import java.util.LinkedList;
import java.util.Scanner;
import java.util.LinkedHashSet;
class NonReapeatingChar{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int testcases=input.nextInt();
        for(int j=0;j<testcases;j++) {
            int n = input.nextInt();
            LinkedHashSet<Character>hash=new LinkedHashSet<>();
            LinkedList<Character> queue=new LinkedList<>();
            for(int i=0;i<n;i++){
                char ch=input.next().charAt(0);
                if(hash.contains(ch)){
                    if(queue.contains(ch))
                      queue.removeFirstOccurrence(ch);
                }
                else{
                    hash.add(ch);
                    queue.addLast(ch);

                }

                if(queue.isEmpty())
                    System.out.print(-1+" ");
                else
                    System.out.print(queue.getFirst()+" ");

            }

            System.out.println();
        }

    }
}
