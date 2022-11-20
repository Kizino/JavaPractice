package org.example;

//Given a string, return a new string that is the original string, reversed. Do this with recursion, not a for loop.
//
//        For example, as “porcupine” would reverse to “enipucrop”:
//        recursiveReverse("porcupine") => "enipucrop";

public class Main {
    static String recursiveReverse(String value) {
        if(value.length() == 0)
        {
            return value;
        }
        
        String sendingText = value.substring(1);
        return recursiveReverse(sendingText) + value.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(recursiveReverse("PEOPLE"));
    }
}
