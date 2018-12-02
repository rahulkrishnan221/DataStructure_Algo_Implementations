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
else
{
	if (trav.right==null) {
		trav.right=n;
		break;

		
	}
	trav=trav.right;
}
}
}
else
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
else
{
	if (trav.right==null) {
		trav.right=n;
		break;

		
	}
	trav=trav.right;
}
}
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
        System.out.println("Inorder traversal");
        t.printin();
        System.out.println("Preorder traversal");
        t.printpre();
         System.out.println("Postorder traversal");
        t.printpos();
	}
}
