package org.Task4;

/*
Разработайте программу, которая выбросит Exception,
когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение,
что пустые строки вводить нельзя.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(EnterString());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static String EnterString() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку ");
        String str = scanner.nextLine();
        scanner.close();
        if(str == "") throw new Exception("Ошибка: введена пустая строка!");
        return str;
    }
}