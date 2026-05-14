class Solution {
    public String longestCommonPrefix(String[] strs) {
          String common="";
          if (strs == null || strs.length == 0) {
            return common;
        }
        for(int i=0;i<strs[0].length();i++){
            char c='0';
        if(i<strs[0].length()){
            c=strs[0].charAt(i);
        }
        for(String str:strs){
            if(i>=str.length()){
                return common;
            }
            if(str.charAt(i)!=c){
               return common;
            }
          
        }
common+=c;
        }
       return common;
    }
}