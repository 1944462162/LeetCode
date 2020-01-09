import java.util.Scanner;
import java.util.Stack;

/**
 * Author: wangJianBo
 * Date: 2019/8/8 16:24
 * Content:
 */
public class Main {
    public static boolean isValid(String s) {
        if(s.equals("")){
            return true;
        }
        Stack stack = new Stack(); // 初始化一个栈
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')'){
                if(stack.empty()){
                    return false;
                }
                char c = (char)stack.peek();
                if( c == '('){
                    stack.pop();
                } else{
                    stack.push(')');
                }
            }
            if(s.charAt(i) == '}'){
                if(stack.empty()){
                    return false;
                }
                char c = (char)stack.peek();
                if( c == '{'){
                    stack.pop();
                }else{
                    stack.push('}');
                }
            }
            if(s.charAt(i) == ']'){
                if(stack.empty()){
                    return false;
                }
                char c = (char)stack.peek();
                if( c == '['){
                    stack.pop();
                }else{
                    stack.push('}');
                }
            }
        }
        if (stack.empty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String string;
        Scanner in = new Scanner(System.in);
        string = in.next();
        boolean bool = isValid(string);
        System.out.println(bool);
    }
}
