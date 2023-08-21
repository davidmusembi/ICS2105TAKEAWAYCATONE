package ICS2105TAKEAWAYCATONE;

import java.util.Stack;

public class stacknqueue {
    public static void main(String[] args) {
        // Initialize the two stacks
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        // Process q queries
        int q = 10;
        for (int i = 0; i < q; i++) {
            // Read the query type
            int type = (int) (Math.random() * 3) + 1;
            switch (type) {
                case 1:
                    // Enqueue an element into the end of the queue
                    int x = (int) (Math.random() * 100);
                    stack1.push(x);
                    System.out.println("Enqueued " + x);
                    break;
                case 2:
                    // Dequeue the element at the front of the queue
                    if (stack2.isEmpty()) {
                        while (!stack1.isEmpty())
                            stack2.push(stack1.pop());
                    }
                    if (!stack2.isEmpty()) {
                        int front = stack2.pop();
                        System.out.println("Dequeued " + front);
                    } else {
                        System.out.println("Queue is has nothing");
                    }
                    break;
                case 3:
                    // Print the element at the front of the queue
                    if (stack2.isEmpty()) {
                        while (!stack1.isEmpty())
                            stack2.push(stack1.pop());
                    }
                    if (!stack2.isEmpty()) {
                        int front = stack2.peek();
                        System.out.println("Front: " + front);
                    } else {
                        System.out.println("Queue is empty");
                    }
                    break;
            }
        }
    }
}
