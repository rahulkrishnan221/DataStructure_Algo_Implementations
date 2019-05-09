class Coinchange_greedy
{
	public static void main(String[] args) {
		int available_coin[]={1,2,5,10,50,100,200,500,2000};
change(available_coin,2984);
	}

	static void change(int available_coin[],int cost)
	{
       for(int i=available_coin.length-1;i>=0;i--)
       {
       	while(true)
       	{
       		if(cost>=available_coin[i])
       		{
       			System.out.print(available_coin[i]+" ");
       			cost-=available_coin[i];
       		}
       		else
       			break;
       	}
       }
	}
}