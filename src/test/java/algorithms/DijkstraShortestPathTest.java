package algorithms;

import algorithms.helperClasses.dijkstraShortestPath.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DijkstraShortestPathTest {

    @Test
    void run() {
        Node start = new Node("Start");

        Node a = new Node("A");
        Node b = new Node("B");

        Node end = new Node("End");

        start.addNode(a, 6);
        start.addNode(b, 2);

        a.addNode(end, 1);

        b.addNode(a, 3);
        b.addNode(end, 5);

        Assertions.assertEquals(List.of(start, b, a, end), DijkstraShortestPath.run(start));
    }
}