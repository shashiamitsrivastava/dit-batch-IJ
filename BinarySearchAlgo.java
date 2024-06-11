public class BinarySearchAlgo {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};
        int low = 0;
        int high = arr.length-1;
        int search = 170;
        while(low<high){
            int mid = (low + high)/2;
            if(search == arr[mid]){
                System.out.println("Element Found ...");
                return ; // exit from the main function
            }
            if(search>arr[mid]){
                // move to the right
                low  = mid + 1;
            }
            else if (search<arr[mid]){
                high = mid - 1; // move to the left
            }
        }
        System.out.println("Element Not Found...");
    }
}
