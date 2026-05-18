class Solution {
    public boolean isHappy(int n) {

       while(n>9){
           int dig = n;
           int sum=0;
           while(dig>0){
            sum += ((dig)%10)*((dig)%10);
            dig=dig/10;
           }
           n=sum;
        }
        if(n==1||n==7){
            return true;
        }
        return false;
    }
}