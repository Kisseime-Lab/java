package org.example.day_4.project_1;

import java.util.List;
import java.util.stream.IntStream;
public class FilterEvenNumber {
    private List<Integer> numbers = IntStream.range(0, 40).boxed().toList();

    public List<Integer> filter() {
        return numbers.stream().filter(n -> n % 2 == 0).toList();
    }
    public List<Integer> getNumbers() {
        return numbers;
    }

}
