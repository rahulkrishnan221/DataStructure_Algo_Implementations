class Coinchange_recursive
{
	public static void main(String[] args) {
		int coins[]={2,3,5};
		System.out.println(change(19,coins));
	}

	static int  change(int money, int coins[])
	{
		if(money==0)
			return 0;
		int minnumbercoin=9999999;
		int numbercoin=9999999;
		for(int i=0;i<coins.length;i++)
		{
			if(money>=coins[i])
		 numbercoin=change(money-coins[i],coins);
	if(numbercoin+1<minnumbercoin)
		minnumbercoin=numbercoin+1;
	}
	return minnumbercoin;
	}
}