public class PrefixSumDemo {
    public static void main(String[] args) {
        int org[] = {1,6,3,2,7,2};
        int queries[][] = {{0,3}, {2,4},{2,5}};
        int prefix[] = new int[org.length];
        prefix[0] = org[0]; // store the first element
        // fill the prefix array
        for(int i = 1; i<org.length; i++){
            prefix[i] = prefix[i-1] + org[i];
        }
        // print the org and prefix array
        for(int i : org){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : prefix){
            System.out.print(i + " ");
        }
        System.out.println();
        // range queries (1,6,3,2,7,2)
        // 1 7 10 12 19 21 (Prefix)
        for(int i= 0; i<queries.length; i++){
            int lowerBound = queries[i][0];
            int upperBound = queries[i][1];
            int sum= prefix[upperBound] - prefix[lowerBound] + org[lowerBound];
            System.out.println("Sum of ("+lowerBound+" , "+upperBound+") "+sum);
        }

    }
}
