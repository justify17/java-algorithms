package algorithms;

import algorithms.helperClasses.greedyAlgorithm.Element;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GreedyAlgorithmTest {

    @Test
    void run() {
        Set<String> values = Set.of("mt", "wa", "or", "id", "nv", "ut", "ca", "az");

        Element<String> elemOne = new Element<>("First Element", Set.of("id", "nv", "ut"));
        Element<String> elemTwo = new Element<>("Second Element", Set.of("wa", "id", "mt"));
        Element<String> elemThree = new Element<>("Third Element", Set.of("or", "nv", "ca"));
        Element<String> elemFour = new Element<>("Fourth Element", Set.of("nv", "ut"));
        Element<String> elemFive = new Element<>("Fifth Element", Set.of("ca", "az"));

        Set<Element<String>> elements = Set.of(elemOne, elemTwo, elemThree, elemFour, elemFive);

        assertTrue(GreedyAlgorithm.run(values, elements).containsAll(Set.of(elemTwo, elemThree, elemFive)));
    }
}