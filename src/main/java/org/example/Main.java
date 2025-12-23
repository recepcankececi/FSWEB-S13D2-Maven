package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        int original = Math.abs(number);
        int reversed = 0;
        int temp = original;

        while (temp > 0) {
            reversed = reversed * 10 + (temp % 10);
            temp /= 10;
        }

        return original == reversed;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String numStr = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numStr.length(); i++) {
            switch (numStr.charAt(i)) {
                case '0': result.append("Zero"); break;
                case '1': result.append("One"); break;
                case '2': result.append("Two"); break;
                case '3': result.append("Three"); break;
                case '4': result.append("Four"); break;
                case '5': result.append("Five"); break;
                case '6': result.append("Six"); break;
                case '7': result.append("Seven"); break;
                case '8': result.append("Eight"); break;
                case '9': result.append("Nine"); break;
            }
            if (i < numStr.length() - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
