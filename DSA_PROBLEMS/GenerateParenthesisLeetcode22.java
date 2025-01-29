import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesisLeetcode22 {

    class Solution {
    public List<String> generateParenthesis(int N) {
        List<String> result = new ArrayList<>();
        generateAll(0, 0, "", N, result);
        return result;
    }

    private void generateAll(int ob, int cb, String s, int N, List<String> result) {
        if (s.length() == 2 * N) {
            result.add(s);
            return;
        }
        
        if (ob < N) {
            generateAll(ob + 1, cb, s + "(", N, result);
        }
        
        if (cb < ob) {
            generateAll(ob, cb + 1, s + ")", N, result);
        }
    }
}

    
}
