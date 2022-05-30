class Solution {
    public int maxProfit(int[] prices) {
    int maxProfit  = 0;
       int buyingDay=0,sellingDay=1;
       while(sellingDay<prices.length){
           if(prices[buyingDay]<prices[sellingDay]){
               maxProfit = Math.max(maxProfit,prices[sellingDay]-prices[buyingDay]);
           }else{
               buyingDay=sellingDay;
           }
           sellingDay++;
       }
       return maxProfit;
}
}