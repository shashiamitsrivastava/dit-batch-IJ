public class FindFirstAndLastIndex {
    public static void main(String[] args) {
        int arr[] = {10,20,30,33,33,33,33,40,50,60,70};
        int search = 33;
        int firstIndex = -1;
        int lastIndex = -1;
        int low = 0 ;
        int high = arr.length-1;
        while(low< high){
            int mid = (low + high)/2;
            if(arr[mid] == search){
                // Assume this would be the firstIndex 
                firstIndex = mid;
                // firstIndex will be found on left , where last index
                // will be found on right
                high = mid - 1;
            }
            else if (search>arr[mid]){
                low = mid + 1;
            }
            else if(search < arr[mid]){
                high = mid - 1;
            }
        }
        System.out.println("First Index "+ firstIndex);
        low = 0;
        high =arr.length-1;
        while(low< high){
            int mid = (low + high)/2;
            if(arr[mid] == search){
                // Assume this would be the firstIndex 
                lastIndex = mid;
                // lastIndex will be found on Right
                low = mid + 1;
            }
            else if (search>arr[mid]){
                low = mid + 1;
            }
            else if(search < arr[mid]){
                high = mid - 1;
            }
        }
        System.out.println(lastIndex);
        System.out.println("Occur "+((lastIndex - firstIndex)+1 ));
    }
}
