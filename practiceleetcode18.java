class Solution 
{
    public List<Integer> pathInZigZagTree(int label) 
    {
        List<Integer> q = new ArrayList();
        while (label != 0)
        {
            q.add(label);
            label /= 2;
        }
        
        Collections.reverse(q);
        int base = q.size() % 2 == 0 ? 4 : 2;
        for (int i = base / 2; i < q.size(); i += 2)
        {
            int sum = base * 3 - 1;
            base = base << 2;
            q.set(i, sum - q.get(i));
        }
        
        
        return q;
    }
}
