import java.io.*;
class Flood_Fill
{
	int current;
	public static void main(String[] args)throws IOException {
		Flood_Fill obj=new Flood_Fill();
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(ob.readLine());
		while(t-->0)
		{
			String temp[]=ob.readLine().trim().split("\\s+");
			int n=Integer.parseInt(temp[0]);
			int m=Integer.parseInt(temp[1]);
			temp=ob.readLine().trim().split("\\s+");
			int tempc=0;
			int arr[][]=new int[n][m];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
				arr[i][j]=Integer.parseInt(temp[tempc++]);
				}
			}
			temp=ob.readLine().trim().split("\\s+");
			int x=Integer.parseInt(temp[0]);
			int y=Integer.parseInt(temp[1]);
			int k=Integer.parseInt(temp[2]);
			obj.current=arr[x][y];
             obj.flood(x,y,arr,k,n,m);
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
				System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}

		}
	}
	boolean isValid(int x,int y,int n,int m,int arr[][])
	{
		if (x<n && y<m && x>=0 && y>=0 ) {
			if(arr[x][y]==current)
			return true;
		}
		return false;
	}
	void flood(int x,int y,int arr[][],int k,int n,int m)
	{
		if(isValid(x,y,n,m,arr))
		{
			arr[x][y]=k;
			flood(x+1,y,arr,k,n,m);
		flood(x,y+1,arr,k,n,m);
		flood(x-1,y,arr,k,n,m);
		flood(x,y-1,arr,k,n,m);
		}
	
		
	}
}