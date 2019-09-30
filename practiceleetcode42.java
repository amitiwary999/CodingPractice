class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        
        int[] start = {0, 0};
        
        while(true) {
            if(start[0] == target[0] && start[1] == target[1]) return true;  
            for(int[] ghost : ghosts) {
                update(target, ghost);
                if(ghost[0] == target[0] && ghost[1] == target[1]) return false;
            }
            update(target, start);
        }
        
    }
    
    private void update(int[] target, int[] update) {
        if(target[0] > update[0]) {
            update[0]++;
        } else if(target[0] < update[0]) {
            update[0]--;
        }
        else if(target[1] > update[1]) {
            update[1]++;
        } else if(target[1] < update[1]) {
            update[1]--;
        }
    }
}
