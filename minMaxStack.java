import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

class minMaxStack {
        private List<Integer> stack = new ArrayList<Integer>();
        private List<HashMap<String, Integer>> minMaxStack = new ArrayList<>();

        // O(1)
        public int peek(){
            return stack.get(stack.size() - 1);
        }
    public void push(int number){
        HashMap<String, Integer> curr_minMax = new HashMap<>();
        curr_minMax.put("min", number);
        curr_minMax.put("max", number);
        if (!stack.isEmpty()) {
            HashMap<String, Integer> lastMinMax = minMaxStack.get(minMaxStack.size() - 1);
            int newMin = Math.min(number, lastMinMax.get("min"));
            int newMax = Math.max(number, lastMinMax.get("max"));
            curr_minMax.put("min", newMin);
            curr_minMax.put("max", newMax);
        }
        minMaxStack.add(curr_minMax);
        stack.add(number);
    }
    public int pop(){
            minMaxStack.removeLast();
            return stack.removeLast();
    }
    public int getMin(){
        return minMaxStack.get(minMaxStack.size() - 1).get("min");
    }
    public int getMax(){
        return minMaxStack.get(minMaxStack.size() - 1).get("max");
    }


    public static void main(String[] args) {
      var stack = new minMaxStack();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
     // System.out.println(stack.peek());
      System.out.println(stack.getMin());
      System.out.println(stack.getMax());

  }

}