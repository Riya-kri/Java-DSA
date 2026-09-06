package apnaCollege;

import java.util.*;
public class cycleDetection {
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
		graph[0].add(new Edge(0,3));
				
		//1 Vertex
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,2));
				
		//2 Vertex
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,1));
				
		//3 Vertex
		graph[3].add(new Edge(3,0));
		graph[3].add(new Edge(3,4));
				
		//4 Vertex
		graph[4].add(new Edge(4,3));
	}
	
	public static boolean detectCycle(ArrayList<Edge> graph[]) {
		boolean vis[] = new boolean[graph.length];
		for(int i=0; i<graph.length; i++) {
			if(!vis[i])
				if(detectCycleUtil(graph,vis,i,-1)) //If cycle exists in any one component of the graph
			        return true;	
		}
		return false;
	}
	
	public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean vis[], int curr, int par) {
		vis[curr] = true;
		
		for(int i=0; i<graph[curr].size(); i++) {
			Edge e = graph[curr].get(i);
			
			if(vis[e.des] == false) {
				if(detectCycleUtil(graph,vis,e.des,curr))
					return true;
			}
			else if(vis[e.des] == true && e.des != par)
				return true;
			
		}
		return false;
	}
	public static void main(String[] args) {
		int V = 5;
		ArrayList<Edge>[] graph = new ArrayList[V]; //null -> Empty Arraylist
		
		for(int i=0; i<V; i++) {
			graph[i] = new ArrayList<>();
		}
		created(graph);
		System.out.println(detectCycle(graph));
	}
}
