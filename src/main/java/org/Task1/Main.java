package org.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод
дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(EnterFloat());
    }

    public static Float EnterFloat() {
        float number = 0.0f;
        boolean flagOk;
        do {
            flagOk = false;
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите дробное число " +
                        "(для разделения целой и дробной части используйте запятую)");
                number = scanner.nextFloat();
                scanner.close();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Попробуйте снова!");
                flagOk = true;
            }
        } while (flagOk);
        return number;
    }
}
