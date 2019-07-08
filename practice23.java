public class Solution {
    public int countInversions(ArrayList<Integer> A) {
        int size = A.size();
        int[] temp = new int[size];
        return _mergeSort(A, temp, 0, size-1);
    }
    
       static int _mergeSort(ArrayList<Integer> A, int temp[], int left, int right) 
    { 
        int mid, inv_count = 0; 
        if (right > left) { 
            mid = (right + left) / 2; 
            inv_count = _mergeSort(A, temp, left, mid); 
            inv_count += _mergeSort(A, temp, mid + 1, right); 
  
            inv_count += merge(A, temp, left, mid + 1, right); 
        } 
        return inv_count; 
    } 
  
    static int merge(ArrayList<Integer> A, int temp[], int left, int mid, int right) 
    { 
        int i, j, k; 
        int inv_count = 0; 
  
        i = left;
        j = mid; 
        k = left; 
        while ((i <= mid - 1) && (j <= right)) { 
            if (A.get(i) <= A.get(j)) { 
                temp[k++] = A.get(i++); 
            } 
            else { 
                temp[k++] = A.get(j++); 
                inv_count = inv_count + (mid - i); 
            } 
        } 
 
        while (i <= mid - 1) 
            temp[k++] = A.get(i++); 
        while (j <= right) 
            temp[k++] = A.get(j++); 
        for (i = left; i <= right; i++)
            A.set(i, temp[i]);
  
        return inv_count; 
    }
}

