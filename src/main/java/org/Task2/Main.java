package org.Task2;

/*
Если необходимо, исправьте данный код
 */
public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("В массиве нет элемента с таким индексом!");
        } catch (NullPointerException e) {
            System.out.println("Массив не инициализирован!");
        }
    }
}
