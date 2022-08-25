package algorithms;

import algorithms.helperClasses.greedyAlgorithm.Element;

import java.util.HashSet;
import java.util.Set;

public class GreedyAlgorithm {

    private GreedyAlgorithm() {
    }

    public static <T> Set<Element<T>> run(Set<T> values, Set<Element<T>> elements) {
        Set<T> neededValues = new HashSet<>(values);
        Set<Element<T>> result = new HashSet<>();

        while (!neededValues.isEmpty()) {
            Element<T> bestElement = null;
            long bestCoveredValues = 0;

            for (Element<T> element : elements) {
                long coveredValues = neededValues.stream()
                        .filter(neededValue -> element.getValues().contains(neededValue))
                        .count();

                if (coveredValues > bestCoveredValues) {
                    bestElement = element;
                    bestCoveredValues = coveredValues;
                }
            }

            if (bestElement != null) {
                neededValues.removeAll(bestElement.getValues());
                result.add(bestElement);
            }
        }

        return result;
    }
}