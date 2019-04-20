class Cycle_InUndirectedGraph
{
    static boolean dfs(int v,LinkedList<Integer>[] alist,boolean[] visited,int p){
        visited[v]=true;
        for(int ele:alist[v])
            if(visited[ele]==false){
               if(dfs(ele,alist,visited,v))
                    return true;
            }
            else if(p!=ele)
                    return true;
        }
        return false;
    }
    Boolean isCyclic(int V,LinkedList<Integer>[] alist)
    {
       //for undirected cycle detect
       boolean[] visited=new boolean[V];
       for(int i=0;i<V;i++){
           if(visited[i]==false){
                if(dfs(i,alist,visited,-1))
                    return true;
            }
       }
       return false;
    }
}