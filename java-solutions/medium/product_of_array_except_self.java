class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int curr = 1;
        for(int i=0;i<n;i++){
            if (i>0) curr = curr * nums[i-1];
            res[i] = curr;
        }
        curr = 1;
        for(int i=n-1;i>=0;i--){
            if (i<n-1) curr = curr * nums[i+1];
            res[i] *= curr;
        }
        return res;
    }
}