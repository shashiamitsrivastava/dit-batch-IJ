public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,8,3,1,4,6,2};
        for(int i = 1 ; i<arr.length; i++){
            int value = arr[i];
            // previous pick
            int j = i - 1;
            while(j>=0 && arr[j]>value){
                arr[j+1] = arr[j];
                j = j  - 1;
            }
            arr[j+1] = value;


        }
        for(int val : arr){
            System.out.println(val);
        }
    }
}
