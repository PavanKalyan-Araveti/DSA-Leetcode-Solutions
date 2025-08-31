package leetCode.top150IQ.QN150EvaluateReversePolishNotation;

import java.util.Stack;

public class Solution {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens){
           if(!isNumber(token)){
                int a = stack.pop();
                if(token.equals("+")) stack.push(stack.pop() + a);
                else if(token.equals("-")) stack.push(stack.pop() - a);
                else if(token.equals("*")) stack.push(stack.pop() * a);
                else {
                    stack.push(stack.pop() / a);
                }
            }
            else {
                int num = Integer.valueOf(token);
                stack.push(num);
            }
        }
        return stack.peek();
    }

    private static boolean isNumber(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] input = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(input));
    }
}
