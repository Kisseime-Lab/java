/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.example.day_4;

import org.example.day_4.project_1.FilterEvenNumber;
import org.example.day_4.project_2.StringMap;
import org.example.day_4.project_4.UseReduce;

/**
 *
 * @author ktevot
 */
public class Day4 {

    public static void main(String[] args) {
        FilterEvenNumber filterEvenNumber = new FilterEvenNumber();
        System.out.println("Numbers : " + filterEvenNumber.getNumbers());
        System.out.println("Filtered : " + filterEvenNumber.filter());

        StringMap map = new StringMap();
        System.out.println("Get length : " + map.getLength());
        UseReduce reduce = new UseReduce();
        System.out.println("Moyenne de " + reduce.getNotes() + " = : " + reduce.mean());

        Grouping grouping = new Grouping();
        System.out.println("Grouper par ville: "+ grouping.group());

    }
}
