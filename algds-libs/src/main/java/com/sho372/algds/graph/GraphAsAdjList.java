package com.sho372.algds.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * G(V,E)
 */
public class GraphAsAdjList implements G {

    private int V;
    private List<Integer>[] adjacencyList;

    /**
     *
     * @param V vertices number of the graph
     */
    @SuppressWarnings("unchecked")
    public GraphAsAdjList(int V) {
        this.V = V;
        this.adjacencyList = new List[V];
        for (int i = 0; i < V; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
    }

    @Override
    public void addDirectedEdge(int i, int j) {
        this.adjacencyList[i].add(j);
    }

    @Override
    public void addUnDirectedEdge(int i, int j) {
        this.adjacencyList[i].add(j);
        this.adjacencyList[j].add(i);
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
    public List<Integer> outEdges(int i) {
        return null;
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
    public void printGraph() {
        for (int i = 0; i < adjacencyList.length; i++) {
            System.out.print("\nvertex " + i + "|");
            for (int j = 0; j < adjacencyList[i].size(); j++) {
                System.out.print(" -> "+adjacencyList[i].get(j));
            }
        }
    }

    //TODO: Remove later
    public List<Integer>[] getAdjacencyList() {
        return adjacencyList;
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

        graph.printGraph();

        // #2 Undirected
        // Create the graph
        int V2 = 3;
        GraphAsAdjList graph2 = new GraphAsAdjList(V2);

        System.out.println();

        graph2.addUnDirectedEdge(0,1); // a <-> b
        graph2.addUnDirectedEdge(1,2); // b <-> c
        graph2.addUnDirectedEdge(2,0); // c <-> a

        graph2.printGraph();
    }
}
