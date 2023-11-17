class BFSforGraph{
	
	
	private class graph{
		int V;
		private LinkedLise<Integer> adj[];
		
		graph(int v)
		{
			V = v;
			adj = new LinkedList[v];
			
			for(int i=0; i<v;i++)
			{
				adj[i] = new LinkedList();
			}
			
		}
	}
	
	void addEdge(int v , int w)
	{
		adj[v].add(w);
	}
	
	void bfs(int s)
	{
		boolean vis[] = new boolean[V];
		LinkedList<Integer> que = new LinkedList<>();
		vis[s] = true;
		que.add(s);
		
		while(que.size() != 0)
		{
			s = que.poll();
			System.out.println(s + " ");
			
			Iterator<Integer> i = adj[s].listIeterator();
			while(i.hasNext())
			{
				int n = i.next();
				if(!vis[n])
				{
					vis[n] = true;
					que.add(n);
				}
			}
		}
	}
	public static void main(String args[])
	{
		BFSforGraph g = new BFSforGraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println(
            "Following is Breadth First Traversal "
            + "(starting from vertex 2)");
 
        g.BFS(2);
	}
}