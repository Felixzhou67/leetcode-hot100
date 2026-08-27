import java.util.Stack;

/*
ClassName:Solution155
@Author Zhou
@Create 2026/8/27 11:25
*/
public class Solution155 {
    class MinStack {
        Stack<Integer> stack;
        Stack<Integer> minstack;
        public MinStack() {
            this.stack=new Stack<>();
            this.minstack=new Stack<>();
        }
        int min=Integer.MAX_VALUE;
        public void push(int value) {
            stack.push(value);
            if(value<=min){
                min=value;
                minstack.push(min);
            }
        }

        public void pop() {
            int value = stack.pop();
            if(value==minstack.peek()){
                minstack.pop();
            }
            if (minstack.isEmpty()) {
                min = Integer.MAX_VALUE;
            } else {
                min = minstack.peek();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minstack.peek();
        }
    }
}
