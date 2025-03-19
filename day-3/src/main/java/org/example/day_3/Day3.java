/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.example.day_3;

import java.util.ArrayList;
import java.util.List;

import org.example.day_3.project_1.OrderedList;

/**
 *
 * @author ktevot
 */
public class Day3 {

    public static void main(String[] args) {
        OrderedList oList = new OrderedList(new ArrayList<>(List.of("Paul", "Jean", "Lorem", "Ipsum")));
        oList.order();
        System.out.println("ordered list : " + oList.display());
        oList.orderReversed();
        System.out.println("reverse order list :"  + oList.display());
        oList.order();
        oList.orderReversedWithCustomComparator();
        System.out.println("reverse order list :"  + oList.display());
        oList.order();
        oList.orderReversedWithLambdaComparator();
        System.out.println("reverse order list :"  + oList.display());

    }
}
