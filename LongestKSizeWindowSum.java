class LongestKSizeWindowSum{
    public static void main(String[] args) {
        double e = Double.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println(max + " "+Integer.MAX_VALUE);
        int [] nums= {3,-1, 4,12 ,-8, 5, 6};
        int k = 5; // Size of Window for Fixed Size Window Sliding
        int sum = 0; 
        // Compute the sum of first window
        for(int i = 0; i<k; i++){
            sum +=nums[i];
        }
        max = sum;
        // now compute the sum of rest of the windows.
        for(int i = k ; i<nums.length; i++){
            sum+= nums[i] - nums[i-k] ; // add the right part and minus the left part
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}