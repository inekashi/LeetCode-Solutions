import java.util.Map;
import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        int high=-1;
        int who=0;
        Map <Integer,Integer> count= new HashMap<>();
        for (int i : nums){
            count.merge(i,1,Integer::sum);
        }
        for (Map.Entry<Integer,Integer>j:count.entrySet()){
            if (j.getValue()>high){
                high=j.getValue();
                who=j.getKey();

            }
        }
        return who;

    }
}