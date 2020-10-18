package com.bekjanov.calc;

import java.util.Scanner;

/**
 * Принимает строку вводимую с терминала
 * <p>
 * version 1.0
 * author Alesha
 */
public class Receiver {
    private final Scanner scanner;

    public Receiver() {
        this.scanner = new Scanner(System.in);
    }

    public String getStringFromTerminal() {
        System.out.println("Введите пример: ");

        return scanner.nextLine();
    }
}
