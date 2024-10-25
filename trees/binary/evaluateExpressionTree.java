import java.util.*;
// time complexity O(h) height of the tree, Space complexity O(n) 
class Program {
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  public int evaluateExpressionTree(BinaryTree tree) {
    // Base case: if the node is a leaf (no left or right children), return its value
    if (tree.left == null && tree.right == null) {
      return tree.value;
    }

    // Recursively evaluate the left and right subtrees
    int leftValue = evaluateExpressionTree(tree.left);
    int rightValue = evaluateExpressionTree(tree.right);

    // Perform the operation based on the current node's value (-1 for addition, -2 for subtraction, etc.)
    switch (tree.value) {
      case -1: // Addition
        return leftValue + rightValue;
      case -2: // Subtraction
        return leftValue - rightValue;
      case -3: // Division
        return leftValue / rightValue;
      case -4: // Multiplication
        return leftValue * rightValue;
      default:
        throw new IllegalArgumentException("Invalid operation");
    }
  }

  public static void main(String[] args) {
    // Example of creating a tree representing the expression: (3 + (10 - 5))
    BinaryTree tree = new BinaryTree(-1);
    tree.left = new BinaryTree(3);
    tree.right = new BinaryTree(-2);
    tree.right.left = new BinaryTree(10);
    tree.right.right = new BinaryTree(5);

    Program program = new Program();
    int result = program.evaluateExpressionTree(tree);
    System.out.println("Result of expression tree evaluation: " + result);
  }
}
