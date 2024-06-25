import java.util.Scanner;

// Build a Node
class Node<T>{
    T data; // current node data it contains
    // next by default contains null
    Node<T> next; // Node type reference variable called next
    // next contains the reference of the next node
    // Constructor Call
    Node(T data){
        this.data = data;
       // this.next = null;
    }
}
// CRUD operations

class LinkedListOperations<T>{
    Node<T> head ;
    Node<T> tail;
    void deleteAtBeg(){
        if(head == null){
            System.out.println("Empty LL Can't Delete");
            return;
        }
        Node<T> temp = head;
        head = head.next;
        temp.next = null;
        temp = null;
    }
    void deleteAtEnd(){
        if(head == null){
            System.out.println("Empty LL Can't Delete");
            return;
        }
        if(head.next == null){
            head = null;
            System.out.println("LL Remove...");
        }
        else{
            Node<T> temp = head;
            Node<T> temp2 = temp;
            while(temp.next != null){
                temp2 = temp; // temp Current Reference assign to temp2
                temp = temp.next; // temp move to the next reference
            }
            temp2.next =null;
            temp = null;
        }

    }
    void deletePositionWise(int position){
        Node<T> temp = null;
        if(head == null){
            System.out.println("LL is Empty");
            return ;
        }
        if(position ==0 ){
            // Remove Beg
            temp = head;
            head = head.next;
            temp = null;
            return ;

        }
        // Delete By Position
        temp = head;
        int i = 1;
        while(i<position-1){
            temp = temp.next;
            i++;
        }
        Node<T> temp2 = temp.next;
        temp.next = temp.next.next;
        temp2 = null;
    }
    void insertAtBeg(Node<T> node){
        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }
    void insertAtMid(Node<T> node, int position){
        if(head == null){
            head = node;
            return ;
        }
        if(position ==0 ){
            node.next = head;
            head = node;
            return ;
        }
        if(position>0){
            Node<T> temp = head;
            int i = 1;
            while(i<position){
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }

    }
    void search(T searchElement){
        Node<T> temp = head;
        while(temp!=null){
            if(temp.data == searchElement){
                System.out.println("Element Found....");
                return ;
            }
            temp = temp.next;
        }
        System.out.println("Element Not Found...");
    }
    void update(T search, T replace){
        Node<T> temp = head;
        while(temp!=null){
            if(temp.data == search){
                temp.data = replace;
                System.out.println("Element Found and Update...");
                return ;
            }
            temp = temp.next;
        }
        System.out.println("Element Not Found...");
    }
    void insertAtEnd(Node<T> node){
        if(head == null){
            tail = head = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        // if(head == null){
        //     head = node;
        // }
        // else{
        //     Node<T> temp = head; // Dummy Pointer (Reference Variable) - Reference of Head
        //     while(temp.next!=null){
        //         temp =temp.next;
        //     }
        //     temp.next  = node;
        // }
    }
    void print(){
        Node<T> temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
class Customer{
    int id;
    String name;
    double balance;
}
class LinkedListDemo{
    static Scanner scanner = new Scanner(System.in);
    static Node<Integer> createNode(){
        System.out.println("Enter the data of Node");
                    int data = scanner.nextInt();
                    Node<Integer> node = new Node<>(data);
                    return node;
    }
    public static void main(String[] args) {
        //Node<String> node = new Node<>();
        // Node<Integer> node = new Node<>(10);
        
        // Node<Integer> node2 = new Node<>(20);
        // node.next = node2;
        //Node<Customer> node = new Node<>();
        LinkedListOperations<Integer> opr = new LinkedListOperations<>();
       
        while(true){
            System.out.println("1. Insertion at End");
            System.out.println("2. Printing");
            System.out.println("3. Insertion At Beg");
            System.out.println("4. Insertion at Mid");
            System.out.println("5. Deletion at beg");
            System.out.println("6. Deletion at End");
            System.out.println("7. Deletion at Mid");
            System.out.println("8. Search Element");
            System.out.println("9. Update Element");
            System.out.println("0. to Exit");
            System.out.println("Enter the Choice");
            int choice = scanner.nextInt();
            switch(choice){
                case 0 :
                    System.out.println("Thanks For Using....");
                    return ;
                case 1:
                    
                    opr.insertAtEnd(createNode());
                    break;
                case 2:
                    opr.print();
                    break;   
                case 3:
                opr.insertAtBeg(createNode());
                break;
                
                case 4:
                opr.insertAtMid( createNode(),3);
                break;
            
                case 5:
                opr.deleteAtBeg();
                break;
                case 6:
                opr.deleteAtEnd();
                break;
                case 7:
                opr.deletePositionWise(2);
                break;
                case 8 :
                opr.search(3);
                break;
                case 9 :      
                opr.update(3, 300);
                
            }

        }
    }
}