import java.util.*;
import java.lang.*;
import java.io.*;
// self loop allowed
class GFG
 {
    static int local=0;
    static int global=0;
	public static void main (String[] args)throws IOException
	 {
	     BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(ob.readLine());
	while(t-->0)
	{
	   int n=Integer.parseInt(ob.readLine().trim());
	   String s[]=ob.readLine().trim().split("\\s+");
	   int q=0;
	  int arr[][]=new int[n][n];
	  for(int i=0;i<n;i++)
	  {
	      for(int j=0;j<n;j++)
	      {
	          arr[i][j]=Integer.parseInt(s[q++]);
	      }
	  }
	String s1[]=ob.readLine().trim().split("\\s+");
	  int sr=Integer.parseInt(s1[0]);
	  int d=Integer.parseInt(s1[1]);
	  int walk=Integer.parseInt(s1[2]);
	  pathcount(arr,n,sr,d,walk);
	  System.out.println(global);
	}
	
	 }
	public static void pathcount(int arr[][],int n,int src,int des,int walk)
	{
	  
	  for(int j=0;j<n;j++)
	  {
	        
	     local=0;
	      if(arr[src][j]==1 )
	      {
	          ++local;
	      dfs(arr,n,j,des,walk);
	      }
	  }
	}
	public static void dfs(int arr[][],int n,int src,int des,int walk)
	{
	   
	    if(local>walk)
	    return;
	      
	   for(int i=0;i<n;i++)
	   {
	       if(src==des && walk==local)
	       {
	       global++;
	       break;
	       }
	       else{
	           if(arr[src][i]==1)
	           {
	               local++;
	           dfs(arr,n,i,des,walk);
	           local--;
	   
	           }
	       }
	
	   }
	       
	  
	}
}