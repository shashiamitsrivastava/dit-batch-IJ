public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,8,3,1,4,6,2};
        int n = arr.length;
        // First Pass to get the Minimum
        for(int i = 0 ; i<n-1; i++){
            // pick the first element
            int minIndex = i; 
            for(int j = i + 1; j<n; j++){
                // pick the minimum from the R.H.S of the array
                if(arr[j]< arr[minIndex]){
                    minIndex = j;
                }
            }
            // Swap Min index value the first pass index
            int temp  = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        for(int val: arr){
            System.out.println(val);
        }

    }
}
