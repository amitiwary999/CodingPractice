/*
There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1, and each room may have some keys to access the next room. 

Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer in [0, 1, ..., N-1] where N = rooms.length.  A key rooms[i][j] = v opens the room with number v.

Initially, all the rooms start locked (except for room 0). 

You can walk back and forth between rooms freely.

Return true if and only if you can enter every room.
*/


class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int size = rooms.size();
        Set<Integer> set = new HashSet();
       int[] visit = new int[size];
        
        if(size>0){
            set.add(0);
            if(rooms.get(0).size()>0){
                visit[0] = 1;
                int visitPos=rooms.get(0).get(0);
                Queue<Integer> queue = new LinkedList();
                queue.addAll(rooms.get(0));
                 int found = 0;
                visitPos = queue.poll();
                while(true){
                    found = 0;
                    set.add(visitPos);
                    visit[visitPos] = 1;
                    List<Integer> lists = rooms.get(visitPos);
                    int i;
                    for(i=0; i<lists.size(); i++){
                        if(visit[lists.get(i)] != 1){
                            visitPos = lists.get(i);
                            found = 1;
                            break;
                        }
                    }
                    if(i<lists.size()-1){
                        queue.addAll(lists.subList(i+1, lists.size()));
                    }
                    if(set.size() == size){
                        return true;
                    }else if(found == 0){
                        if(queue.isEmpty()){
                            return false;
                        }else{
                            visitPos = queue.poll();
                        }
                    }
                }
            }else{
                if(set.size() == size){
                    return true;
                }else{
                   return false; 
                }
                
            }
        }else{
            return false;
        }
    }
}
