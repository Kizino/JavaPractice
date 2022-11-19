package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a number, n, return an array containing n unique random numbers between 1-10, inclusive. (That is, do not repeat any numbers in the returned list.)
 * You can trust that this function will never be called with n < 0 or n > 10.
 *
 * For example:
 * luckyNumbers(2) => might return [3, 7]
 * luckyNumbers(6) => might return [1, 7, 9, 6, 5, 2]
 */

public class LuckyNumber {

    public static List<Integer> luckyNumbers(int n){
        List<Integer> intList = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            intList.add(i);
        }
        Collections.shuffle(intList);
        return intList.subList(0,n);
    }

    static void main(String[] args) {
        System.out.println(luckyNumbers(4));
        System.out.println(luckyNumbers(3));
        System.out.println(luckyNumbers(6));
        System.out.println(luckyNumbers(7));
        System.out.println(luckyNumbers(10));
    }
}
