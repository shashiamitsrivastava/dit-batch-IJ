import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class FirstExample{
   static Map<Integer, List<Integer>> buildGraph(int edges[][]){
    Map<Integer, List<Integer>> graph = new HashMap<>(); // UnSorted , UnOrder
    // Traverse the Edges
    for(int [] edge : edges){
        int vertex1 = edge[0];
        int vertex2 = edge[1];
        // Directed (One Direction)
        if(!graph.containsKey(vertex1)){
           graph.put(vertex1, new ArrayList<>()); 
        }
        graph.get(vertex1).add(vertex2); 

        // Undirected Graph (Bi - Directional)
        // if(!graph.containsKey(vertex2)){
        //     graph.put(vertex2, new ArrayList<>()); 
        //  }
        //  graph.get(vertex2).add(vertex1); 
    }
    return graph;

    }
    public static void main(String[] args) {
        int [][] edges = {{0,1},{1,2}, {2,0}, {2,3}};
        Map<Integer, List<Integer>> graph = buildGraph(edges);
        System.out.println("Graph is ");
        System.out.println(graph);
    }
}