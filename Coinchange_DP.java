import java.util.*;
class Coinchange_DP
{
	static ArrayList<Integer> minnumbercoin;
	public static void main(String[] args) {
       minnumbercoin=new ArrayList<Integer>();
       int coins[]={2,3,5};
       int money=19;
       for(int i=0;i<=money;i++)
       {
       	minnumbercoin.add(9999999);
       }
       minnumbercoin.set(0,0);
        change(money,coins);
       System.out.println(minnumbercoin.get(money));
	}
	static void change(int money,int coins[])
	{
      for(int i=1;i<=money;i++)
      {
      int mincoin=9999999;
      	for(int j=0;j<coins.length;j++)
      	{
              if (i>=coins[j]) {
              	mincoin=minnumbercoin.get(i-coins[j])+1;
              }
              if(mincoin<minnumbercoin.get(i))
              {
              	minnumbercoin.set(i,mincoin);
              }
      	}
      }
   
	}
}