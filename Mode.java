package org.example;

import java.util.*;

//The “mode” of a list is the set of item(s) that occur the most often. For example, in [1, 2, 2, 3], 2 is the most commonly-occurring item.
//        Where there is a tie, the mode is all items that are tied for most common: in [1, 1, 2, 2, 3], the mode is both 1 and 2.
//        In this challenge, you should write a function that returns the mode.
//
//        It should always return a set, even if there’s only one item in the set:
//        mode([1]) => {1}
//        mode([1, 2, 2, 2]) => {2}
//        mode([1, 1, 2, 2]) => {1, 2}
public class Main {

    static HashSet<Integer> mode(int[] values){
        // Check if Empty Array
        // If input array is empty return empty set
        if(values.length != 0){
            // Create HashMap and add value from input array to HashMap
            // Increase Key's value if duplicate key
            Map<Integer, Integer> numberMap = new HashMap<>();

            for (Integer item: values){
                if(numberMap.get(item) != null) {
                    numberMap.put(item,numberMap.get(item) + 1);
                }else {
                    numberMap.put(item, 1);
                }
            }

            // Find the highest value in the HashMap
            int highestValue = numberMap
                    .entrySet()
                    .stream()
                    .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
                    .get()
                    .getValue();

            // Loop through HashMap
            // Find item(s) that has value equal the highest value
            // Add the key of those item into a set and return that set
            HashSet<Integer> resultSet = new HashSet<>();
            numberMap
                    .entrySet()
                    .stream()
                    .filter(item -> item.getValue() == highestValue)
                    .forEach(item -> resultSet.add(item.getKey()));

            return resultSet;
        }else{
            return new HashSet<>();
        }
    }

    public static void main(String[] args) {
//        int[] input = {1, 2, 2, 2,3,1,5,5,5};
//        int[] input = {1};
        int[] input = {};
        System.out.println(mode(input));


    }
}
