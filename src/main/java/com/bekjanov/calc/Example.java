package com.bekjanov.calc;

public class Example {
    private final int firstValue;
    private final int secondValue;
    private final String operator;
    private final NumberType type;
    private final Roman roman;

    public Example(String example) {
        String[] values = example.split("[-+*/]");    //Записываем в массив значения из примера
        Verifier verifier = new Verifier();

        roman = new Roman();
        type = verifier.checkType(values);
        operator = getOperator(example);

        //Разделить по типам
        switch (type) {
            case ARABIC:
                firstValue = Integer.parseInt(values[0]);
                secondValue = Integer.parseInt(values[1]);
                break;

            case ROMAN:
                firstValue = roman.parseInt(values[0]);
                secondValue = roman.parseInt(values[1]);
                break;

            default:
                throw new IllegalArgumentException("Неверный тип");
        }

    }

    private String operation() {
        switch (operator) {
            case "+":
                return String.valueOf(firstValue + secondValue);

            case "-":
                return String.valueOf(firstValue - secondValue);

            case "*":
                return String.valueOf(firstValue * secondValue);

            case "/":
                return String.valueOf(firstValue / secondValue);

            default:
                throw new IllegalArgumentException("Неверный тип операции");

        }

    }


    private String getOperator(String example) {
        char[] operations = {'+', '-', '*', '/'};

        for (char symbol : example.toCharArray()) {
            for (char operation : operations) {
                if (symbol == operation) {
                    return String.valueOf(symbol);
                }
            }
        }

        throw new IllegalArgumentException("Неверный тип операции");
    }


    public String result() {
        String result = operation();

        //Если тип примера римский, вернуть ответ в римских цифрах
        if (type == NumberType.ROMAN) {
            result = roman.parseRoman(Integer.parseInt(result));
        }

        return result;
    }

}

