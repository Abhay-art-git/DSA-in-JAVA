import java.util.*;
public class PracticeGraphlist {
    static class Edge{
        int src;
        int dst;
        int wt;


       public Edge( int s , int d , int w){
        this.src = s;
        this.dst = d;
        this.wt = w;
       }
    }
    public static void main(String[] args) {
        /*
         *     0 --- 1 ----- 2 --- 4
         *            \     /
         *             \   /
         *               3
         * 
         */
        int v = 5;
        ArrayList<Edge> Graph[] = new ArrayList[v]; // null --> empty

        for(int i =0;i<v;i++){
            Graph[i] = new ArrayList<>();

        }

        // adding vertex in graph 
        //vertex -0
        Graph[0].add(new Edge(0, 1, 5));

        //vertex -1
        Graph[1].add(new Edge(1, 2, 1));
        Graph[1].add(new Edge(1, 3, 3));
        Graph[1].add(new Edge(1, 0, 5));

        //vertex - 2
        Graph[2].add(new Edge(2, 1, 1));
        Graph[2].add(new Edge(2, 4, 2));
        Graph[2].add(new Edge(2, 3, 1));
        
        //vertex -3
        Graph[3].add(new Edge(3, 2, 1));
        Graph[3].add(new Edge(3, 1, 3));
        
        //vertex - 4
        Graph[4].add(new Edge(4, 2, 2));



    // finding neighbour  of graph:for 2 
    for(int i=0;i<Graph[2].size();i++){
          Edge e = Graph[2].get(i);
          System.out.println(e.dst);

    }




        
    }
    
}
