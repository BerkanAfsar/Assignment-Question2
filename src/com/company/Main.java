package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases");

        int numberOfTestCases = scanner.nextInt();

        for (int numberOfTestCase = numberOfTestCases; --numberOfTestCase >=0; ) {

            System.out.println("Enter the string");

            String input = scanner.next();

            solve(input);
        }
    }

    private static void solve(final String input) {

        int total = 0;

        final char[] inputArray = input.toCharArray();

        for (int index1 = 1; index1 < inputArray.length; index1++) {

            int count = 0;

            for (int index2 = index1; index2 < inputArray.length; index2++) {

                if (inputArray[index2 - index1] != inputArray[index2])
                    break;

                count++;
            }

            total += count;
        }

        System.out.println("Total similarity : " + (total + inputArray.length));
    }
}
