import java.util.*;
public class BFSinGraph {
    static class Edge{
        int src ;
        int dst ;
        int wt;

        public Edge(int s , int d , int w ){
            this.src = s;
            this.dst = d;
            this.wt = w;          
        }
    }

    
    public static void CreateGraph(ArrayList<Edge> Graph[] ){
        /*
         *         1 ------ 3 
         *        /        / \
         *       /        4 - 5
         *      /        /    |
         *     0 --- ---2     |
         *                    6
         * 
         */
        for(int i=0;i<Graph.length;i++){
            Graph[i]= new ArrayList<>();
        }

        // adding nodes and edges 
        Graph[0].add(new Edge(0, 1 , 1));
        Graph[0].add(new Edge(0, 2 , 1));

        Graph[1].add(new Edge(1, 0 , 1));
        Graph[1].add(new Edge(1, 3 , 1));

        Graph[2].add(new Edge(2, 0 , 1));
        Graph[2].add(new Edge(2, 4 , 1));  

        Graph[3].add(new Edge(3, 1 , 1));
        Graph[3].add(new Edge(3, 4 , 1));
        Graph[3].add(new Edge(3, 5 , 1));

        Graph[4].add(new Edge(4, 3 , 1));
        Graph[4].add(new Edge(4, 5 , 1));
        Graph[4].add(new Edge(4, 2, 1));

        Graph[5].add(new Edge(5, 4 , 1));
        Graph[5].add(new Edge(5, 3 , 1));
        Graph[5].add(new Edge(5, 6 , 1));

    }

    public static void bfs(ArrayList<Edge> Graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean visit[] = new boolean[Graph.length];
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if(!visit[curr]){ //visit current
                System.out.print(curr +" ");  // print current
                visit[curr]=true;             // current == true 
                for(int i=0;i<Graph[curr].size();i++){  // find neighbours
                    Edge e = Graph[curr].get(i);
                    q.add(e.dst);
                }
            }   
        }

        
    }
    public static void main(String[] args) {
    int v =7;
    ArrayList<Edge> graph[] = new ArrayList[v];
    CreateGraph(graph); 
    bfs(graph);   
    }    
}
