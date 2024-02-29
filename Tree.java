class Node{
    int value;
    Node left;
    Node right;

    Node(int x){
        value =x;
        left =null;
        right=null;
    }
}

public class Tree
{
    public static void main(String[] args){
        Node root =new Node(10);
        root.left = new Node(21);
        root.right=new Node(35);
        root.left.left=new Node(31);
        root.left.right=new Node(56);
        root.right.left = new Node(81);
        root.right.right=new Node(73);
        System.out.println(root.value);
        System.out.println(root.left.value);
        System.out.println(root.right.value);
    }
}