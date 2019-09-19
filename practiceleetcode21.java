/*
You are driving a vehicle that has capacity empty seats initially available for passengers.  The vehicle only drives east (ie. it cannot turn around and drive west.)

Given a list of trips, trip[i] = [num_passengers, start_location, end_location] contains information about the i-th trip: the number of passengers that must be picked up, and the locations to pick them up and drop them off.  The locations are given as the number of kilometers due east from your vehicle's initial location.

Return true if and only if it is possible to pick up and drop off all passengers for all the given trips. 
*/

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int length = trips.length;
        int total=0;
        Arrays.sort(trips, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                if(o1[1]==o2[1]){
                    return o1[2]-o2[2];
                }
                return o1[1]-o2[1];
            }
        });
        
        ArrayList<ArrayList<Integer>> dist = new ArrayList();
        ArrayList<Integer> temp = new ArrayList();
        temp.add(trips[0][2]);
        temp.add(trips[0][0]);
        dist.add(temp);
        
        int travelingPassenger = trips[0][0];
        
        for(int j=1; j<length; j++){
            int passenger = trips[j][0];
            int start = trips[j][1];
            int end = trips[j][2];
            int passengerDrop=0;
            
            int count = dist.size();
            for(int i=0;i<count;i++){
                ArrayList<Integer> visited = dist.get(i);
                int visitedEnd = visited.get(0);
                
                if(start>=visitedEnd){
                    passengerDrop = passengerDrop+visited.get(1);
                }
            }
            
            int flag = travelingPassenger+passenger-passengerDrop;
            if(flag>capacity){
                return false;
            }
            
            travelingPassenger = travelingPassenger+passenger;
            ArrayList<Integer> addDist = new ArrayList();
            addDist.add(end);
            addDist.add(passenger);
            boolean res = dist.add(addDist);
            
          
        }
         return true;
    }
}

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int maxNumPassengers = 0;
        for (int r = 0; r < trips.length; r++) {
            maxNumPassengers = Math.max(maxNumPassengers, trips[r][2]);
        }
        int[] numPassengers = new int[maxNumPassengers + 1]; // Array index is the location value (start from 1).

        for (int r = 0; r < trips.length; r++) {
            for (int location = trips[r][1]; location <= trips[r][2] - 1; location++) { // Exclude drop off location.
                numPassengers[location] += trips[r][0];
            }
        }
        for (int location = 1; location < numPassengers.length; location++) {
            if (numPassengers[location] > capacity) {
                return false; // If number of passengers at any location is more than the capacity.
            }
        }
        return true;
    }
}
