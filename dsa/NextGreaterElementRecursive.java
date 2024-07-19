import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementRecursive {

    public static int[] nextGreaterElement(int[] array) {
        int[] result = new int[array.length];
        Arrays.fill(result, -1);
        return _nextGreaterElement(0, new Stack<>(), array, result);
    }

    private static int[] _nextGreaterElement(int idx, Stack<Integer> stack, int[] array, int[] result) {
        if (idx == 2 * array.length) {
            return result;
        }

        int circularIdx = idx % array.length;

        while (!stack.isEmpty() && array[stack.peek()] < array[circularIdx]) {
            int top = stack.pop();
            result[top] = array[circularIdx];
        }

        stack.push(circularIdx);

        return _nextGreaterElement(idx + 1, stack, array, result);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, -3, -4, 6, 7, 2};
        int[] response = nextGreaterElement(arr);
        System.out.println(Arrays.toString(response));
    }
}
