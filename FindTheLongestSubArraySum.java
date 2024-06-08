class FindTheLongestSubArraySum{
    public static void main(String[] args) {
        int arr[] = {3,1,2,7,4,2,1,1,5};
        int k = 8;
        // Maintain 2 Pointers
        int left = 0;
        int currentSum = 0;
        int max = 0;
        // Move to the right till the given constraint is valid
        for(int right = 0; right<arr.length; right++){
            currentSum = currentSum + arr[right];
            // If Constraint is not valid so keep remove the left added values
            while(currentSum>k){
                currentSum = currentSum - arr[left];
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        System.out.println(max);
    }
}