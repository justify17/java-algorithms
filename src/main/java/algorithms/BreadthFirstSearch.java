package algorithms;

import algorithms.helperClasses.breadthFirstSearch.Graph;
import algorithms.helperClasses.breadthFirstSearch.Tree;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class BreadthFirstSearch {

    private BreadthFirstSearch() {
    }

    public static <T> Tree<T> treeRun(T value, Tree<T> root) {
        Queue<Tree<T>> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Tree<T> currentNode = queue.remove();

            if (currentNode.getValue().equals(value)) {
                return currentNode;
            } else {
                queue.addAll(currentNode.getChildren());
            }
        }

        return null;
    }

    public static <T> Graph<T> graphRun(T value, Graph<T> root) {
        Queue<Graph<T>> queue = new ArrayDeque<>();
        queue.add(root);

        Set<Graph<T>> searched = new HashSet<>();

        while (!queue.isEmpty()) {
            Graph<T> currentNode = queue.remove();

            if (searched.contains(currentNode)) {
                continue;
            }

            if (currentNode.getValue().equals(value)) {
                return currentNode;
            } else {
                queue.addAll(currentNode.getNeighbours());
                searched.add(currentNode);
            }
        }

        return null;
    }
}