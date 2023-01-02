/*
* Complete the function that takes a non-negative integer n as input,
* and returns a list of all the powers of 2 with the exponent ranging from 0 to n ( inclusive ).
 */

import java.util.Arrays;

public class NumbersPractice {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(powersOfTwo(3)));
    }

    public static long[] powersOfTwo(int n){
        long[] arr = new long[n + 1];

        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            arr[i] = (long) (Math.pow(2, j));
        }

        return arr;
    }
}
