import java.util.ArrayList;
import java.util.List;

/*
ClassName:Solution78
@Author Zhou
@Create 2026/8/19 15:56
*/
public class Solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();

        search(nums,res,path,0);

        return res;
    }

    private void search(int[] nums,List<List<Integer>> res, List<Integer> path,int cur)
    {
            res.add(new ArrayList<>(path));

            for(int i=cur;i<nums.length;i++){

                path.add(nums[i]);

                search(nums,res,path,i+1);

                path.remove(path.size()-1);

            }

    }
}
