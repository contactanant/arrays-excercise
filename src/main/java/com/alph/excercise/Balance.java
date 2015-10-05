package com.alph.excercise;

/**
 Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

 canBalance({1, 1, 1, 2, 1}) → true
 canBalance({2, 1, 1, 2, 1}) → false
 canBalance({10, 10}) → true
 */
public class Balance {

    public boolean canBalance(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        for (int index = 0; index < nums.length; index++) {
            if (sum(nums, 0, index) == sum(nums, index + 1, nums.length - 1)) {
                return true;
            }
        }
        return false;
    }

    private int sum(int[] intArray, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += intArray[i];
        }
        return sum;
    }
}
