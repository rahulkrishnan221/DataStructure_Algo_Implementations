class money_change_recursive
{
	public static void main(String[] args) {
		money_change_recursive obj=new money_change_recursive();
		int arr[]={2,3,4};
		System.out.println(obj.MoneyChange(5,arr));
	}
	public int MoneyChange(int money,int coins[])
	{

     if(money==0)
     	return 0;
    int  MinNumCoins=10000;
        for (int i=0;i<coins.length;i++ ) {
    	if (money>=coins[i]) {
    		int NumCoins=MoneyChange(money-coins[i],coins);
    		if (NumCoins+1<MinNumCoins) {
    			MinNumCoins=NumCoins+1;
    		}
    		
    	}
    }

    return 	MinNumCoins;
	}
}