class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)->Integer.compare(a[1],b[1]));
        int arrow = 0;
        int lastUsedArrow = Integer.MIN_VALUE;
        for (int i=0; i<points.length; i++){
            if (arrow == 0 || points[i][0] > lastUsedArrow){
                arrow++;
                lastUsedArrow = points[i][1];
            }
        }
        return arrow;
    }
}