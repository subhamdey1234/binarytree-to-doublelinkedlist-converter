class node
{
    int data;
    node right,left;

node(int data)
{
    this.data=data;
    left=right=null;

}

public class binarytree{

node head;
node root;
node prev=null;

void binarytodll(node root)
    {
if(root==null)
{
    return;
}
binarytodll(root.left);
if(prev==null)
{
    head=root;
}
else{
    root.left=prev;
    prev.right=root;
}
prev=root;
binarytodll(root.right);


    }

    void printlist(node n)
    {
        while(n!=null){
        
    
System.out.println(n.data);
n=n.right;
    }
}



public  void main(String[] args)
{
   binarytree tree = new binarytree();
    tree.root = new node(10);
    tree.root.left = new node(12);
    tree.root.right = new node(15);
    tree.root.left.left = new node(25);
    tree.root.left.right = new node(30);
    tree.root.right.left = new node(36);

tree.binarytodll(tree.root);
tree.printlist(tree.head);

}
}
}
