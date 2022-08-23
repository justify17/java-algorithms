package algorithms;

import algorithms.helperClasses.breadthFirstSearch.Graph;
import algorithms.helperClasses.breadthFirstSearch.Tree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class BreadthFirstSearchTest {

    @Test
    void treeRun() {
        Tree<Integer> root = Tree.of(50);

        Tree<Integer> firstNode = root.addChild(25);
        firstNode.addChild(10);

        root.addChild(45);

        assertEquals(Tree.of(10), BreadthFirstSearch.treeRun(10, root));
        assertNull(BreadthFirstSearch.treeRun(20, root));
    }

    @Test
    void graphRun() {
        Graph<String> root = Graph.of("Root");
        Graph<String> alice = Graph.of("Alice");
        Graph<String> bob = Graph.of("Bob");

        root.connect(alice);
        root.connect(bob);

        Graph<String> peggi = Graph.of("Peggi");
        alice.connect(peggi);

        Graph<String> anuj = Graph.of("Anuj");
        bob.connect(anuj);
        bob.connect(peggi);

        Graph<String> tom = Graph.of("Tom");
        peggi.connect(tom);

        assertEquals(Graph.of("Tom"), BreadthFirstSearch.graphRun("Tom", root));
        assertNull(BreadthFirstSearch.graphRun("Jonny", root));
    }
}