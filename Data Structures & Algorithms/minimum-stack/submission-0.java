class MinStack {
    // private ArrayList<Integer> stack;
    private int[] stack ;
    private int size ;
    private int[] minStack;
    public MinStack() {
        stack = new int[10];
        minStack = new int[10];
        size = 0;
    }
    
   
    public void push(int val) {
    if (size == stack.length) {
        stack = Arrays.copyOf(stack, stack.length + 10);
        minStack = Arrays.copyOf(minStack, minStack.length + 10);
    }

    stack[size] = val;

    if (size == 0) {
        minStack[size] = val;
    } else {
        minStack[size] = Math.min(val, minStack[size - 1]);
    }

    size++;
    }
    public void pop() {
        size-- ;
    }
    
    public int top() {
        return stack[size -1] ;
    }
    
    
    public int getMin() {
        return minStack[size - 1];
    }
}
