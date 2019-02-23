class selection_sort
{
	int A[];
	public static void main(String[] args) {
		selection_sort obj=new selection_sort();
		obj.A=new int[]{9,8,4,1,3,5};
		obj.A=obj.sort(obj.A,0,6);
		for (int i=0;i<6 ;i++ ) {
			System.out.println(obj.A[i]+" ");
			
		}

	}
	int[] sort(int A[],int start,int n)
	{
		if(start<=n-1)
			{
int minpos=start;
		for(int i=start+1;i<n;i++)
		{

         if(A[minpos]>A[i])
         	minpos=i;
		}
		int temp=A[minpos];
		A[minpos]=A[start];
		A[start]=temp;
		sort(A,start+1,n);
	}
		return A;

	}
}