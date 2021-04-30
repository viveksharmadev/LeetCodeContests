// https://leetcode.com/contest/weekly-contest-235/problems/truncate-sentence/
class Solution {
    // tc -> n, sc-> n
    public String truncateSentence(String s, int k) {
        String[] arr = s.split("\\s");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<k; i++){
            sb.append(arr[i]).append(" ");
        }
        
        return sb.toString().trim();
    }
}
