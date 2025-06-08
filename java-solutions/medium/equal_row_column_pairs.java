class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> map = new HashMap<>();
        int col = grid.length;
        int row = grid.length;
        for(int i=0; i<row; i++){
            String res = "";
            for (int j=0; j<col; j++){
                res += "-" + grid[i][j];
            }  
            map.put(res, map.getOrDefault(res,0)+1);
        }
        int count=0;
        for(int j=0; j<col; j++){
            String res = "";
            for (int i=0; i<row; i++){
                res += "-" + grid[i][j];
            }
            count += map.getOrDefault(res,0);
        }
        return count;
    }
}