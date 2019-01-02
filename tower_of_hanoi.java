import java.util.*;
class tower_of_hanoi
{
	int step;
	public static void main(String[] args) {
		tower_of_hanoi obj=new tower_of_hanoi();
		Scanner ob=new Scanner(System.in);
		int num_of_disk=ob.nextInt();
		obj.step=0;
        obj.hanoi(num_of_disk,1,3,2);
        System.out.println(obj.step);
	}
	void hanoi(int n,int from,int to,int aux)
	{
		if(n==1)
		{
			System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
			step++;
			return;
		}
		else
		{
			hanoi(n-1,from,aux,to);
			step++;
			System.out.println("move disk "+n+" from rod "+from+" to rod "+to);
			hanoi(n-1,aux,to,from);
		}
	}
}