class Solution {
    public String minWindow(String s, String t) {
         int left = 0;
         HashMap<Character,Integer> frequency = new HashMap<Character,Integer>();
         for(int i=0;i<t.length();i++){
            frequency.put(t.charAt(i),frequency.getOrDefault(t.charAt(i),0)+1);
         }
            HashMap<Character,Integer> frequencyForWindow = new HashMap<Character,Integer>();
            
            int windowSize=0;
            int min=Integer.MAX_VALUE;
            int leftIndex=-1;
            int rightIndex=-1;
         for(int right=0;right<s.length();right++){
                if(frequency.containsKey(s.charAt(right))){
                    char c = s.charAt(right);
                    frequencyForWindow.put(c,frequencyForWindow.getOrDefault(c,0)+1);
                    if(frequency.get(c).intValue()==frequencyForWindow.get(c).intValue()){
                        windowSize +=1;

                    }
                }

                while(windowSize==frequency.size()){
                     if(min>(right-left+1)){
                            min= right -left+1;
                              leftIndex=left;
                            rightIndex=right;
                        }
                    if(frequencyForWindow.containsKey(s.charAt(left))){
                        frequencyForWindow.put(s.charAt(left),frequencyForWindow.get(s.charAt(left))-1);
                         if(frequencyForWindow.get(s.charAt(left)).intValue()<frequency.get(s.charAt(left)).intValue()){

                            windowSize -=1;
                         }
                    }
                    left++;
                }
         }
         if(leftIndex!=-1){
           return s.substring(leftIndex, leftIndex + min);
         }
         return "";
    }
}