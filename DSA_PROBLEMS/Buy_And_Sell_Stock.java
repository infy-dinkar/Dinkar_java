package DSA_PROBLEMS;

public class Buy_And_Sell_Stock {
    
        public int maxProfit(int[] prices) {
            int n=prices.length;
            int max_profit=0;
            int max_right=prices[n-1];
            for(int i=n-2;i>=0;i--){
               int profit=max_right-prices[i];
               if(profit>max_profit){
                max_profit=profit;
               }
               if(prices[i]>max_right){
                max_right=prices[i];
               }
            }
            return max_profit;
            
        }
        
    }
    

