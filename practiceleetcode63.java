/*
You are given a series of video clips from a sporting event that lasted T seconds.  These video clips can be overlapping with each other and have varied lengths.

Each video clip clips[i] is an interval: it starts at time clips[i][0] and ends at time clips[i][1].  We can cut these clips into segments freely: for example, a clip [0, 7] can be cut into segments [0, 1] + [1, 3] + [3, 7].

Return the minimum number of clips needed so that we can cut the clips into segments that cover the entire sporting event ([0, T]).  If the task is impossible, return -1.
*/
class Solution {
public int videoStitching(int[][] clips, int T) {

    if (clips.length == 0) return -1;
    Arrays.sort(clips, (a, b) -> (a[0] - b[0]));
    if (clips[0][0] > 0) return -1; // because clips doesn't start from zero;
    
    int[] lastClip = new int[]{0, 0};
    int count = 0, i = 0;
    while(i < clips.length && lastClip[1] < T) {
        
        int[] nextClip = null;
        int maxEnd = 0;
        while(i < clips.length && isOverlap(lastClip, clips[i])) {
            if (maxEnd < clips[i][1]) {
                maxEnd = clips[i][1];
                nextClip = clips[i];
            }
            i++;
        }
        
        
        if (nextClip == null || nextClip[1] <= lastClip[1]) return -1;
        // because the length of clips couldn't increase, so They never have endTime >= T
        
        lastClip[1] = nextClip[1];
        count++;
    }
    
    return lastClip[1] >= T ? count : -1;
}

private boolean isOverlap(int[] clip1, int[] clip2) {
    return clip1[1] >= clip2[0];
}
}


