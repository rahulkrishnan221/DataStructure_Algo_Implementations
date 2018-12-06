class Node
{
Node left;
Node right;
int data=0;
Node(int d)
{
	data=d;
	right=null;
	left=null;
}
}
class tree
{
	Node root=null;
void insert(int value)
{
     Node trav=root;
     Node n=new Node(value);
if (root==null) {
	root=n;
}
else if (value<trav.data) {
while(trav!=null)	
{
if (value<trav.data) {
if (trav.left==null) {
	trav.left=n;
	break;
	
}
	trav=trav.left;
}
else if(value>trav.data)
{
	if (trav.right==null) {
		trav.right=n;
		break;

		
	}
	trav=trav.right;
}
else
{
    break;
}
}
}
else if(value>trav.data) 
{
	while(trav!=null)	
{
if (value<trav.data) {
	if (trav.left==null) {
	trav.left=n;
	break;
	
}
	trav=trav.left;
}
else if(value>trav.data)
{
	if (trav.right==null) {
		trav.right=n;
		break;

		
	}
	trav=trav.right;
}
else
{
    break;
}
}
}
else
{
    
}
}
void printin()
{
	inorder(root);
	System.out.println();
}
void printpre()
{
	preorder(root);
	 System.out.println();
}
void printpos()
{
	postorder(root);
	System.out.println();
}
void inorder(Node rt)
{
	if(rt!=null)
	{
	inorder(rt.left);
	System.out.print(rt.data+" ");
	inorder(rt.right);
}
}
void preorder(Node rt)
{
	if(rt!=null)
	{
	System.out.print(rt.data+" ");
	preorder(rt.left);
	preorder(rt.right);
}
}
void postorder(Node rt)
{
	if(rt!=null)
	{
	postorder(rt.left);
	postorder(rt.right);
	System.out.print(rt.data+" ");
}
}
//Finding height of the tree
int maxDepth(Node rt)
{
	if(rt==null)
	{
		return 0;
	}
	else
	{
		int lDepth=maxDepth(rt.left);
		int rDepth=maxDepth(rt.right);
		if (lDepth>rDepth) {
			return lDepth+1;
		}
		else
			return rDepth+1;
	}
}
void levelorder()
{
	int h= maxDepth(root);
	for(int i=1;i<=h;i++)
	{
		printgivenlevel(root,i);
	}

}
void printgivenlevel(Node rt,int level)
{
	if (rt==null) {
		return;
	}
	else if(level==1)
	{
		System.out.print(rt.data+"  ");
	}
	else
	{
		printgivenlevel(rt.left,level-1);
		printgivenlevel(rt.right,level-1);
	}
}

}

class bst
{
	public static void main(String[] args) {
		tree t=new tree();
		t.insert(5);
		t.insert(2);
        t.insert(4);
        t.insert(7);
        t.insert(9);
        t.insert(3);
        t.insert(1);
        t.insert(10);
        t.insert(2);
        System.out.println("Inorder traversal");
        t.printin();
        System.out.println("Preorder traversal");
        t.printpre();
         System.out.println("Postorder traversal");
        t.printpos();
        System.out.println("Height of the tree");
        System.out.println(t.maxDepth(t.root));
        System.out.println("Level order traversal");
        t.levelorder();
	}
}
