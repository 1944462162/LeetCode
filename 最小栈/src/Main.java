/**
 * Author: wangJianBo
 * Date: 2019/10/10 9:25
 * Content:
 */

class MinStack {
    private int top;
    private int[] stack;

    /** initialize your data structure here. */
    public MinStack() {
        top = -1;
        stack = new int[10000];
    }

    public void push(int x) {
        top++;
        stack[top] = x;
    }

    public void pop() {
        top--;
    }

    public int top() {
        return stack[top];
    }

    public int getMin() {
        int minx = stack[0];
        for (int i = 0; i <= top; i++) {
            if(stack[i] < minx){
                minx = stack[i];
            }
        }
        return minx;
    }
}
public class Main {
    public static void main(String[] args) {
         MinStack obj = new MinStack();
         obj.push(-2);
         obj.push(0);
         obj.push(-3);
         int re = obj.getMin();
        System.out.println(re);
         obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
}
