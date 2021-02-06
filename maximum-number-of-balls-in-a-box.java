// https://leetcode.com/contest/weekly-contest-226/problems/maximum-number-of-balls-in-a-box/
// tc -> n, sc-> n

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        int n = highLimit - lowLimit + 1;
        
        int max = Integer.MIN_VALUE;
        
        for(; lowLimit <= highLimit; lowLimit++){
            
            int sum = getSum(lowLimit);            
            
            freqMap.put(sum, freqMap.getOrDefault(sum, 0)+1);
            
            max = Math.max(max, freqMap.get(sum));
        }
        
        return max;
    }
    
    private int getSum(int n){
        int sum = 0;
        
        while(n > 0){
            int mod = n%10;
            
            sum += mod;
            
            n /= 10;            
        }
        
        return sum;
    }
}
