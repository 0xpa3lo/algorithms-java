import java.util.Arrays;
import java.util.Stack;

// O(n) time and O(n) space complexity
public class nextGreaterElement {
    public int[] nge(int[] array){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[array.length];
        Arrays.fill(result, -1);
        int length = array.length * 2;

        for(int i = 0; i < length; i++){
            int circularIdx = i % array.length;
            while(!stack.isEmpty() && array[circularIdx] > array[stack.peek()]){
                int idx = stack.pop();
                result[idx] = array[circularIdx];
                
            }
            stack.push(idx);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, -3, -4, 6, 7, 2};
        int[] result = new nextGreaterElement().nge(array);
        System.out.println(Arrays.toString(result));
    }
}
