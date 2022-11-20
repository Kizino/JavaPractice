package org.example;

//Binary search is one of the most important Computer Science algorithms.
//        It allows you to search a sorted list in O(log n) time, a large improvement over scanning every item in the list (which would be O(n) time).
//        To do this, you examine the middle item and, if the sought-for value is smaller, move halfway to the left.
//        If the sought-after value is larger, move halfway to the right.
//        In this challenge, you’ll make binary search for the classic children’s guessing game of “pick a number from 1 to 100”.
//
//        Since you use binary search, it will never take more than 7 guesses for a function to find a number in the range 1 to 100
//        (since log2 100) is just a little under 7).
//
//        For Example:
//        binarySearch(50) => 1
//        binarySearch(25) => 2
//        binarySearch(75) => 2
//        binarySearch(31) <= 7 => true

public class Main {
    static int binarySearch(int choice) {
        int lowLimit = 0;
        int highLimit = 101;
        int mid = 0;
        int increment = 0;

        while(true){
            increment++;
            mid = (lowLimit + highLimit ) / 2;
            if(choice > mid){
                lowLimit = mid;
            } else if (choice < mid ) {
                highLimit = mid;
            }else {
//                System.out.println("BINGO!");
                break;
            }
        }
        return increment;
    }

    public static void main(String[] args) {
        // Test Cases
        for(int i = 1; i<= 100; i++){
            int result = binarySearch(i);
//            System.out.println("Found " + i + " in: " +  result + " times");

            if(result >7){
                System.out.println("This doesnt look right! Choice: " + i + " Found in: " + result);
            }
        }
    }
}
