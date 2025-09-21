class Solution {
    public int lengthOfLastWord(String s) {
        int alphabetPresent=0;
        for(int i=s.length()-1;i>-1;i--){
            if(alphabetPresent==0&&((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z'))){
               alphabetPresent=i;
            }
            if(s.charAt(i)==' '){
                if(alphabetPresent!=0){
                return alphabetPresent-i;
                }
            }
        }
        return s.trim().length();
    }
}