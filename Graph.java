import java.util.*;
//directed graph
class Graph
{
	LinkedList<Integer> g[];
	Graph(int v)
	{
		g=new LinkedList[v];
		for (int i=0;i<v ;i++ ) {
			g[i]=new LinkedList<Integer>();
		}
	}
	void connection(int from,int to)
	{
		//to make undirected just add to-->from and from-->to
		g[from].add(to);
		//for undirected add this to
		//g[to].add(from);

	}
	void print(int v)
	{
		int x=0;
    for (LinkedList<Integer> l:g ) {
    	System.out.println("Vertex "+x+" is connected to");
    	for ( int i:l ) {
    		System.out.print(i+" ");
    	}
    	System.out.println();
    	x++;
    }
	}
 public static void main(String[] args) {
 	Scanner ob=new Scanner(System.in);
 	int v=ob.nextInt();
 	int e=ob.nextInt();
 	Graph obj=new Graph(v);
 	for(int i=0;i<e;i++)
 	{
 		obj.connection(ob.nextInt(),ob.nextInt());
 	}
 	obj.print(v);
 }
}