import java.util.Stack;

/*
ClassName:solution
@Author Zhou
@Create 2026/10/28 16:35
*/
public class Solution20 {
    public static boolean isValid(String s) {
        Stack<Character> ss=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
            {
                ss.push(s.charAt(i));
            }else{
                if(!ss.isEmpty()) {
                    if (s.charAt(i) == ')') {
                        if (ss.peek() != '(') return false;
                        else ss.pop();
                    } else if (s.charAt(i) == ']') {
                        if (ss.peek() != '[') return false;
                        else ss.pop();
                    } else {
                        if (ss.peek() != '{') return false;
                        else ss.pop();
                    }
                }else
                {
                    return false;
                }
            }
        }
        if (!ss.isEmpty()) return false;
        return true;
    }

    public static void main(String[] args) {
        String s = "]";
        System.out.println(isValid(s));
    }

}



