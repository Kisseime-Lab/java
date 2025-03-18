package org.example.day_2.project_1;

import java.util.Arrays;
public class SumArray {
    private int[] tab;

    public SumArray(int[] array) {
        this.tab = array;
    }

    public int sum() {
        if (this.tab == null) {
            return 0;
        }
        if (this.tab.length == 0) {
            return 0;
        }
        int result = 0;
        for (int num: tab) {
            result += num;
        }
        return result;
    }

    public int sumWithStream() {
        return Arrays.stream(tab).sum();
    }

}
