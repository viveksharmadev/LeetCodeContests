// https://leetcode.com/contest/weekly-contest-239/problems/minimum-distance-to-the-target-element/
class Solution {
    // tc -> n, sc-> 1
    public int getMinDistance(int[] nums, int target, int start) {
        int min = nums.length-1;
        
        for(int i=0; i<nums.length; i++){
            
            if(nums[i] == target){
                min = Math.min(min, Math.abs(i - start));
            }
        }
        
        return min;
    }
}
