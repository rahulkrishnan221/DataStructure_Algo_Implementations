import java.util.*;
// used for finding different BST combos 
// for BT catalan(n)*factorial(n)
class catalannumber_binomial
{
	public static void main(String[] args) {
		catalannumber_binomial obj=new catalannumber_binomial();
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		System.out.println(obj.catalan(n));
	}
	void catalan(int n)
	{
		int count=binomialcoefficient(2*n,n);
		return c/(n+1);
	}
	int binomialcoefficient(int n,int k)
	{
		int res=1;
		if(k>n-k)
			k=n-k;
		for (int i=0;i<k;i++ ) {
			res*=(n-i);
			res/=(i+1);
		}
		return res;
	}
}