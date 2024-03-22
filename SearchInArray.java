class SearchArray{
    static boolean isFound(int [] arr, int index , int search){
        // Base case
        if(index == arr.length){
            return false;
        }
        if(arr[index]==search){
            return true;
        }
        // Small Problem
        return isFound(arr, index + 1, search);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int search = 50;
        int index = 0;
        System.out.println( isFound(arr, index, search)
        ?"Found":"Not Found");
       ;
    }
}