import java.util.*;
class catalanrecursive
{
	public static void main(String[] args) {
		catalanrecursive obj=new catalanrecursive();
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
        System.out.println(obj.catalannumber(n));
	}
	int catalannumber(int n)
	{
		int res=0;
		if(n<=1)
			return 1;
		for(int i=0;i<n;i++)
		{
			res+=catalannumber(i)*catalannumber(n-i+1);
		}
		return res;
	}
}