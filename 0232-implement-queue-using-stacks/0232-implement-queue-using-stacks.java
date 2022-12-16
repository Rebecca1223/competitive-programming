import java.util.*;

class MyQueue {
    public Stack<Integer> obj;
    public Stack<Integer> temp = new Stack<>();
    public MyQueue() {
        obj = new Stack<>();
    }
    
    public void push(int x) {
        obj.push(x);
    }
    
    public int pop() {
        while(!obj.empty()) {
            temp.push(obj.pop());
        }
        int value = temp.pop();
        while (!temp.empty()) {
            obj.push(temp.pop());
        }
        return value;
    }
    
    public int peek() {
        while(!obj.empty()) {
            temp.push(obj.pop());
        }
        int value = temp.peek();
        while (!temp.empty()) {
            obj.push(temp.pop());
        }
        return value;
    }
    
    public boolean empty() {
        return obj.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */