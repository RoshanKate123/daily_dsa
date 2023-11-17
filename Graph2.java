import java.util.*;
public class Graph2{
	private LinkedList<Integer>[] adj;
	private int V;
	private int E;
	
	public Graph1(int nodes){
		this.V=nodes;
		thid.E=0;
		this.adj = new LinkedList[nodes];
		for(int v=0; v<V;v++)
		{
			adj[v] = new LinkedList<>();
		}
	}
	public void addEdge(int u,int v){
		adj[v] = add(u);
		adj[u] = add[v];
		E++;
	}
	public String toString(){
		