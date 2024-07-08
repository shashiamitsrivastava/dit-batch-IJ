import java.util.Scanner;

class BinaryTreeNode<T>{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    BinaryTreeNode(T data){
        this.data = data;
    }
}
class BinaryTreeOperations{
    String nodeName = "parent";
    Scanner scanner = new Scanner(System.in);
    BinaryTreeNode<Integer> add(){
        System.out.println("Enter the node data in a tree for "+nodeName);
        int data = scanner.nextInt();
        if(data == -1){
            return null;
        }
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(data);
        nodeName = "left";
        newNode.left = add();
        nodeName = "right";
        newNode.right = add();
        nodeName = "parent";
        return newNode;

    }

    void print(BinaryTreeNode<Integer> root){
        // Base Case
        if(root == null){
            return ;
        }
        String result = "";

        // Traverse the parent
        int parent = root.data;
        result += "P => "+parent;
        // Traverse in Left
        if(root.left!=null){
            int leftData = root.left.data;
            result += " L => "+leftData;
        }
        // Traverse in Right
        if(root.right!=null){
            int rightData = root.right.data;
            result += " R => "+rightData;
        }
        System.out.println(result);
        print(root.left);
        print(root.right);
    }
}
public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTreeOperations opr = new BinaryTreeOperations();
        BinaryTreeNode<Integer> root = opr.add();
        opr.print(root);

    }
}
