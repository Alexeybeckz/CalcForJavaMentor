package com.bekjanov.calc;

public class Verifier {
    public NumberType checkType(String[] values) {
        //проверка на тип принимаемого значения
        char[] arabNumbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9'}; //массив арабских цифр
        char[] romanNumbers = {'I', 'V', 'X'}; //массив  римских цифр


        //сопоставление введеных символов с массивом арабских цифр
        for (char s : arabNumbers) {
            if (s == values[0].charAt(0)) {
                for (char d : arabNumbers)
                    if (d == values[1].charAt(0)) {
                        return NumberType.ARABIC;
                    }
            }
        }


        //сопоставление введеных символов с массивом римских цифр
        for (char s : romanNumbers)
            if (s == values[0].charAt(0)) {
                return NumberType.ROMAN;
            }

        throw new IllegalArgumentException("Введен неверный символ");
    }

}
