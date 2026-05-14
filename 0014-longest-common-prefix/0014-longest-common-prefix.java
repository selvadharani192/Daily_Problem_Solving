class Solution {
    public String longestCommonPrefix(String[] strs) {
          if (strs == null || strs.length == 0) {
            return "";
        }
        String common="";
        for(int i=0;;i++){
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
       
    }
}