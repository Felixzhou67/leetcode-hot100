import java.util.Stack;

/*
ClassName:Solution739
@Author Zhou
@Create 2026/8/28 11:41
*/
public class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int answer[]=new int[temperatures.length];
        Stack<Integer> unsolStack=new Stack<>();
        unsolStack.push(0);
        for(int i=1;i<temperatures.length;i++){
            while(!unsolStack.empty()&&i<temperatures.length&&temperatures[i]>temperatures[unsolStack.peek()]){
                answer[unsolStack.peek()]=i-unsolStack.peek();
                unsolStack.pop();
            }
            unsolStack.push(i);
        }
        return answer;
    }
}
