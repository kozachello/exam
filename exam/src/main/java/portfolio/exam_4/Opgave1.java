package portfolio.exam_4;

/**
 * Created by Козак on 10.11.2016.
 */
class Tree {

    Tree left; // sub
    Tree right; // sub
    int value;
    int count=0;
    int[] values;

    public Tree(int n) {
        value = n;
    }

    // return of children' quantity
    public int getCount() {
        return count;
    }

    public void putIn(Tree tree) {
        if (tree.value < value) {
            if (left != null) {
                left.putIn(tree);
                    count++; // left children count
            } else left = tree;
            count++;
        }
        else
        if (right != null) {
            right.putIn(tree);
        }
        else right = tree;
    }

    public void shift(ValuePrint visitor) {
        if (left != null)
            left.shift(visitor); // recursion
            visitor.visit(this);
        if (right != null)
            right.shift(visitor); // recursion
    }
}

public class Opgave1 {
    public static void main(String args[]) {
        Tree newTree = new Tree(3);   // new Tree with root 3
        newTree.putIn(new Tree(5));  // subtrees and leaves ==>
        newTree.putIn(new Tree(2));
        newTree.putIn(new Tree(1));
        newTree.putIn(new Tree(4));
        newTree.putIn(new Tree(6));
        newTree.shift(new ValuePrint());
        System.out.println("\n" +newTree.getCount()+ " left children in the tree");
    }
}

class ValuePrint {
    public void visit(Tree node) {
        System.out.println(" " +node.value);
    }
}
