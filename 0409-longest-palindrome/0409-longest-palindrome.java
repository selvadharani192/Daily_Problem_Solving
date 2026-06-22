class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        for(char chr:s.toCharArray()){
            freq[chr-'0']++;
        }
        int len=0;
        boolean odd=false;
        for(int l:freq){
            if(l%2==0){
             len+=l;
            }
            else{
odd = true;
len+=l-1;
            }
        }
        if(odd){
            len+=1;
        }
        return len;
    }
}