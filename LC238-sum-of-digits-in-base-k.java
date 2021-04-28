class Solution {
    // tc -> n, sc-> 1
    public int sumBase(int n, int k) {
        int sum = 0;
        
        while(n > 0){
            int mod = n % k;
            
            sum += mod;
            
            n /= k;
        }   
        
        return sum;
    }
}
