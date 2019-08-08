/*
Given a 2D binary matrix filled with 0’s and 1’s, find the largest rectangle containing all ones and return its area.
*/


public class Solution {
	public int maximalRectangle(ArrayList<ArrayList<Integer>> a) {
	    int[][] map2 = new int[a.size()][a.get(0).size()];
	    for (int[] row:map2){
	        Arrays.fill(row,0);
	    }
	    int max_area = -1;
	    for (int row = 0 ; row <a.size(); row++){
    	    for (int col = 0 ; col <a.get(0).size(); col++){
                if (row == 0 || map2[row-1][col] == 0 || a.get(row).get(col) == 0){
                    map2[row][col] = a.get(row).get(col);
                }else{
                    if (a.get(row).get(col)==1){
                        map2[row][col] = map2[row-1][col]+1;
                    }
                }
    	    }
    	    max_area = Math.max(max_area,maxArea(map2[row]));
	    }
	    //System.out.println(maxArea(map2[a.size()-1]));
	   
	    return max_area;
	}
	
	public int maxArea(int[] array){
	    Stack<Integer> st = new Stack<Integer>();
	    int maxArea = -1;
	    int i = 0;
	    while (i < array.length){
	        if (st.isEmpty() || (array[i] >=array[st.peek()])){
	            st.push(i);
	            i++;
	        } else{
	                int element = st.pop();
	                int area = -1;
	                if (st.isEmpty()){
	                    area = array[element] * i;
	                } else{
	                    area= array[element] *(i-st.peek()-1);
	                }
	                
	                maxArea = Math.max(area,maxArea);
	            
	        }
	    }
	    while(!st.isEmpty()){
	        int element = st.pop();
            int area = -1;
            if (st.isEmpty()){
                area = array[element] * i;
            } else{
                area= array[element] *(i-st.peek()-1);
            }
            
            maxArea = Math.max(area,maxArea);
	    }
	    return maxArea;
	}
}

