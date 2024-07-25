import java.util.Stack;

// Time complexity O(n) and Space complexity O(n)
public class reversePolishNotationRecursive {

    public static int rpnRecursive(String[] expression) {
        return _rpnRecursive(0, expression, new Stack<>());
    }

    private static int _rpnRecursive(int idx, String[] expression, Stack<Integer> stack) {
        if (idx >= expression.length) {
            return stack.peek();  // Final result should be the only element in the stack
        }

        String token = expression[idx];

        if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
            int operand2 = stack.pop();
            int operand1 = stack.pop();
            int result;

            if ("+".equals(token)) {
                result = operand1 + operand2;
            } else if ("-".equals(token)) {
                result = operand1 - operand2;
            } else if ("*".equals(token)) {
                result = operand1 * operand2;
            } else {  // "/".equals(token)
                result = operand1 / operand2;
            }

            stack.push(result);
        } else {
            stack.push(Integer.parseInt(token));
        }

        return _rpnRecursive(idx + 1, expression, stack);
    }

    public static void main(String[] args) {
        String[] array = {"50", "3", "17", "+", "2", "-", "/"};
        int result = rpnRecursive(array);
        System.out.println(result); // Output: 2
    }
}
