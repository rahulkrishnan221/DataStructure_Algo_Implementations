class BFS_graph
{
    public static void bfs(int s, ArrayList<Integer> adj[],boolean visited[])
    {
          Queue<Integer> st = new LinkedList<>(); 
     int found=0;
     int nodevisited=0;
 
     st.add(s);
     do
     {
         found=st.remove();
         if(visited[found]==false)
         {
              for(int j=0;j<adj[found].size();j++)
         {
             if(visited[adj[found].get(j)]==false)
             st.add(adj[found].get(j));
            
             
         }
         visited[found]=true;
         nodevisited++;
         System.out.print(found+" ");
         }
         
    }
    while(!st.isEmpty());
    }
}