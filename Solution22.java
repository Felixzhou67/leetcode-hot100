import java.util.ArrayList;
import java.util.List;

/*
ClassName:Solution22
@Author Zhou
@Create 2026/8/21 16:30
*/
public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        StringBuffer path=new StringBuffer();

        backtrace(res,path,0,0,n);

        return res;
    }

    private void backtrace(List<String> res,StringBuffer path,int left,int right,int n){
        if(left<right)return;

        if(left==n&&right==n){
            res.add(path.toString());
            return;
        }

        if(left<n)
        {
            path.append('(');
            backtrace(res,path,left+1,right,n);
            path.deleteCharAt(path.length()-1);
        }

        if(right<left){
            path.append(')');
            backtrace(res,path,left,right+1,n);
            path.deleteCharAt(path.length()-1);
        }

    }

}
