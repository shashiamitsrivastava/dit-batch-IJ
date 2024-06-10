public class PrefixSumWithRangeQuery {
    public static void main(String[] args) {
        int arr[] = {1,6,3,2,7,2};
        int prefix[] = new int[arr.length];
        int queries [][] = {{0,3},{2,5},{2,4}};
        prefix[0]  = arr[0]; // store the first element of an array
        // fill the prefix array
        for(int i = 1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        // Print the Org Array
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        // print the prefix array
        for(int i : prefix){
            System.out.print(i+" ");
        }
        System.out.println();
        // Perform Range Queries
        for(int i = 0; i<queries.length; i++){
            int lowerBound = queries[i][0];
            int upperBound = queries[i][1];
            int sum = prefix[upperBound] - prefix[lowerBound]  + arr[lowerBound];
            System.out.println("Range Query Sum ("+lowerBound+" , "+upperBound+") = "+sum);
        }
    }
}
