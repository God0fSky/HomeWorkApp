package ua.hillelit.homeworks.model;

import java.time.Year;
import java.util.Calendar;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        System.out.println("-".repeat(20));
        checkSumSign();
        System.out.println("-".repeat(20));
        printColor();
        System.out.println("-".repeat(20));
        compareNumbers();
        System.out.println("-".repeat(20));
        System.out.println(checkSum(5, -9));
        System.out.println("-".repeat(20));
        checkNumber(-1);
        System.out.println("-".repeat(20));
        System.out.println(checkNumberBool(0));
        System.out.println("-".repeat(20));
        printString("sdfgsdfg", 1);
        System.out.println("-".repeat(20));
        System.out.println(checkYear(2008));
    }

    public static void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 2;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else {
            if (value <= 100) {
                System.out.println("Желтый");
            } else System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 3;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    public static boolean checkSum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else return false;
    }

    public static void checkNumber(int num) {
        if(num < 0) {
            System.out.println("Число отрицательное");
        } else System.out.println("Число положительное");
    }

    public static boolean checkNumberBool(int num) {
        if(num < 0) {
            return false;
        } else return true;
    }

    public static void printString(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static boolean checkYear(int year) {
        return Year.of(year).isLeap();
    }

}
