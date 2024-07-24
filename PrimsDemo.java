import java.util.Arrays;

class PrimsDemo{
    final int V = 6; // number of vertices
    int selectMinimumVertex(int [] weight, boolean []mst){
        int min = Integer.MAX_VALUE;
        int vertex = -1;  // No Vertex Selected
        for(int i = 0 ; i<V; i++){
            if(!mst[i] && weight[i]<min){
                min = weight[i];
                vertex = i;
            }
        }
        return vertex;
    }
    void printMST(int [] parent, int [][] graph, int [] weight ){
        for(int i = 1; i<V; i++){
            System.out.println(parent[i]+" ===>  ("+weight[i]+") "+ i);
        }
    }
    void buildMST(int [][] graph){
        int [] parent = new int[V];
        int [] weight = new int[V]; // Infinity and it get relax
        boolean []mst = new boolean [V]; // all are false by default
        // Fill all the Infinity values in weight array
        Arrays.fill(weight, Integer.MAX_VALUE);
        // start with 0 vertex  so weight it is zero
        weight[0] = 0;
        parent[0] = -1;
        // Now build the MST (V-1) Edges
        for(int i = 0 ; i<V-1; i++){
            // select the min vertex
            int U = selectMinimumVertex(weight, mst);
            mst[U] = true; // Consume the vertex for MST
            // Relax the Adajcent Vertex (Those are not part of MST)
            for(int j = 0; j<V; j++){
                /*
                 * 1. Edge is present b/w U and j
                 * 2. Vertex not part of MST
                 * 3. Edge Weight is smaller than the current edge weight
                 */
                if(graph[U][j]!=0 && !mst[j] && graph[U][j]<weight[j]){
                    weight[j] = graph[U][j];
                    parent[j] = U; // Update the parent Array
                }
            }
        }
        printMST(parent, graph, weight);

    }
    public static void main(String[] args) {
        int [][] graph = {
           {0,4,6,0,0,0}, //0 
           {4,0,6,3,4,0}, //1
            {6,6,0,1,0,0}, //2
             {0,3,1,0,3,4},//3
            {0, 4,0,3,0,7} ,//4
             {0,0,0,4,7,0} //5

        };
        PrimsDemo obj = new PrimsDemo();
        obj.buildMST(graph);

    }
}