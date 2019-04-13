import java.util.*;
class Graph_AllPath
{
	int v;
	ArrayList<Integer> adj[];

	// Constructor for creating graph and init with memory and vertices
	Graph_AllPath(int vertices)
	{
		this.v=vertices;
		adj=new ArrayList[v];
		for(int i=0;i<v;i++)
		{
			adj[i]=new ArrayList<Integer>();
		}
	}

	// Adding edge
void addEdge(int src, int des)
{
	adj[src].add(des);
}

//initiating for finding path
public void printAllpaths(int s, int d)
{
	boolean visited[]=new boolean[v];
	ArrayList<Integer> pathlist=new ArrayList<>();
	//adding source in path
	pathlist.add(s);
	findallpath(s,d,visited,pathlist);

}

public void findallpath(int u,int d,boolean isvisited[],List<Integer> localpathlist)
{
	//making current vertices as visited
isvisited[u]=true;
if(u==d)
{
	System.out.println(localpathlist);
	isvisited[u]=false;
	return;
}
// Iterating each node and finding path
for (Integer i :adj[u] ) {
	// avoiding loop
	if (isvisited[i]==false) {
		// adding current path
		localpathlist.add(i);
		findallpath(i,d,isvisited,localpathlist);
		localpathlist.remove(i);
	}
	
}
isvisited[u]=false;

}
	public static void main(String[] args) {
		Graph_AllPath g=new Graph_AllPath(4);
		g.addEdge(0,1); 
        g.addEdge(0,2); 
        g.addEdge(0,3); 
        g.addEdge(2,0); 
        g.addEdge(2,1); 
        g.addEdge(1,3); 
		
		g.printAllpaths(2,3);
	}
}