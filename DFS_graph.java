class DFS_graph
{  
    public void DFS(int v,LinkedList<Integer> adj[],boolean visited[])
    {
     Stack<Integer>st=new Stack<Integer>();
     int found=0;
     int nodevisited=0;

     st.push(v);
     do
     {
         found=st.pop();
         if(visited[found]==false)
         {
              for(int j=adj[found].size()-1;j>=0;j--)
         {
             if(visited[adj[found].get(j)]==false)
             st.push(adj[found].get(j));
             
         }
         visited[found]=true;
         nodevisited++;
         System.out.print(found+" ");
         }
        
    }
    while(!st.isEmpty());
}
}