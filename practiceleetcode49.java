/*
You are playing a simplified Pacman game. You start at the point (0, 0), and your destination is (target[0], target[1]). There are several ghosts on the map, the i-th ghost starts at (ghosts[i][0], ghosts[i][1]).

Each turn, you and all ghosts simultaneously *may* move in one of 4 cardinal directions: north, east, west, or south, going from the previous point to a new point 1 unit of distance away.

You escape if and only if you can reach the target before any ghost reaches you (for any given moves the ghosts may take.)  If you reach any square (including the target) at the same time as a ghost, it doesn't count as an escape.

Return True if and only if it is possible to escape.
*/

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
