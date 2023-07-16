package com.amit.dsa.binarytree;

public class BinaryTree {
    Node root;

    public BinaryTree(int value){
        Node newNode =new Node(value);
        root=newNode;
    }


    public boolean contains(int value){
        // base check
        if(root==null){
            return false;
        }
        Node tmp=root;// assign root to a temporary var to maintain original tree str
        while (tmp!=null){ // iterate through tree until current node becomes null or value is found
            if(tmp.val==value)return true;
            if(value>tmp.val){
                tmp=tmp.right;
            }else {
                tmp=tmp.left;
            }
        }
        return false;
    }
    public boolean insert(int value){
        Node newNode=new Node(value);
        if(root==null){ //  condition check for null
            root=newNode;
            return true;
        }
        Node tmp=root;
        while (true){ // iterate until correct place of insertion is found
            if(value==tmp.val){
                return false;
            }

            if(value< tmp.val){
                if(tmp.left==null){
                    tmp.left=newNode;
                    return true;
                }
                tmp=tmp.left;
            }else {
                if(tmp.right==null){
                    tmp.right=newNode;
                    return true;
                }
                tmp=tmp.right;
            }
        }
    }
    class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
        }
    }

    public static void main(String args[]){
        BinaryTree bt=new BinaryTree(15);
        bt.insert(14);
        bt.insert(18);
        bt.insert(12);
        bt.insert(25);
        bt.insert(17);
        System.out.println(bt.root.left.left.val);
        System.out.println(bt.root.right.left.val);
        System.out.println(bt.contains(18));
        System.out.println(bt.contains(26));
        System.out.println(bt.contains(14));
    }
}
