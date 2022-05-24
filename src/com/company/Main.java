package com.company;

import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
      File doc = new File("C:\\rico\\rico.txt");
            BufferedReader obj = new BufferedReader(new FileReader (doc));
            String strng;
            strng = obj.readLine();
            System.out.println(strng);


            //ПРИСВАИВАЕМ ПЕРЕМЕННЫЕ
            int a;
            int b;

            String op;//для ввода значкоа операции  применили в строку
            do {

                String[] strings = strng.split ("\\W");
                String[] operator = strng.split ("\\w");

                try {
                    a = Integer.parseInt (strings[0]);
                    b = Integer.parseInt (strings[1]);
                    op = operator[operator.length - 1];




                    PrintWriter operation = new PrintWriter ("C:\\rico\\ru.txt");//запись в блокнот(файл)
                    operation.println (operation (a, b, op));
                    System.out.println (operation (a, b, op));
                    operation.close ();
                    break;
                } catch (Exception e) {
                    System.out.println ("Ошибка ввода данных");
                }
            } while (true);

        }
        //КЛАСС С ОПЕРАЦИЯМИ
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
                return (int) Math.pow (a, b);
            } else if ("%".equals (op)) {
                return a % b;
            }
            return 0;
    }
}
