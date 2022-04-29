package com.company;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        System.out.println ("ВВедите выражение");
        Scanner sc = new Scanner (System.in);
        int a;
        int b;
        String op;
        do {
            String input = sc.next ();
            String[] strings = input.split ("\\W");
            String[] operator = input.split ("\\w");
            try {
                a = Integer.parseInt (strings[0]);
                b = Integer.parseInt (strings[1]);
                op = operator[operator.length - 1];
                System.out.println ("Результат = " + operation (a, b, op));
            } catch (Exception e) {
                System.out.println ("Ошибка ввода данных");
            }
        } while (true);
    }
    private static double operation(double a, double b, String op) {
        if ("*".equals (op)) {
            return a * b;
        } else if ("+".equals (op)) {
            return a + b;
        } else if ("-".equals (op)) {
            return a - b;
        } else if ("/".equals (op)) {
            return a / b;
        } else if ("^".equals (op)) {
            return (int) Math.pow (a,b);
        }
        else if ("%".equals (op)) {
            return a % b;
        }
        return 0;
    }
}
