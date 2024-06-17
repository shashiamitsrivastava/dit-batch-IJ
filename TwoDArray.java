public class TwoDArray {
    public static void main(String[] args) {
        // Array with in array
        //int arr[][] = new int[3][5];
        int arr[][] = new int[3][]; // fill with 0 
        int [][]c = new int[][] {{10,20},{90,100}};
        int [][]d = new int[3][3];
        int []e[] = new int[3][3];
     arr[0]= new int[5];
        arr[1]= new int[10];
        arr[2] = new int[20];
        // Enhance for loop
        for(int a[] : arr){
            for(int b: a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        // for(int i = 0; i<arr.length; i++){
        //     for(int j= 0 ; j<arr[i].length; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
     }
}
