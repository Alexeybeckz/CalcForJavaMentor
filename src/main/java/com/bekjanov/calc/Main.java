package com.bekjanov.calc;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Example example = example = new Example(receiver.getStringFromTerminal());

        System.out.println(example.result());
    }
}

