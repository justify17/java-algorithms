package algorithms;

import algorithms.helperClasses.dijkstraShortestPath.Node;

import java.util.*;

public class DijkstraShortestPath {

    private DijkstraShortestPath() {
    }

    public static List<Node> run(Node start) {
        Map<Node, Integer> costs = new HashMap<>();
        Map<Node, Node> parents = new HashMap<>();
        List<Node> processed = new ArrayList<>();

        for (Map.Entry<Node, Integer> entry : start.getAdjacentNodes().entrySet()) {
            Node node = entry.getKey();
            Integer cost = entry.getValue();

            costs.put(node, cost);
            parents.put(node, start);
        }

        Node node = findLowestCostNode(costs, processed);

        while (node != null) {
            int cost = costs.get(node);
            Map<Node, Integer> adjacentNodes = node.getAdjacentNodes();

            for (Map.Entry<Node, Integer> entry : adjacentNodes.entrySet()) {
                Node currentNode = entry.getKey();
                int currentCost = entry.getValue();

                int newCost = cost + currentCost;

                if (!costs.containsKey(currentNode) || costs.get(currentNode) > newCost) {
                    costs.put(currentNode, newCost);
                    parents.put(currentNode, node);
                }
            }

            processed.add(node);
            node = findLowestCostNode(costs, processed);
        }

        ArrayList<Node> result = new ArrayList<>();

        Node end = new Node("End");

        while (end != null) {
            result.add(end);
            end = parents.get(end);
        }

        Collections.reverse(result);

        return result;
    }

    private static Node findLowestCostNode(Map<Node, Integer> costs, List<Node> processed) {
        int minCost = Integer.MAX_VALUE;
        Node minNode = null;

        for (Map.Entry<Node, Integer> nodeCost : costs.entrySet()) {
            Node currentNode = nodeCost.getKey();
            int currentCost = nodeCost.getValue();

            if (processed.contains(currentNode)) {
                continue;
            }

            if (currentCost < minCost) {
                minCost = currentCost;
                minNode = currentNode;
            }
        }

        return minNode;
    }
}
