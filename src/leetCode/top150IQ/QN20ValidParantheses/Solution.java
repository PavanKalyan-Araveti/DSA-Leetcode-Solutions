package leetCode.top150IQ.QN20ValidParantheses;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) return false;
                else {
                    if (s.charAt(i) == ')') {
                        if (stack.peek() != '[' && stack.peek() != '{') {
                            if (stack.contains('(')) {
                                if(stack.peek() == '(') stack.pop();
                                else stack.removeElement('(');
                            }
                            else return false;
                        } else return false;
                    } else if (s.charAt(i) == ']') {
                        if (stack.peek() != '(' && stack.peek() != '{') {
                            if (stack.contains('[')) {
                                if(stack.peek() == '[') stack.pop();
                                 else stack.removeElement('[');
                            }
                            else return false;
                        } else return false;
                    } else {
                        if (stack.peek() != '[' && stack.peek() != '(') {
                            if (stack.contains('{')) {
                                if(stack.peek() == '{') stack.pop();
                                else stack.removeElement('{');
                            }
                            else return false;
                        } else return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

        public static void main (String[]args){
            String brackets = "[([]])";
            System.out.println(isValid(brackets));
        }
    }
