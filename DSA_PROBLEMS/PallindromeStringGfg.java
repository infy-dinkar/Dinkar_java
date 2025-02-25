public class PallindromeStringGfg {
    class Solution {
        boolean isPalindrome(String s) {
            int n=s.length();
            int flag=0;
            int i=0;
            int j=n-1;
            while(i<=j){
                if(s.charAt(i)!=s.charAt(j)){
                    flag=1;
                }
                
                i++;
                j--;
                
            }
            
            if(flag==1){
                return false;
            }
            
            return true;
        }
    }
    
    
}
