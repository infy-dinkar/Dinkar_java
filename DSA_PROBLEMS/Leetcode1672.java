public class Leetcode1672 {
    class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich=Integer.MIN_VALUE;
        int sum=0;
        int rows=accounts.length;
        int cols=accounts[0].length;
        for(int i=0;i<rows;i++){
            sum=0;
            for(int j=0;j<cols;j++){
                sum+=accounts[i][j];
            }
            if(sum>rich){
                rich =sum;
            }
        }

        return rich;
    }
}
}
