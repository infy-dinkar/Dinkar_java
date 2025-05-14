public class NumberOf1BitGfg {
        static int setBits(int n) {
        int c=0;
        while(n!=0){
            if((n&1)!=0){
                c++;
            }
            n=n>>1;
        
            
        }
        return c;
    }
}
    

