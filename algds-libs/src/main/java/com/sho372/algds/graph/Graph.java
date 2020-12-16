package com.sho372.algds.graph;

import java.util.List;

public interface Graph {

    public int nVertices();
    public void addEdge(int i, int j);
    public void removeEdge(int i, int j);
    public boolean hasEdge(int i, int j);
    public List<Integer> outEdges(int i);
    public List<Integer> inEdge(int i);
    public int outDegree(int i);
    public int inDegree(int i);
}
