package com.bekjanov.calc;

public class Roman {

    public int parseInt(String romanNumber) {
        switch (romanNumber) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                throw new IllegalArgumentException("Неверная римская цифра");
        }
    }

    public String romanDigit(int n, String one, String five, String ten) {

        if (n >= 1) {
            if (n == 1) {
                return one;
            } else if (n == 2) {
                return one + one;
            } else if (n == 3) {
                return one + one + one;
            } else if (n == 4) {
                return one + five;
            } else if (n == 5) {
                return five;
            } else if (n == 6) {
                return five + one;
            } else if (n == 7) {
                return five + one + one;
            } else if (n == 8) {
                return five + one + one + one;
            } else if (n == 9) {
                return one + ten;
            }

        }
        return "";
    }

    public String parseRoman(int resultByArab) {
        String romanOnes = romanDigit(resultByArab % 10, "I", "V", "X");
        resultByArab /= 10;

        String romanTens = romanDigit(resultByArab % 10, "X", "L", "C");
        resultByArab /= 10;

        String romanHundreds = romanDigit(resultByArab % 10, "C", "D", "M");

        return romanHundreds + romanTens + romanOnes;

    }
}
