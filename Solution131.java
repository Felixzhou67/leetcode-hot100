import java.util.ArrayList;
import java.util.List;

/*
ClassName:Solution131
@Author Zhou
@Create 2026/8/24 19:23
*/
public class Solution131 {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> path=new ArrayList<>();
        backtrace(res,path,s,0);
        return res;
    }
    public void backtrace(List<List<String>> res,List<String> path,String s,int index)
    {
        if(s.length()==index){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<s.length();i++){

            String ss=s.substring(index,i+1);

            if(!istrue(ss))continue;

            path.add(ss);

            backtrace(res,path,s,i+1);

            path.remove(path.size()-1);
        }
    }

    public boolean istrue(String a){
        if(a.length()==1)return true;
        for(int i=0;i<a.length()/2;i++)
        {
            if(a.charAt(i)!=a.charAt(a.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
}
