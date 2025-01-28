package DSA_PROBLEMS;

import java.util.ArrayList;
import java.util.List;

public class SubsetsLeetcode78 {
    class Solution {
    public List<List<Integer>> subsets(int[] nums) {

    List<List<Integer>> result=new ArrayList<>();
    ArrayList<Integer> li=new ArrayList<>();
    subset(nums,0,nums.length,li,result);
    return result;


        
    }


    private void subset(int[] arr,int i,int l,ArrayList<Integer> li,List<List<Integer>> result){

        if(i==l){
            result.add(new ArrayList<>(li));
            return;
        }


        li.add(arr[i]);
        subset(arr,i+1,l,li,result);

        li.remove(li.size() - 1);

        subset(arr,i+1,l,li,result);


    }
}
    
}
