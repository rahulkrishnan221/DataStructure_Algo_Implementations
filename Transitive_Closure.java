import java.util.*;
import java.lang.*;
import java.io.*;
class Transitive_Closure
 {
	public static void main (String[] args)throws IOException
	 {
	     BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	     
	int t=Integer.parseInt(ob.readLine());
	while(t-->0)
	{
	    int n=Integer.parseInt(ob.readLine().trim());
	    int arr[][]=new int[n][n];
	   String s[]=ob.readLine().trim().split("\\s+");
	   int count=0;
	   for(int i=0;i<n;i++)
	   {
	       for(int j=0;j<n;j++)
	       {
	           arr[i][j]=Integer.parseInt(s[count++]);
	           if(i==j)
	           arr[i][j]=1;
	       }
	   }
	   closure(arr,n);
	   for(int i=0;i<n;i++)
	   {
	       for(int j=0;j<n;j++)
	       {
	       System.out.print(arr[i][j]+" ");
	       }
	   }
	   System.out.println();
	}
	 }
	static void closure(int arr[][],int n)
	 {
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(arr[i][j]==1 && i!=j)
	            {
	               dfs(arr,i,j,n); 
	            }
	        }
	    }
	 }
	 
	static void dfs(int arr[][],int x,int y,int n)
	 {
	    
	      
	          for(int j=0;j<n;j++)
	          {
	              if(arr[y][j]==1 && j!=y && j!=x)
	              {
	                  if(arr[x][j]!=1)
	                  {
	                      arr[x][j]=1;
	                      dfs(arr,x,j,n);
	                  }
	              }
	      }
	 }
	 
}