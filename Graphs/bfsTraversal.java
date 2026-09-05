package apnaCollege;
import java.util.*;

public class bfsTraversal {
	static class Edge{
		int src;
		int desc;
		int wt;
		
		public Edge(int s, int d, int w) {
			this.src = s;
			this.desc = d;
			this.wt = w;
		}
	}
	public static void created(ArrayList<Edge>[] graph) {
		//0 Vertex
		graph[0].add(new Edge(0,1,5));
				
		//1 Vertex
		graph[1].add(new Edge(1,0,5));
		graph[1].add(new Edge(1,2,1));
		graph[1].add(new Edge(1,3,3));
				
		//2 Vertex
		graph[2].add(new Edge(2,1,1));
		graph[2].add(new Edge(2,3,1));
		graph[2].add(new Edge(2,4,2));
				
		//3 Vertex
		graph[3].add(new Edge(3,1,3));
		graph[3].add(new Edge(3,2,1));
				
		//4 Vertex
		graph[4].add(new Edge(4,2,2));
	}
	
	public static void bfs(ArrayList<Edge>[] graph) { //0(n)
		Queue<Integer> q = new LinkedList<>();
		boolean vis[] = new boolean[graph.length];
		q.add(0);
		
		while(!q.isEmpty()) {
			int curr = q.remove();
			
			if(!vis[curr]) {
				System.out.print(curr+" ");
				vis[curr] = true;
				for(int i=0; i<graph[curr].size(); i++) {
					Edge e = graph[curr].get(i);
					q.add(e.desc);
				}
			}
		}
	}
	public static void main(String[] args) {
		int V = 5;
		ArrayList<Edge>[] graph = new ArrayList[V]; //null -> Empty Arraylist
		
		for(int i=0; i<V; i++) {
			graph[i] = new ArrayList<>();
		}
		created(graph);
		bfs(graph);
	}
}
