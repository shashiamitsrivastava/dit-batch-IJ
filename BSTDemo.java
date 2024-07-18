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
        remove(root, root, true, 18);
        print(root);
        
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

    // for remove
    void remove(BSTNode<Integer> currentNode, BSTNode<Integer> parent,
     boolean isLeft, int data ){
        if(data>currentNode.data){
            // look up in right
            remove(currentNode.right, currentNode, false, data);
        }
        else if (data< currentNode.data){
            remove(currentNode.left, currentNode, true, data);
        }
        else{
            // Data found in tree
            // Case - 1 We are on leaf node (No Left Child , No Right Child)
            if(currentNode.left == null && currentNode.right==null){
                if(isLeft){
                    // I am on Left
                    parent.left  = null;
                }
                else{
                    // I am on right
                    parent.right = null;
                }
            }
            // Case - 2 CurrentNode right!=null and left =null
            if(currentNode.left == null && currentNode.right!=null){
                if(isLeft){
                    parent.left = currentNode.right;
                }
                else{
                    parent.right = currentNode.right;
                }
            }
            // case - 3 currentNode left!=null and right = null
            if(currentNode.left!=null && currentNode.right==null){
                if(isLeft){
                    parent.left = currentNode.left;

                }
                else{
                    parent.right = currentNode.left;
                }
            }
            // case - 4 current.left!=null and currentNode.right !=null
            if(currentNode.left!=null && currentNode.right!=null){
                // get the left max
                int max = maxValue(currentNode.left);
                currentNode.data= max;
                remove(currentNode.left, currentNode, true, max);
            }
        }
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
