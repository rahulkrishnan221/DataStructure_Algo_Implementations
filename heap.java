class MinHeap
{
	int harr[];
	int capacity;
	int heap_size;
	MinHeap(int capacity)
	{
		this.capacity=capacity;
		this.heap_size=0;
		harr=new int[capacity];
	}
	int parent(int i)
	{
	 return (i-1)/2;
	}
	int left(int i)
	{
		return (2*i)+1;
	}
	int right(int i)
	{
		return (2*i)+2;
	}
void swap(int i,int j)
{
	int temp=harr[j];
	harr[j]=harr[i];
	harr[i]=temp;
}

//Inserting key in the heap
	void insertKey(int key)
	{
		if(heap_size==capacity)
			System.out.println("heap Overflow");
		heap_size++;
		int i=heap_size-1;
		harr[i]=key;

//If heap violated then this will help to restore
		while(i!=0 && harr[parent(i)]>harr[i])
		{
           swap(i,parent(i));
           i=parent(i);
		}
	}

	//Getting the Minimum in the heap
	int getMin()
	{
		return harr[0];
	}

	//replacing the key with new key for that index
	void decreaseKey(int i,int new_key)
	{
		harr[i]=new_key;
		while(i!=0 && harr[parent(i)]>harr[i])
		{
			swap(i,parent(i));
			i=parent(i);
		}
	}
    //this function is used to restore the heap state
	void MinHeapify(int i)
	{
         int l=left(i);
         int r=right(i);
         int smallest=i;
         if(l<heap_size && harr[i]>harr[l])
         	smallest=i;
         if(r<heap_size && harr[smallest]>harr[r])
         	smallest=r;
         if (i!=smallest) {
         	swap(i,smallest);
         	MinHeapify(smallest);
         	
         }
	}

	//remove the minimum number then heapify it
	int removeMin()
	{
		if(heap_size<=0)
			return -1;
		if(heap_size==1)
		{
			heap_size--;
			return harr[0];
		}
		int root =harr[0];
		harr[0]=harr[heap_size-1];
		heap_size--;
		MinHeapify(0);
		return root;
	}

	//delete the key first by replacing the element min value
	//then remove that minimum value
	//And heapify it 
	int deleteKey(int i)
	{
		decreaseKey(i,Integer.MIN_VALUE);
		int val=removeMin();
		return val;

	}


}

class heap
{
	public static void main(String[] args) {
		MinHeap obj=new MinHeap(3);
		obj.insertKey(5);
		obj.insertKey(3);
		obj.insertKey(1);
		System.out.println(obj.getMin());
		
	}
}