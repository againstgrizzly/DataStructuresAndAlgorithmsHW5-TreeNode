import java.io.*;
import java.util.*;
import java.lang.*;

class TreeNode{
    public Object info;
    public TreeNode left, right, father;
    int lCount; // how many leaves are in the left subtree
    boolean isLeft;

    public TreeNode(){
        lCount=0;
        info=left=right=father=null;
        isLeft=false;
    }

    public TreeNode(Object x){
        lCount=0;
        info=x;
        left=right=father=null;
        isLeft=false;
    }

    public void setLeft(Object x){
        if(this.left!=null){
            System.out.println("void insertion");
            return;
        }else{
            TreeNode p=new TreeNode(x);
            p.father=this;
            this.left=p;
            p.isLeft=true;
        }
    }

    public void setRight(Object x){
        if(this.right!=null){
            System.out.println("void insertion");
            return;
        }else{
            TreeNode p=new TreeNode(x);
            p.father=this;
            this.right=p;
            p.isLeft=false;
        }
    }
}


class TreeList{
    TreeNode root;
    int size; // # of elements in the list

    // this constructor creates an empty list
    public TreeList(){
        size=0;
        root=null;
    }

    // this constructor creates a list with only one node
    // that contains x
    public TreeList(Object x){
        size=1;
        root=new TreeNode(x);
    }

    public TreeNode getRoot(){
        return root;
    }

    // In the list, insert x before the (index)th element
    // index begins from zero
    void insertBefore(Object x, int index){
        // insert your code
    }

    // In the list, insert x after the (index)th element
    // index begins from zero
    void insertAfter(Object x, int index){
        // insert your code here
    }

    // delete and return the (index)th element in the list
    // index begins from zero
    Object delete(int index){
        // insert your code here
        return null;
    }

    // look for the tree node that contains (index)th element in the list
    // index begins from zero
    TreeNode getTreeNode(int index){
        // insert your code here
        return null;
    }

    // displays only the leaves in inorder
    public void display(){
        inTrav(root);
    }

    private void inTrav(TreeNode root){
        if(root!=null){
            inTrav(root.left);
            if(root.left==null && root.right==null)
                System.out.print(root.info+",");
            inTrav(root.right);
        }
    }

    public int getSize(){
        return size;
    }
}

public class HW5{
    public static void main(String args[]){

        // create a tree-based list with 9 letters
        TreeList list=new TreeList(new Character('A'));
        list.insertAfter(new Character('H'),0);
        list.insertAfter(new Character('D'),0);
        list.insertAfter(new Character('C'),0);
        list.insertAfter(new Character('B'),0);
        list.insertAfter(new Character('E'),3);
        list.insertBefore(new Character('F'),5);
        list.insertAfter(new Character('G'),5);
        list.insertAfter(new Character('I'),7);

        System.out.print("The list contains ");
        list.display();

        // delete all elements in a random order
        Random rand=new Random();
        while(list.getSize()!=0){
            int i=rand.nextInt(list.getSize());
            System.out.println("\n\nDeleting the "+i+"th element: "+list.delete(i));
            System.out.print("The list contains ");
            if(list.getSize()!=0)
                list.display();
            else
                System.out.print("no element.");
        }
    }
}
