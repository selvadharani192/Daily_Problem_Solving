class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int maxLength=0;
        HashSet<Character> set = new HashSet<Character>();
        while(left<=right&&right<s.length()){
          if(set.contains(s.charAt(right))){
             while(s.charAt(left)!=s.charAt(right)){  
                             set.remove(s.charAt(left)); 
                left++;
             }
             left++;
          }
           if(maxLength<right-left){
                maxLength=right-left;
             }
          set.add(s.charAt(right));
                    right++;

        }
        return s.length()>0?maxLength+1:0;
    }
}