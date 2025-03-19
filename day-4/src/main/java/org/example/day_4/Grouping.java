package org.example.day_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    private List<Person> personnes = new ArrayList<>();

    public Grouping() {

        // Ajout de personnes à la liste
        personnes.add(new Person("Paris", "Jean"));
        personnes.add(new Person("Lyon", "Marie"));
        personnes.add(new Person("Marseille", "Pierre"));
        personnes.add(new Person("Toulouse", "Sophie"));
        personnes.add(new Person("Nice", "Luc"));
    }

    public List<Person> getPersonnes() {
        return personnes;
    }

    public Map<String, List<Person>> group() {
        return personnes.stream().collect(Collectors.groupingBy(Person::ville));
    }
    
}

record Person(String ville, String nom) {}