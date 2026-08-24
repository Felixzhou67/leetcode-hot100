import java.util.ArrayList;
import java.util.List;

/*
ClassName:Solution17
@Author Zhou
@Create 2026/8/19 17:02
*/
public class Solution17 {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits.length()==0)return res;

        String[] map = {
                "",     // 0
                "",     // 1
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz"  // 9
        };

        StringBuilder path = new StringBuilder();

        search(digits,res,map,path,0);

        return res;
    }
    private void search(String digits,List<String> res,String[] map,StringBuilder path,int index){

        if(index==digits.length())
        {
            res.add(path.toString());
            return;
        }

        String chars=map[digits.charAt(index)-'0'];

        for(char c:chars.toCharArray()){
            path.append(c);

            search(digits,res,map,path,index+1);

            path.deleteCharAt(path.length()-1);
        }

    }
}
