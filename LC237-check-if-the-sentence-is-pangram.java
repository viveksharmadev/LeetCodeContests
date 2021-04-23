class Solution {
    // tc -> n, sc-> 1
    public boolean checkIfPangram(String sentence) {
        int[] map = new int[26];
        
        for(int i=0; i<sentence.length(); i++){
            
            map[sentence.charAt(i)-'a']++;    
            
        }
        
       for(char c='a'; c<='z'; c++){
           
           if(map[c-'a']==0){
               return false;
           }
       }
        
        return true;
    }
}
