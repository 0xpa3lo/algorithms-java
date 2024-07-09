import java.util.ArrayList;

//  O(n^2) time complexity and Space complexity O(n)
public class sortStack {
    public static ArrayList<Integer> sortStack(ArrayList<Integer> stack) {
        if (stack.isEmpty()) {
            return new ArrayList<>();  // Return an empty list if the stack is empty
        }

        int top = stack.remove(stack.size() - 1); 
        sortStack(stack); 
        insertInSortedOrder(stack, top); 
        return stack;
    }

    private static void insertInSortedOrder(ArrayList<Integer> stack, int value) {
        if (stack.isEmpty() || stack.get(stack.size() - 1) < value) {
            stack.add(value);
            return;
        }

        int top = stack.remove(stack.size() - 1);  
        insertInSortedOrder(stack, value); 
        stack.add(top); 
    }

    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>();
        stack.add(3);
        stack.add(1);
        stack.add(4);
        stack.add(2);

        System.out.println("Unsorted stack: " + stack);
        ArrayList<Integer> sortedStack = sortStack(stack);
        System.out.println("Sorted stack: " + sortedStack); 
    }
}
