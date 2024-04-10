class AllPos{
    static void allAtoZPos(int nLen , String result){
        // Base Case
        if(result.length() == nLen){
            System.out.print(result +" ");
            return ; 
        }
        for(char alpha = 'A'; alpha<='Z'; alpha++){ // loop
            if(alpha=='A' || alpha=='E' || alpha=='I' || alpha=='O' || alpha=='U'){
            allAtoZPos(nLen, result + alpha); // recursive call
            }
        }
    }
    public static void main(String[] args) {
        allAtoZPos(8, "");
    }
}