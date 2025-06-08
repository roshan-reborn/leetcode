class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] addedIntervals = new int[intervals.length+1][];
        for (int i = 0; i < intervals.length; i++){
            addedIntervals[i] = intervals[i];
        }
        addedIntervals[intervals.length] = newInterval;
        Arrays.sort(addedIntervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> merged = new ArrayList<>();
        for(int[] interval: addedIntervals){
            if (merged.isEmpty() || merged.get(merged.size()-1)[1]<interval[0]){
                merged.add(interval);
            }else {
                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}