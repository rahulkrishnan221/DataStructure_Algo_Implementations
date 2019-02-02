class optimizedprime
{
	boolean flag[];
public static void main(String[] args) {
	optimizedprime obj=new optimizedprime();
	int max=100;
	obj.flag=new boolean[max+1];
	for (int i=0;i<max;i++ ) {
		obj.flag[i]=true;
	}
	obj.sieveOfEratosthenes(max);
	for (int i=2;i<=max;i++ ) {
		if(obj.flag[i])
			System.out.print(i+" ");
	}

}
public void sieveOfEratosthenes(int max)
{
	for (int i=2;i*i<=max;i++ ) {
		if(flag[i])
		filler(i,max);
	}
}
void filler(int val,int max)
{

	for(int i=val*val;i<=max;i+=val)
	{
	
       flag[i]=false;
	}
}
}