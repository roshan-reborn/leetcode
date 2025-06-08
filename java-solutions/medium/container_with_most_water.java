class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while (left < right){
            int currentArea = Math.min(height[left],height[right]) * (right-left);
            maxArea = currentArea > maxArea ? currentArea : maxArea;
            if (height[left]>height[right]) right--;
            else left++;
        }
        return maxArea;
    }
}