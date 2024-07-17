class BSTNode<T>{
    T data;
    BSTNode<T> left;
    BSTNode<T> right;
    BSTNode(T data){
        this.data = data;
    }
}
class BSTOperation{
    BSTNode<Integer> root;
    void buildTree(){
        root = insertNewNode(70,root);
        root = insertNewNode(14,root);
        root = insertNewNode(18,root);
        root = insertNewNode(20,root);
        root = insertNewNode(80,root);
        root = insertNewNode(75,root);
        print(root);
        System.out.println("MAX "+maxValue(root));
        
    }

    // find the max value in BST
    int maxValue (BSTNode<Integer> temp){
       // tree is  empty
       if(temp == null){
        return Integer.MAX_VALUE;
       } 
       // if tree is not empty
       int max = temp.data;
       while(temp.right!=null){
        max = temp.right.data;
        temp = temp.right;
       }
       return max;

       

    }

    BSTNode<Integer> insertNewNode(int data, BSTNode<Integer> parent){
        if(parent == null){
            parent = new BSTNode<Integer>(data);
            
            return parent;
        }
        if(data<parent.data){
            parent.left = insertNewNode(data, parent.left);
        }
        else if(data>parent.data){
            parent.right = insertNewNode(data, parent.right);
        }
        return parent;
    }
    void print(BSTNode<Integer> temp){
        if(temp!=null){
            print(temp.left);
            System.out.println(temp.data);
            print(temp.right);
        }
    }
}
public class BSTDemo {
    public static void main(String[] args) {
        BSTOperation opr= new BSTOperation();
        opr.buildTree();
        
    }
}
