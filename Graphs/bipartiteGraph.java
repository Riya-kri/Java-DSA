package apnaCollege;
import java.util.*;
//Checking Bipartite by coloring
public class bipartiteGraph {
	static class Edge{
		int src;
		int des;
		
		public Edge(int s, int d) {
			this.src = s;
			this.des = d;
		}
	}
	public static void created(ArrayList<Edge>[] graph) {
		//0 Vertex
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,2));
				
		//1 Vertex
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,3));
				
		//2 Vertex
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,4));
				
		//3 Vertex
		graph[3].add(new Edge(3,1));
		graph[3].add(new Edge(3,4));
				
		//4 Vertex
		graph[4].add(new Edge(4,2));
		graph[4].add(new Edge(4,3));
	}
	
	public static boolean isBipartite(ArrayList<Edge> graph[]) {
		int col[] = new int[graph.length];
		for(int i=0; i<graph.length; i++) {
			col[i] = -1;  //For no color
		}
		
		Queue<Integer> q = new LinkedList<>();
		

		for(int i=0; i<graph.length; i++) {
			if(col[i] == -1) {
				q.add(i);
				col[i] = 0; //Yellow
			}
			while(!q.isEmpty()) {
				int curr = q.remove();
				for(int j=0; j<graph[curr].size(); j++) {
					Edge e = graph[curr].get(j);
					if(col[e.des] == -1) {
						if(col[curr] == 0)
							col[e.des] = 1;
						else
							col[e.des] = 0;	 
						q.add(e.des);
					}
					else if(col[e.des] == col[curr])
						return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int V = 5;
		ArrayList<Edge>[] graph = new ArrayList[V]; //null -> Empty Arraylist
		
		for(int i=0; i<V; i++) {
			graph[i] = new ArrayList<>();
		}
		created(graph);
		System.out.print(isBipartite(graph));
	}
}
