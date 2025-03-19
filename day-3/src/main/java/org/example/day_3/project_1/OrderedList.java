package org.example.day_3.project_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class OrderedList {
    private List<String> noms = new ArrayList<>();

    public OrderedList(List<String> list) {
        this.noms = list;
    }

    public Collection<String> getNoms() {
        return noms;
    }
    public void order() {
        Collections.sort(noms);
    }
    public void orderReversed() {
        Collections.sort(noms, Collections.reverseOrder());
    }
    public void orderReversedWithCustomComparator() {
        Collections.sort(noms, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
    }
    public void orderReversedWithLambdaComparator() {
        Collections.sort(noms, (s1, s2) -> s2.compareTo(s1));
    }
    public String display() {
        StringBuilder s = new StringBuilder();
        for (Iterator<String> i = noms.iterator(); i.hasNext();) {
            s.append(i.next() + " - ");
        }
        return s.toString();
    }
}
