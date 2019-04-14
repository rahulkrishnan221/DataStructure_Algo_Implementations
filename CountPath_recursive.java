class CountPath_recursive
{
	int r;
	int c;
	boolean space[][];
	CountPath_recursive(int row,int col)
	{
  this.r=row;
  this.c=col;
  space=new boolean[row][col];
	}
     void initobstacle(int row,int col)
     {
     	space[row][col]=true;
     }

  int pathcount(boolean grid[][],int row,int col)
     {
     	if (!validSquare(grid,row,col)) {
     		return 0;
     	}
     	if (isEnd(grid,row,col)) {
     		return 1;
     	}
     	else
     	{
     		return pathcount(grid,row+1,col)+pathcount(grid,row,col+1);
     	}
     }
boolean validSquare(boolean grid[][],int row,int col)
{ 
	if (row>=r ||col>=c) {
		return false;
	}
	else if (grid[row][col]) {
		return false;
	}
	else
		return true;
}
boolean isEnd(boolean grid[][],int row,int col)
{
	if (row==r-1 && col==c-1 ) {
		return true;
	}
	else
		return false;
}

	public static void main(String[] args) {
		//obstacle as true free as false

CountPath_recursive g=new CountPath_recursive(4,4);
g.initobstacle(0,1);
g.initobstacle(0,2);
g.initobstacle(1,2);
g.initobstacle(1,3);
g.initobstacle(2,0);
g.initobstacle(2,3);
g.initobstacle(3,0);
System.out.println("Paths Available");
System.out.println(g.pathcount(g.space,0,0));
	}
}