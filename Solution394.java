import java.util.Stack;

/*
ClassName:Solution394
@Author Zhou
@Create 2026/8/27 16:24
*/
public class Solution394 {
    public String decodeString(String s) {
        Stack<String> strStack=new Stack<>();
        Stack<Integer> numStack=new Stack<>();
        int num=0;
        StringBuilder cur=new StringBuilder();
        for(char a:s.toCharArray()){
            if(Character.isDigit(a)){
                num=num*10+(a-'0');
            }else if(a=='['){
                numStack.push(num);
                strStack.push(cur.toString());
                num = 0;
                cur = new StringBuilder();
            }else if(a==']'){
                int count=numStack.pop();
                String previous=strStack.pop();
                StringBuilder temp=new StringBuilder(previous);

                for(int i=0;i<count;i++)
                {
                    temp.append(cur);
                }
                cur=temp;
                num=0;
            }else{
                cur.append(a);
            }
        }
        return cur.toString();
    }

    public static void main(String[] args) {
        Solution394 ss=new Solution394();
        System.out.println(ss.decodeString("100[leetcode]"));
    }

}
