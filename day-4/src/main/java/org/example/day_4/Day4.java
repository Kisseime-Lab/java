/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.example.day_4;

import org.example.day_4.project_1.FilterEvenNumber;

/**
 *
 * @author ktevot
 */
public class Day4 {

    public static void main(String[] args) {
        FilterEvenNumber filterEvenNumber = new FilterEvenNumber();
        System.out.println("Numbers : " + filterEvenNumber.getNumbers());
        System.out.println("Filtered : " + filterEvenNumber.filter());
    }
}
