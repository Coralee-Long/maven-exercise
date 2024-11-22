package com.neuefische;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println("Hello, World!");

        String asciiArt = FigletFont.convertOneLine("Hello, World!");
        System.out.println(asciiArt);
    }
    public static int sum(int a, int b) {
        return a + b;
    }
}