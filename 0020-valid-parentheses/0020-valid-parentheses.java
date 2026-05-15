class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
            if(c=='}'||c==')'||c==']'){
                if(stack.isEmpty()){
                    return false;
                }
             if(checkPair(stack.peek(),c)){
                stack.pop();
             }
             else {return false;}
            }
            else{
           stack.push(c);
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
    public boolean checkPair(char c1,char c2){
      if(c1=='('&&c2==')'){
        return true;
      }
      else if(c1=='{'&&c2=='}'){
        return true;
      }
      else if(c1=='['&&c2==']'){
        return true;
      }
      return false;
    }
}