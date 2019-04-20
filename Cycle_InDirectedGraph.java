class Cycle_InDirectedGraph
{
    int globalflag;
    public boolean isCyclic(int v,LinkedList<Integer>[] alist,boolean[] visited,boolean[] explored) 
     {
         int flag=0;
         globalflag=0;
      for(int i=0;i<v;i++)
      {
          explored[i]=true;
          path(i,alist,visited,flag);
          if(globalflag==1)
          return true;
      }
      return false;
     }
     
     void path(int src,LinkedList<Integer> alist[],boolean visited[],int flag)
     {
         if(flag==1)
         {
             globalflag=1;
             return;
         }
         visited[src]=true;
         for(Integer i:alist[src])
         {
             if(visited[i]==true)
             {
                 flag=1;
                 globalflag=1;
                 break;
             }
             path(i,alist,visited,flag);
         }
         visited[src]=false;
     }
     
}