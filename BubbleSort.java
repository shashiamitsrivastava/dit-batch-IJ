public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,8,3,1,4,6,2};
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){ // Not in Order 
                    // Do the Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                 }
            }
        }
        // OutCome
        for(int val : arr){
            System.out.println(val);
        }
    }
}
