import java.util.ArrayList;
import java.util.List;

class minMaxStack {
    private List<Integer> stack = new ArrayList<Integer>();

    public int peak(){
      return stack.get(stack.size() - 1);
    }
    public int push(int x){
      stack.add(x);
      return x;
    }
    public static void main(String[] args) {
      var program = new minMaxStack();
      program.push(1);
      var a = program.peak();
      System.out.println(a);
  }

}