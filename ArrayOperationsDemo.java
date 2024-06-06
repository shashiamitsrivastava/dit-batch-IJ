import java.util.Scanner;

class ArrayOperations{
    int arr[] ;
    int size ;
    ArrayOperations(int capacity){
        arr = new int[capacity]; // How many elements array can store
        size = 0; // How many elements currently it has
    }
    // CRUD 
    void insert(int position , int element){
        // Check the Size not cross the array capacity
        if(size == arr.length){
            System.out.println("Array is Full can't Insert...");
            return ;
        }
        int currentIndex = position - 1;
        for(int i = size-1; i>=currentIndex; i--){
            arr[i+1] = arr[i];
        }
        arr[currentIndex] = element; 
        size++; // How many elements i have
        
        // otherwise shift the elements till reach the last element, 
        //start from the position

    }

    int search (int element){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    void update(int element, int updatedValue){
        int index = search(element);
        if(index == -1){
            System.out.println("Element Not Found so Can't Update");
            return ;
        }
        arr[index] = updatedValue;
        System.out.println("Updated...");
    }

    void remove(int element){
       int index =  search(element);
       if(index == -1){
            System.out.println("Element Not Exist Can't Remove");
            return;
       }
       // remove logic
       for(int i = index ; i<size-1; i++){
            arr[i] = arr[i+1];
       }
       arr[size-1] = 0;
       size--;
    }


    void print(){
        for(int element : arr){
            System.out.println(element);
        }
    }

}
public class ArrayOperationsDemo {
    
    public static void main(String[] args) {
        int capacity = 10;
        ArrayOperations obj = new ArrayOperations(capacity);
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. Insertion ");
            System.out.println("2. Remove");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Print");
            System.out.println("6. Exit");
            System.out.println("Enter the Choice");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    obj.insert(1, 100);
                    obj.insert(2, 200);
                    obj.insert(1,900);
                    obj.insert(1, 1000);
                    break;
                    case 2:
                        obj.remove(900);
                        break;

                    case 3:
                        obj.update(1000, 2000);
                        break;    
                    case 4:
                        System.out.println(obj.search(1000)==-1?"Not Found":"Found");
                     break;    
                    

                 case 5:
                    obj.print();
                    break;   
                 case 6:
                 return ;
                   // System.exit(0);   
            }

        }

    }
}
