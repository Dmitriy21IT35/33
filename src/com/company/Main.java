package com.company;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        //ВВод польз в консоль
        System.out.println ("ВВедите выражение");
        Scanner sc = new Scanner (System.in);
         //ПРИСВАИВАЕМ ПЕРЕМЕННЫЕ
        int a;
        int b;
        String op;//для ввода значкоа операции  применили в строку
        do {
            String input = sc.next ();
            String[] strings = input.split ("\\W");
            String[] operator = input.split ("\\w");
            try {
                a = Integer.parseInt (strings[0]);
                b = Integer.parseInt (strings[1]);
                op = operator[operator.length - 1];
                 PrintWriter operation = new PrintWriter ("C:\\rico\\ru.txt");//запись в блокнот файла полученный результат
                operation.println (operation (a, b, op));
                System.out.println ("Результат = " + operation (a, b, op));
                operation.close ();
            } catch (Exception e) {
                System.out.println ("Ошибка ввода данных");
            }
        } while (true);
    }
    //КЛАСС С ОПЕРАЦИЯМИ
    private static double operation(double a, double b, String op) {
        new Scanner (System.in);
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
