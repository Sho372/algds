package com.sho372.algds.string;

import com.sho372.algds.graph.GraphAsAdjList;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GraphAsAdjListTest {

    @Test
    public void testAddDirectedEdge() {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        int V = 6;
        GraphAsAdjList graph = new GraphAsAdjList(V);

        for (int j:set) {
            graph.addDirectedEdge(0,j);
        }

        Set<Integer> neighbors =  graph.neighbors(0);
        assertTrue(set.containsAll(neighbors));
        assertEquals(0, graph.neighbors(1).size());
        assertEquals(0, graph.neighbors(2).size());
        assertEquals(0, graph.neighbors(3).size());
        assertEquals(0, graph.neighbors(4).size());
        assertEquals(0, graph.neighbors(5).size());
    }

    @Test
    public void testAddUnDirectedEdge() {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        int V = 6;
        GraphAsAdjList graph = new GraphAsAdjList(V);

        for (int j:set) {
            graph.addUnDirectedEdge(0,j);
        }

        Set<Integer> neighbors =  graph.neighbors(0);
        assertTrue(set.containsAll(neighbors));
        assertEquals(Integer.valueOf(0), graph.neighbors(1).iterator().next());
        assertEquals(Integer.valueOf(0), graph.neighbors(2).iterator().next());
        assertEquals(Integer.valueOf(0), graph.neighbors(3).iterator().next());
        assertEquals(Integer.valueOf(0), graph.neighbors(4).iterator().next());
        assertEquals(Integer.valueOf(0), graph.neighbors(5).iterator().next());
    }
}
