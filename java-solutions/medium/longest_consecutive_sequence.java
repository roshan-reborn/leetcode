class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        Arrays.sort(nums);
        int currCount = 1;
        int maxCount = 1;
        for (int i=1; i<nums.length; i++){
            if (nums[i] - nums[i-1] == 1){
                currCount += 1;
                maxCount = Math.max(currCount,maxCount);
            } else if(nums[i]==nums[i-1]){
                continue;
            }else{
                currCount = 1;
            }
        }
        return maxCount;
    }
}