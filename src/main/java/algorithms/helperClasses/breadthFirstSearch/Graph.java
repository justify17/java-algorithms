package algorithms.helperClasses.breadthFirstSearch;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Graph<T> {
    private T value;
    private Set<Graph<T>> neighbours = new HashSet<>();

    private Graph(T value) {
        this.value = value;
    }

    public static <T> Graph<T> of(T value) {
        return new Graph<>(value);
    }

    public void connect(Graph<T> graph) {
        neighbours.add(graph);
    }
}
