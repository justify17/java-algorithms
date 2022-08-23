package algorithms.helperClasses.breadthFirstSearch;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Tree<T> {
    private T value;
    private List<Tree<T>> children = new ArrayList<>();

    private Tree(T value) {
        this.value = value;
    }

    public static <T> Tree<T> of(T value) {
        return new Tree<>(value);
    }

    public Tree<T> addChild(T value) {
        Tree<T> newChild = new Tree<>(value);
        children.add(newChild);

        return newChild;
    }
}
