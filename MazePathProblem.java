public class MazePathProblem {

    static void mazeOptions(int row, int col , int endRow, 
    int endCol, String result){

        // Base Case
        if(row == endRow && col == endCol){
            System.out.println(result);
            return ; 
        }
        if(row>endRow || col> endCol){
            return ;
        }
        // Move to the Right
        mazeOptions(row , col+1, endRow, endCol, result + "H");

        // Move to the Down
        mazeOptions(row+1 , col, endRow, endCol, result + "V");
    }
    public static void main(String[] args) {
        mazeOptions(0, 0, 2, 2
        , "");
    }
}
