package org.example.day_2.project_2;

import java.util.Arrays;

public class MaxArray {
    private int[] tab;

    public MaxArray(int[] array) {
        this.tab = array;
    }

    public int max() {
        if (this.tab == null) {
            return 0;
        }
        if (this.tab.length == 0) {
            return 0;
        }
        int result = 0;
        for (int val: tab) {
            if (val > result) {
                result = val;
            }
        }
        return result;
    }

    public int maxWithSort() {
        if (this.tab == null) {
            return 0;
        }
        if (this.tab.length == 0) {
            return 0;
        }
        Arrays.sort(this.tab);
        return this.tab[this.tab.length - 1];
    }
}
