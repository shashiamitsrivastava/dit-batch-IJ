
class CountProductSubArray {
    public static void main(String[] args) {
        int arr[] = {10,5,2,6};
        System.out.println(numSubarrayProductLessThanK(arr, 100));
    }
    static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        // Maintain 2 Pointers
        // Left Pointer , Right Pointer (On Start)
        int left = 0;
        int product = 1;
        int count = 0;
        for(int right = 0; right<nums.length; right++){
            product = product * nums[right];
            while(product>=k){
                product = product / nums[left];
                left ++;
            }
            count = count + right - left + 1;
        }
        return count;
    }
}