class quick_sort
{
	public static void main(String[] args) {

		int arr[]={10,80,30,90,100,50,70};
		sort(arr,0,arr.length-1);
     for (int x :arr ) {
     	System.out.print(x+" ");
     }
		
	}
	static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	static void sort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int p=partition(arr,low,high);
			sort(arr,low,p-1);
			sort(arr,p+1,high);

		}
	}
	static int partition(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=low-1;
		for (int j=low;j<high;j++ ) {
			if(arr[j]<=pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,high,i+1);
		return i+1;
	}
}