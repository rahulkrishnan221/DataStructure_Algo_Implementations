import java.util.*;
import java.lang.*;
import java.io.*;
class longest_correct_count_paran
 {
	public static void main (String[] args)
	 {
	 Scanner ob=new Scanner(System.in);
	 int t=ob.nextInt();
	 for(int z=0;z<t;z++)
	 {
	     String str=ob.next();
	     int size=str.length();
	     Stack<Integer>st=new Stack<Integer>();
	     int val=0;
	     st.push(-1);
	     for(int i=0;i<size;i++)
	     {
	         char c=str.charAt(i);
	         if(c=='(')
	         {
	             st.push(i);
	         }
	         if(c==')')
	         {
	             st.pop();
	             if(st.empty())
	             {
	                 st.push(i);
	             }
	             else
	             {
	                 val=Math.max(val,i-st.peek());
	             }
	         }
	     }
	     System.out.println(val);
	 }
	 }
}