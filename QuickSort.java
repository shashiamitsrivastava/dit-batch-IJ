public class QuickSort {
    // Divide
    static void quickSort(int arr[], int low, int high){
        // Base Case 
        if(low<high){
        int pivotIndex = givePivot(arr, low, high);
        quickSort(arr, low, pivotIndex-1); // all small on left of the pivot
        quickSort(arr, pivotIndex + 1, high);
        }
    }
    static int givePivot(int arr[], int low, int high){
        //to make pivot so it can be
        //int pivot = arr[low]; // 0th index pivot
       // int pivot  = (low + high)/2; // mid pivot
       int pivot = arr[high]; // last element is a pivot
       int i = low - 1;
       for(int j = low; j< high; j++){
            // all smaller will be place on left of pivot
            // all greater will be place on right of pivot
            if(arr[j]<=pivot){
                // low elements are correct in order , nothing to do
                i++;   
                // all small elements goes on start (left) 
                // swap ith
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]  = temp;
            }
            
                
            
       }
       // Swap i+1 element with a pivot
       int temp = arr[i+1];
       arr[i+1] = arr[high];
       arr[high]  = temp;
       return i + 1; // New Pivot
    }
    public static void main(String[] args) {
        /*
         * 1. Choose the Pivot Point (0th Index, Last Index , Mid Index)
         * 2. Place the Pivot on the correct place, the correct place is 
         * smaller element are on left of the pivot , and greater element
         * are on right of the pivot
         * 3. repeat the first step 
         */
        int arr[] = {38, 27, 44, 5 , 19, 82, 10};
        quickSort(arr, 0, arr.length-1);
        for(int val : arr){
            System.out.println(val);
        }


    }
}
