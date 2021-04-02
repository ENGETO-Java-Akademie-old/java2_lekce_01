package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();
        /*
        stack.push(4);
        stack.push(8);
        stack.pop();
        stack.push(9);
        stack.push(11);
        stack.pop();
        stack.pop();
        stack.pop();
        */
        Integer[] result = selectSort(new Integer[]{3, 8, 12, 5, 9, 44, 1, 2, 23});

        System.out.println(Arrays.toString(result));

    }

    private static Integer[] selectSort(Integer[] unsortedArray) {

        System.out.println("Velikost vstupu (n): " + unsortedArray.length);

        Integer[] result = new Integer[unsortedArray.length];

        System.out.println("Velikost pomocné struktury: " + result.length);

        int counter = 0;

        for (int i = 0; i < unsortedArray.length; i++) {

            Integer currentMinimum = null;
            Integer minimumPosition = null;

            for (int j = 0; j < unsortedArray.length; j++) {
                if (currentMinimum == null || (unsortedArray[j] != null && currentMinimum > unsortedArray[j])) {
                    currentMinimum = unsortedArray[j];
                    minimumPosition = j;
                }
                counter++;
            }

            result[i] = currentMinimum;
            unsortedArray[minimumPosition] = null;

        }

        System.out.println("Počet kroků: " + counter);

        return result;
    }

}
