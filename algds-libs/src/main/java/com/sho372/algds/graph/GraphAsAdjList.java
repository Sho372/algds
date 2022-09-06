package com.sho372.algds.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * G(V,E)
 */
public class GraphAsAdjList implements Graph {

    //https://stackoverflow.com/questions/4525642/java-final-arraylist/4526611#:~:text=When%20you%20say-,final%20ArrayList%20list%20%3D%20new%20ArrayList()%3B,it%20has%20received%20its%20value.
    private int V;
    private final HashMap<Integer, HashSet<Integer>> adjacencyList;

    /**
     *
     * @param V vertices number of the graph
     */
    public GraphAsAdjList(int V) {
        this.V = V;
        this.adjacencyList = new HashMap<>();
        for (int i = 0; i < V; i++) {
            adjacencyList.put(i, new HashSet<>());
        }
    }

    @Override
    public void addDirectedEdge(int i, int j) {
        this.adjacencyList.get(i).add(j);
    }

    @Override
    public void addUnDirectedEdge(int i, int j) {
        this.adjacencyList.get(i).add(j);
        this.adjacencyList.get(j).add(i);
    }

    @Override
    public int nVertices() {
        return 0;
    }

    @Override
    public void removeEdge(int i, int j) {

    }

    @Override
    public boolean hasEdge(int i, int j) {
        return false;
    }

    @Override
    public HashSet<Integer> neighbors(int v) {
        return adjacencyList.get(v);
    }

    @Override
    public List<Integer> inEdge(int i) {
        return null;
    }

    @Override
    public int outDegree(int i) {
        return 0;
    }

    @Override
    public int inDegree(int i) {
        return 0;
    }

    @Override
    public void print() {
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print("\nvertex " + i + "|");
            for (int j :adjacencyList.get(i)) {
                System.out.print("-> " + j);
            }
        }
    }

    public static void main(String[] args) {

        // #1 Directed
        // Create the graph
        int V = 3;
        GraphAsAdjList graph = new GraphAsAdjList(V);

        graph.addDirectedEdge(0,2); // a -> c
        graph.addDirectedEdge(1,0); // b -> a
        graph.addDirectedEdge(1,2); // b -> c
        graph.addDirectedEdge(2,1); // c -> b

        graph.print();

        // #2 Undirected
        // Create the graph
        int V2 = 3;
        GraphAsAdjList graph2 = new GraphAsAdjList(V2);

        System.out.println();

        graph2.addUnDirectedEdge(0,1); // a <-> b
        graph2.addUnDirectedEdge(1,2); // b <-> c
        graph2.addUnDirectedEdge(2,0); // c <-> a

        graph2.print();
    }
}
