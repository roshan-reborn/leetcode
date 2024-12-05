class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            Integer lastIndex = map.put(nums[i],i);
            if (lastIndex != null && (i-lastIndex) <=k){
                return true;
            }
        }
        return false;
    }
}