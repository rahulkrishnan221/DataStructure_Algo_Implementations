import java.util.*;
class dijkstra
{
	public static void main(String[] args) {
		dijkstra dj=new dijkstra();
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		while(t-->0)
		{
			int n=ob.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++ ) {
				
				arr[i][j]=ob.nextInt();
			}
		}
		int source=ob.nextInt();
		dj.shortestpath(source,n,arr);
		}
	}

	void shortestpath(int source,int n,int arr[][])
	{
		boolean visited[]=new boolean[n];
		int distance[]=new int[n];
		for (int i=0;i<n;i++ ) {
			distance[i]=Integer.MAX_VALUE;
		}
		distance[source]=0;
		for(int i=0;i<n;i++)
		{
         int u=minimumfinder(distance,n,visited);
         visited[u]=true;
         for(int v=0;v<n;v++)
         {
         	if (visited[v]==false) {
         		if(distance[v]>distance[u]+arr[u][v])
         			distance[v]=distance[u]+arr[u][v];	
         	}
         }
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Source "+source +" to "+i+" cost "+distance[i]);
		}

	}

	int minimumfinder(int distance[],int n,boolean visited[])
	{
		int min=Integer.MAX_VALUE;
		int index=-1;
		for(int i=0;i<n;i++)
		{
               if(distance[i]<min && visited[i]==false)
               {
               	index=i;
                 min=distance[i];
               }
		}
		return index;
	}
}