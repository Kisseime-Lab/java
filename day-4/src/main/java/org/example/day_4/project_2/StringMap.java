package org.example.day_4.project_2;

import java.util.List;

public class StringMap {
    private List<String> chaines = List.of("one", "two", "three", "four", "five");

    public List<String> getChaines() {
        return chaines;
    }

    public List<Integer> getLength() {
        return chaines.stream().map(String::length).toList();
    }
}
