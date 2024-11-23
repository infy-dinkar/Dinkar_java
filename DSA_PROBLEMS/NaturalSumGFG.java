package DSA_PROBLEMS;

public class NaturalSumGFG {
    class Solution
{
    public int find(int n)
    {
        if (n==1) return 1;
        for(int i=1;i<=n;i++){
            if((i*(i+1)/2)==n) return i;
}
 return -1;
    }
}
    
}
