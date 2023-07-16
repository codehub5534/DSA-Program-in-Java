package com.amit.dsa.hashset;

public class HashSet {
    private Node[] nodesMap;
    private int size;

    public HashSet(int size){
        this.size=size;
        nodesMap=new Node[size];
    }

    // to get cash take the sum of Ascii value of all characters multiplied by any random prime number and
    //modulo by size
    private int hashValue(String key){
        if(key!=null){
            int sum=0;
            char[] chars=key.toCharArray();
            for(int i=0;i<chars.length;i++){
                sum=sum+chars[i]*29;
            }
            return sum%size;

        }
        return -1;
    }

    public void set(String key,int value){
        if(key==null){
            return;
        }
        Node newNode=new Node(key,value);
        int idx =hashValue(key);
        Node tmp =nodesMap[idx];
        if(tmp==null){
            nodesMap[idx]=newNode;
        }else {
            while (tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.next=newNode;
        }
    }

    public int get(String key){
        if(key==null){
            return -1;
        }
        int idx=hashValue(key);
        Node node =nodesMap[idx];
        while(node!=null){
            if(node.key.equals(key)){
                return node.value;
            }
        }
        return -1;
    }

    public void printSet(){
        if(nodesMap==null){
            return;
        }
        for(int i=0;i<nodesMap.length;i++){
            Node tmp=nodesMap[i];
            System.out.println("Node idx:"+i+":");
            while (tmp!=null){
                System.out.print("key:"+tmp.key+" value:"+tmp.value);
                tmp=tmp.next;
            }
        }
    }
    class Node {
        String key;
        int value;
        Node next;

        Node(String key,int value){
            this.key=key;
            this.value=value;
        }
    }

    public static void main(String args[]){
        HashSet hs=new HashSet(7);
        hs.set("abcd",12);
        hs.set("abcdef",15);
        hs.set("mnop",13);
        hs.set("test",7);
        hs.set("pqrs",8);
        hs.printSet();
    }
}
