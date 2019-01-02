import java.util.*;
class fibonacci_dynamic
{
	int arr[];
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		fibonacci_dynamic obj=new fibonacci_dynamic();
		int n=ob.nextInt();
		obj.arr=new int[n];
		obj.fibo(n);
for (int i=0;i<n ;i++ ) {
	System.out.println(obj.arr[i]);
}
	}
	void fibo(int n)
	{
		arr[0]=0;
		arr[1]=1;
		for (int i=2;i<n ;i++ ) {
			arr[i]=arr[i-1]+arr[i-2];
		}

	}
}