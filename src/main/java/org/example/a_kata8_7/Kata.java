package org.example.a_kata8_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static void main(String[] args) {
        long[] longs = {15, 28, 4, 2, 43};
        System.out.println(sumTwoSmallestNumbers(longs));

    }

    public static long sumTwoSmallestNumbers(long[] numbers) {
        Arrays.sort(numbers);
        return numbers[0]+numbers[1];
    }
}
