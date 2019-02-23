class insertion_sort
{
	public static void main(String[] args) {
		int A[]={10,3,2,7,1,5};
		Insertionsort(A,1,6);
		for (int i=0;i<6;i++ ) {
			System.out.println(A[i]);
		}
		
	}

	static void Insertionsort(int A[],int start,int n)
	{
if(start>n-1)
	return;
   Insert(A,start);
   Insertionsort(A,start+1,n);

	}
	static void Insert(int A[],int start)
	{
		int pos=start;
		while(pos>0 && A[pos]<A[pos-1])
		{
			int temp=A[pos];
			A[pos]=A[pos-1];
			A[pos-1]=temp;
			pos=pos-1;
		}
	}
}