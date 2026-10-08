import java.util.HashMap;

/*
ClassName:Solution136
@Author Zhou
@Create 2026/10/8 11:41
*/
public class Solution136 {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int res=nums[0];
        for (int i = 0; i < nums.length; i++) {
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i])==1){
                res=nums[i];
            }
        }
        return res;
    }
}
