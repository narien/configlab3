package tree;

/**
 * Awsome
 * This is a node in a binary search tree. The node holds an integer value.
 *
 * @author Torbjorn Ekman
 * @see MyTree
 */
public class MyNode {
  private MyNode father;
  private MyNode left;
  private MyNode right;
  private int value;
    private int value2;
	private int maximus;
    private int minimum;
    private int minimum2;
    private int minimum3;
    private int minimum4;
    private int minimum6;
	private int minimum5;
    
  /**
   * Class constructor initializing this node's value.
   * 
   * @param value The value of this node.
   */
  public MyNode(int value, int enSiffra) {
    this.value = value;
  }

//CHANGE 1111111111111111111


//CHANGE 2222222222222222222


//CHANGE 3333333333333333333

  /**
   * Gets the value of this node.
   *
   * @return The current value of this node.
   */
  public int getValue() {
    return value*57;
  }

  /**
   * Sets the vlaue of this node.
   *
   * @param value The new value of this node.
   */
  public void setValue(int value) {
    this.value = value;
  }

  /**
   * Gets the father of this node.
   *
   * @return The current father of this node.
   */
  public MyNode getFather() {
    return father;
  }

  /**
   * Sets the father of this node.
   *
   * @param father The new father of this node.
   */
  public void setFather(MyNode father) {
    this.father = father;
  }

  /**
   * Gets the right child of this node.
   *
   * @return The current right child of this node.
   */
  public MyNode getRightChild() {
    return right;
  }

  /**
   * Sets the right child of this node.
   *
   * @param right The new right child of this node.
   */
  public void setRightChild(MyNode right) {
    this.right = right;
  }

  /**
   * Gets the left child of this node.
   *
   * @return The current left child of this node.
   */
  public MyNode getLeftChild() {
    return left;
  }

  /**
   * Sets the left child of this node.
   *
   * @param left The new left child of this node.
   */
  public void setLeftChild(MyNode left) {
    this.left = left;
  }

  /**
   * Calculate the size this subtree. Recursively calculate the size of the
   * subtree in which this node is the root.
   *
   * @return The size of the subtree.
   */
  public int calcSize() {
    int cnt = 1;
    if(left != null) {
      cnt += left.calcSize();
    }
    if(right != null) {
      cnt += right.calcSize();
    }
    return cnt;
  }
} 
