import java.util.Stack;
// Time complexity O(n) and Space complexity O(n)
public class reversePolishNotationRecursive {
    public static int rpnr(String[] expression) {
        return evaluateRpn(0, expression, new Stack<>());
    }

    private static int evaluateRpn(int idx, String[] expression, Stack<Integer> stack) {
        if (idx >= expression.length) {
            return stack.peek(); 
        }
        String token = expression[idx];
        if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
            int operand2 = stack.pop();
            int operand1 = stack.pop();
            int result;
            switch (token) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + token);
            }
            stack.push(result);
        } else {
            stack.push(Integer.parseInt(token));
        }
        
        return evaluateRpn(idx + 1, expression, stack);
    }

    public static void main(String[] args) {
        String[] array = {"50", "3", "17", "+", "2", "-", "/"};
        int result = rpnr(array);
        System.out.println(result);
    }
}
