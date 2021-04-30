class Solution {
    // tc -> n, sc -> 1
    public int arraySign(int[] nums) {
        int res = 0;
        
        int negatives = 0;
        
        for(int num : nums){
            
            if(num < 0){
                negatives++;
            }
            
            else if(num == 0){
                return 0;
            }
        }
        
        return negatives%2==0 ? 1 : -1;
    }
}
