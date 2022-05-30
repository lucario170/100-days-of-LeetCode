class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit  = 0;
       int buyingDay=0,sellingDay=1;
       while(sellingDay<prices.length){
          int profit = prices[sellingDay]-prices[buyingDay];
           if(profit>0){
               maxProfit+= profit;
               sellingDay++; buyingDay++;
           }else{
               buyingDay=sellingDay;
               sellingDay=buyingDay+1;
           }
           
       }
       return maxProfit; 
    }
}