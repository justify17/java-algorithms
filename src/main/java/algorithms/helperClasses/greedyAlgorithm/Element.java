package algorithms.helperClasses.greedyAlgorithm;

import lombok.Data;

import java.util.Set;

@Data
public class Element<T> {
    private String name;
    private Set<T> values;

    public Element(String name, Set<T> values) {
        this.name = name;
        this.values = values;
    }
}
