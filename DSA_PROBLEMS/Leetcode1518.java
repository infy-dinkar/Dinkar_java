public class Leetcode1518 {
    class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while (numBottles >= numExchange) {
            int x = numBottles / numExchange;
            ans += x;
            int y = numBottles % numExchange;
            numBottles = x + y;
        }
        return ans;
    }
}

    
}
