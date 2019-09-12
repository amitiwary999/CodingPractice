import java.util.*;
class Solution {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int size = sc.nextInt();
   int[][] p = new int[size][2];
   for(int i=0;i<size;i++){
    p[i][0]=sc.nextInt();
    p[i][1]=sc.nextInt();
   }

   int[][] ans = reconstructQueue(p);
  }
      public static int[][] reconstructQueue(int[][] people) {
    Arrays.sort(people, new Comparator<int[]>() {
      public int compare(int[] p1, int[] p2) {
        return p1[0] != p2[0] ? p2[0] - p1[0] : p1[1] - p2[1];
      }
    });
    for(int i=0;i<people.length;i++){
      System.out.println(people[i][0]+" "+people[i][1]);
    }
    List<int[]> res = new ArrayList<>();
    for (int[] p: people) {
      res.add(p[1], p);
    }
    return res.toArray(new int[people.length][]);
  }
}
