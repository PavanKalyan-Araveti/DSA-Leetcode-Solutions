package leetCode.top150IQ.QN155MinStack;

import java.util.Stack;

/*
public class MinStack {
    private Stack<int[]> stack;

    public MinStack(){
        stack = new Stack<>();
    }

    public void push(int val){
        if(stack.isEmpty()){
            stack.push(new int[]{val,val});
        }
        else{
            int currentMin = stack.peek()[1];
            stack.push(new int[]{val, Math.min(val, currentMin)});
        }
    }

    public void pop(){
        stack.pop();
    }

    public int top(){
        return stack.peek()[0];
    }

    public int getMin(){
        return stack.peek()[1];
    }
}


 */
//space optimal
public class MinStack {
    private Stack<Long> stack;
    long min = 0;

    public MinStack(){
        stack = new Stack<>();
    }

    public void push(int val){
        if(stack.isEmpty()){
            stack.push(0L);
            min = val;
        }
        else{
            long diff = val - min;
            stack.push(diff);
            if(diff < 0) min = val;
        }
    }

    public void pop(){
        long diff = stack.pop();
        if(diff < 0)
        min = min - diff;
    }

    public int top(){
        long diff = stack.peek();
        if(diff >= 0){
            return (int)(diff + min);
        }
        else return (int)min;
    }

    public int getMin(){
        return (int)min;
    }
}