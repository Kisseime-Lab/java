package org.example.day_4.project_4;

import java.util.List;

public class UseReduce {
    private List<Double> notes = List.of(14.5, 10.1, 13.5, 9.7, 7.5);

    public List<Double> getNotes() {
        return notes;
    }

    public double mean() {
        double sum = notes.stream().reduce(0.0, (a, b) -> a + b);
        return sum / notes.size();
    }
}
