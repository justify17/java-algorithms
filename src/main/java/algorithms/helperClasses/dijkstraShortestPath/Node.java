package algorithms.helperClasses.dijkstraShortestPath;

import lombok.Data;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Data
@ToString(of = {"name"})
public class Node {
    private String name;
    private Map<Node, Integer> adjacentNodes = new HashMap<>();

    public Node(String name) {
        this.name = name;
    }

    public void addNode(Node node, int value) {
        adjacentNodes.put(node, value);
    }
}
