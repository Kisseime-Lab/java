/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.example.day_2;

import org.example.day_2.project_2.MaxArray;

/**
 *
 * @author ktevot
 */
public class Day2 {

    public static void main(String[] args) {
        MaxArray mArray = new MaxArray(new int[]{1, 5, 8, 12, 5, 6});
        System.out.println("Max " + mArray.max());
        System.out.println("Max with BinarySearch " + mArray.maxWithSort());
    }
}
