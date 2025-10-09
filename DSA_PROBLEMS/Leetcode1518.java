public class Leetcode1518 {
    class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int answer = numBottles;
        while (numBottles >= numExchange) {
            int x = numBottles / numExchange;
            answer += x;
            int y = numBottles % numExchange;
            numBottles = x + y;
        }
        return answer;
    }
}

    
}
