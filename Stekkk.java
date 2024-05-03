import java.util.Stack;

public class Stekkk {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(9);
        System.out.println("Максимальное значение в стеке: " + stack.max()); // Ожидаем 7
        stack.pop();
        System.out.println("Максимальное значение в стеке после pop(): " + stack.max()); // Ожидаем 5
    }

    static class MyStack {
        Stack<Integer> stackInt = new Stack<>();
        Stack<Integer> maxInt = new Stack<>();

        public void push(Integer value) {
            if (maxInt.isEmpty() || value >= maxInt.peek()) {
                maxInt.push(value);
            }
            stackInt.push(value);
        }

        public Integer pop() {
            if (!maxInt.isEmpty() && maxInt.peek().equals(stackInt.peek())) {
                maxInt.pop();
            }
            return stackInt.pop();
        }

        public Integer max() {
            if (maxInt.isEmpty()) {
                throw new IllegalStateException("Стек пуст");
            }
            return maxInt.peek();
        }
    }
}
