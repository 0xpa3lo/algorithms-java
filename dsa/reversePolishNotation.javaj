import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
// Time complexity O(n), Space complexity O(n)
public class reversePolishNotation {
    public Integer rpn(String[] values){
        Stack<Integer> stack = new Stack<>();
        Set<String> operators = new HashSet<>(Set.of("+", "-", "*", "/"));
        int result = 0;

        for(int idx = 0; idx < values.length; idx++){
            String token = values[idx];
            if(operators.contains(token)){
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                if(token == "+"){result = operand1 + operand2;}
                if(token == "-"){result = operand1 - operand2;}
                if(token == "/"){result = operand1 / operand2;}
                if(token == "*"){result = operand1 * operand2;}
                stack.add(result);
            }
            else{stack.add(Integer.parseInt(token));}
        }
        return stack.lastElement();
    }

    public static void main(String[] args){
        String[] array = {"50", "3", "17", "+", "2", "-", "/"};
        int rpn = new reversePolishNotation().rpn(array);
        System.out.println(rpn);

    }
}
