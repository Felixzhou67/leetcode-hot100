import java.util.ArrayList;
import java.util.List;

/*
ClassName:Solution39
@Author Zhou
@Create 2026/8/20 15:51
*/
public class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        if(candidates.length==0)return res;

        backtrace(candidates,res,path,target,0);

        return res;
    }

    private void backtrace(int[] candidates,List<List<Integer>> res,List<Integer> path ,int target,int start)
    {
        if (target < 0)return;

        if(target==0)
        {
            res.add(new ArrayList<>(path));
        }

        for(int i=start;i<candidates.length;i++){
            path.add(candidates[i]);

            backtrace(candidates,res,path,target-candidates[i],i);

            path.remove(path.size()-1);
        }
    }
}
