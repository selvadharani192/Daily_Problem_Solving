class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int windowSize = s1.length();
         int[] frequency = new int[26];
          
        for(int i=0;i<s1.length();i++){
          frequency[s1.charAt(i)-'a']++;
        }
        int[] frequency1 = new int[26];

        for(int i=0;i<s2.length();i++){
            frequency1[s2.charAt(i)-'a']++;
            if(i>=windowSize){
           frequency1[s2.charAt(i-windowSize)-'a']--;
            }
           if(matches(frequency1,frequency)){
            return true;
           }
        }
        return false;
    }

    public boolean matches(int[] frequency, int[] frequency1){
        for(int i=0;i<26;i++){
            if(frequency[i]!=frequency1[i]){
              return false;
            }
        }
        return true;
    }
}