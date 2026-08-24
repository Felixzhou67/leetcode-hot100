import java.util.ArrayList;
import java.util.List;

/*
ClassName:Solution46
@Author Zhou
@Create 2026/8/19 11:26
*/
public class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();

        backtrack(nums,res,path);

        return res;
    }

    private void backtrack(int[] nums,List<List<Integer>> res,List<Integer> path){


        if(path.size()==nums.length)
        {
            res.add(new ArrayList<>(path));
            return;
        }

        for(int num:nums){
            if (path.contains(num))
                continue;

            path.add(num);

            backtrack(nums,res,path);

            path.remove(path.size()-1);
        }


    }
}
