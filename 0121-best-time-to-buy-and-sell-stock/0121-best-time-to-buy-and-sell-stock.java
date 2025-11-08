class Solution {
    public int maxProfit(int[] prices) {
        int buyingPrice = Integer.MAX_VALUE;

        int maxProfit=0;

        for(int price:prices){
            if(price<buyingPrice){
                buyingPrice = price;
            }
          
            if(price-buyingPrice>maxProfit){
                maxProfit=price-buyingPrice;

            }
        }
   return maxProfit;
    }
}