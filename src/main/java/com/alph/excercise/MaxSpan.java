package com.alph.excercise;

/**
 * Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements
 * between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

 maxSpan({1, 2, 1, 1, 3}) → 4
 maxSpan({1, 4, 2, 1, 4, 1, 4}) → 6
 maxSpan({1, 4, 2, 1, 4, 4, 4}) → 6
 */
public class MaxSpan {

    public int calculate(int[] intArray){
        if (intArray == null)
            return 0;
        if (intArray.length == 1)
            return 1;
        int maxSpan = 0;
        for (int index = 0; index < intArray.length; index++) {
            int span = findSpan(intArray, index);
            if (span > maxSpan) {
                maxSpan = span;
            }
        }
        return maxSpan;
    }

    private int findSpan(int[] intArray, int index) {
        int span = 1;
        for (int newIndex = index + 1; newIndex < intArray.length; newIndex++) {
            span = intArray[index] == intArray[newIndex] ? newIndex - index + 1 : span;
        }
        return span;
    }

}
