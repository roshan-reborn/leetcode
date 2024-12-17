class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int actualSum = IntStream.of(nums).sum();
        return expectedSum-actualSum;
    }
}