/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) – Push element x onto stack.
pop() – Removes the element on top of the stack.
top() – Get the top element.
getMin() – Retrieve the minimum element in the stack.
Note that all the operations have to be constant time operations.
*/

class Solution {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    Solution() {
         stack = new Stack<Integer>();
         minStack = new Stack<Integer>();
         
    }
    
    public void push(int x) {
        stack.push(x);
        if(minStack.empty() || x<minStack.peek()){
            minStack.push(x);
        }
        
    }

    public void pop() {
        int e=0;
        if(!stack.empty()) {
            e = stack.pop();
            if(!minStack.empty() && e == minStack.peek()) {
               minStack.pop();
            } 
        }
        
    }

    public int top() {
        if(stack.empty()) {
            return -1;
        }
        return stack.peek();
        
    }

    public int getMin() {
        if(stack.empty() || minStack.empty()) {
            return -1;
        }
        return minStack.peek();
    }
}
