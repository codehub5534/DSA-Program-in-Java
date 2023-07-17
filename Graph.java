package com.amit.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<String, List<String>> adjacencyList=new HashMap<>();

    public boolean addEdge(String v1,String v2){
        if(adjacencyList.get(v1)!=null&&adjacencyList.get(v2)!=null){
            adjacencyList.get(v1).add(v2);
            adjacencyList.get(v2).add(v1);
            return true;
        }
        return false;
    }

    public boolean addVertex(String v1){
        if(adjacencyList.get(v1)==null){
            adjacencyList.put(v1,new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean removeEdge(String v1,String v2){
        if(adjacencyList.get(v1)!=null&&adjacencyList.get(v2)!=null){
            adjacencyList.get(v1).remove(v2);
            adjacencyList.get(v2).remove(v1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String v1){
        if(adjacencyList.get(v1)!=null){
           List<String> edgesfromVertx= adjacencyList.get(v1);
           for(String str:edgesfromVertx){
               adjacencyList.get(str).remove(v1);
           }
           adjacencyList.remove(v1);
            return true;
        }
        return false;
    }

    public List<String> getAllVertex(){
        if(adjacencyList.isEmpty()){
            return new ArrayList<>();
        }
        return adjacencyList.keySet().stream().toList();
    }


    public void printList(){
        System.out.println(adjacencyList);
    }

    public static void main(String args[]){
        Graph graph=new Graph();
        graph.addVertex("A");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addEdge("A","C");
        graph.addEdge("A","D");
        graph.addEdge("C","D");
        graph.printList();
    }
}
