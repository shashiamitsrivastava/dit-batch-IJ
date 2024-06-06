class First{
    static void show(int []a){
        a[0] = 100;
        for(int i : a){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        //int arr[] = new int[3]; // all are fill with 0
        // {0,0,0}
        //int []arr = new int[3];
        //int [] arr = {10,20,30};
        int [] arr = new int[]{10,20,30};
        show(arr);
        System.out.println("After Show Call ");
        for(int i : arr){
            System.out.println(i);
        }


    }

}